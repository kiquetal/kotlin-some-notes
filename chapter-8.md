#### Chapter 8 - Kotlin cookbook

    
    Class delegate: Used to replace inheritance with composition,
    think in a wrapper and contained object (smartphone, with (camera+phone))

```
class Smartphone (
   private val phone: Dialable: Phone(),
   private val camera: Snapable: Camera()
   ): Dialable by Phone,Snapable by Camera
   
```



