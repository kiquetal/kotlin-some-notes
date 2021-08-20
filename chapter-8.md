#### Chapter 8 - Kotlin cookbook

 
 Class delegate: Used to replace inheritance with composition,
 think in a wrapper and contained object (smartphone, with (camera+phone))

```
class Smartphone (
   private val phone: Dialable: Phone(),
   private val camera: Snapable: Camera()
   ): Dialable by Phone,Snapable by Camera
   
```

Using the `delegation` we
could have dynamic implementation on the base class and is a sugar syntax to create the overriden methods in the derived class.

We can see the usage in the following example:

[chapter9](./codes/src/main/kotlin/chapter9.kt)


We can override some third-party library's method too


[chapter9part2](./codes/src/main/kotlin/chapter9part2.kt)



  



