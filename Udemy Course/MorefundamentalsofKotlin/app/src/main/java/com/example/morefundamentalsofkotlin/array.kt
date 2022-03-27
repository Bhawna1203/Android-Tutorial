package com.example.morefundamentalsofkotlin

fun main(){
    //In descriptive way
    //val numbers:IntArray = intArrayOf(1,2,3,4,5,6,7)

    //In one more way
    //val numbers = intArrayOf(1,2,3,4,5,7,8,9)

    //In simple you can write in this way
    val numbers = arrayOf(1,2,3,4,5,5,67,78)
  //  println(numbers )// =>This prints [Ljava.lang.Integer;@1cd072a9 instead of Numbers

    //println("initial values ${numbers.contentToString()}")
    /*
    for(element in numbers){
        print(" ${element+2}" )
    }

     */

    /*
    //Here understand how i can access elements in array + Updation
    numbers[0] = 11
    numbers[1] = 33
    numbers[2] = 76
    numbers[3] = 88
    numbers[4] = 44
    println("Final values ${numbers.contentToString()}")

     */


    //You can also do this with doubles too
     val days = arrayOf("Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday")
   // println(days.contentToString())

    val fruits = arrayOf(
        Fruit("Apple",2.45),
        Fruit("ORANGE",233.3)
    )
   // println(fruits.contentToString())

    //How to access the same
    for(fruit in fruits){
       // println("${fruit.name} ")
    }
    for(index in fruits.indices){
       // print("${fruits[index].name} is in index $index \n")
    }

    val mix = arrayOf("Sunday","Monday",23,67,"hey",45.67)
    println(mix.contentToString())
    
    //FINALLY LEARNING MORE AND MORE 

}

data class Fruit(val name:String,val price:Double)
