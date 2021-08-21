package chapter9;

import java.io.BufferedReader
import java.io.File
import java.util.function.Consumer

class chapter9 {

}
fun main(args:Array<String>)
{
    val toWrite = File("hola.txt");

    toWrite.printWriter().use { toWrite->
          toWrite.println("hola+que hay");
          toWrite.println(String.format("%s %s","esto es asi: ","vamos"))
    }

    toWrite.bufferedReader().forEachLine { println(it) }
    toWrite.bufferedReader().lines().forEach { s -> println(s) }

    toWrite.bufferedReader().use { bufferedReader: BufferedReader ->
        bufferedReader.lines().forEach { println(it) } }

}
