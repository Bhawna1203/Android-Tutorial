package com.example.morefundamentalsofkotlin

/*
//It is simple problem
fun addNumbers(a:Int,b:Int) {
    val add =  a+b;
    println(add)
}
fun main(){
    addNumbers(4,5)
}

 */
//Lambda expression
val sum:(Int,Int) -> Int = {a:Int,b:Int -> a+b}
fun main(){
    println(sum(10,5))
    println(sum1(10,5))
}
//even shorter
val sum1 = {a:Int,b:Int -> println(a+b)}