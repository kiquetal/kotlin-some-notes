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
    companion object {
        operator fun invoke(f:String.()->String ) {
            val r =f(String())
            var m = String().f().uppercase()
            println("some black magic and ${r}");
            println(m)
        }
    }
}

fun main(args:Array<String>)
{
    val m=MyFunc()
    m("http://mygoal");

    myF {
        "it looks like a constructor"
    }
}
