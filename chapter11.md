#### Chapter 11


Using `operator invoke` if you have a class with only one method


```kotlin
class MyFunc {


    operator invoke(url:String) {
        println("invoke or do something with $url)
    }

}
val m=MyFunc();
m();
```

For DSL we could mix with the companion object to obtain something fancy

```kotlin

class startApp{

    val data="my Precious"
    companion object {

        operator fun invoke(s:startApp.()->Unit) {

            startApp().s()
            // startApp().apply(s)
        }
    }
}

startApp {
    println("what is this)
}

```

[someExample](./codes/src/main/kotlin/chapter11.kt)