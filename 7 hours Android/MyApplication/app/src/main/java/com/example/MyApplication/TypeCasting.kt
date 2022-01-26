package com.example.MyApplication

import kotlin.math.floor

fun main(){
    val stringList: List<String> = listOf(
        "Denis","Frank","Michael","Garry")
    val mixedTypeList: List<Any> = listOf(
        "Denis",31,5,"bday",70.5,"weight","kg"
    )

    for(value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with floor value ${Math.floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown type")
        }
    }

    //smart cast
    val obj1:Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        //obj is automatically cast to a string in this scope
        println("Found a String of length ${obj1.length}")
    }

    //explicit (unsafe) castng using the "as" keyword - can go wrong
    val str1 :String = obj1 as String
    println(str1.length)

    val obj2:Any = 1337
  //  val str2:String = obj2 as String
  //  println(str2)

    //explicit safe casting using "as?" keyword
    val obj3: Any = 1337
    val str3:String?= obj3 as? String //works
    println(str3)           //print null


}