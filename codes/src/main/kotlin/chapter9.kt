
interface Dialable {
    fun dial():Unit
}
interface Snapable {

    fun snap():Unit
}

class IPhone: Dialable {
    override fun dial() {
            println("some iphone dial");
    }

}

class Phone : Dialable {
    override fun dial() {
        println("some generic dial");
    }

}
class Camera : Snapable {
    override fun snap() {
    println("some snap");
    }

}

class Smartphone (
    private val phone: Dialable ,
    private val camera:Snapable
): Dialable by phone,Snapable by camera {


}



fun main(args:Array<String>) {
    val m = Smartphone(IPhone(),Camera());
    println(m.dial())
}
