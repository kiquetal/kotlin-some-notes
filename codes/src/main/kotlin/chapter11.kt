package chapter11
class chapter11 {
}
class MyFunc {
    operator fun invoke(url:String)
    {
        println("do something wiht ${url}")
    }
}

class myF {
    lateinit var value:String
    companion object {
        operator fun invoke(f:myF.()->Unit ) {
            val n = myF().apply(f)
            // println(n.runSomeString())
            f(myF())

        }
    }
    fun runSomeString(s:String="some binding")= "recibi ${value}-${s}"
}

fun main(args:Array<String>)
{
    val m=MyFunc()
    m("http://mygoal");

    myF {
        value="myData"
        println(runSomeString())
        println("que hay")
    }
}
