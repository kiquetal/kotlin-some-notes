class Smartphone (
    private val phone: Dialable: Phone(),
    private val camera: Snapable: Camera()
): Dialable by Phone,Snapable by Camera

interface Dialable {
    fun dial():Unit
}
interface Snapable {

    fun snap():Unit
}

val m = Smartphone();
