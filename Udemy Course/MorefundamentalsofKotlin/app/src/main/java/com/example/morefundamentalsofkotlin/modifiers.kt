package com.example.morefundamentalsofkotlin

//Syntax of Public Modifier
public class Example{

}
class Demo{

}
public fun hello()
fun demo()
public val x=12
val y =10

//Syntax Private Modifers
internal class Example{
    internal val x =1
    internal fun doSomething(){

    }
}
internal val y = 10
//In the class Example ,val x and function doSomething() are declared as private .
//The class "Example" is accessible from the same source file, "val x" and "fun doSomething()"
//are accessible within Example class.

open class Base {
    protected val i =0
}
class Derived : Base(){
    fun getValue(): Int{
        return i
    }
}
open class Base{
    open protected val i = 5
}

class Another : Base(){
    fun getValue(): Int{
        return i;
    }
    override val i =10
}