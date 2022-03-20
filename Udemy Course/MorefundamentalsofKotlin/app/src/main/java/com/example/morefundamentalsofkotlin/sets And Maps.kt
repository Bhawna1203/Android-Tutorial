package com.example.morefundamentalsofkotlin

fun main(){
    //Sets is similar as in C++ = it counts duplicate element as one
    val fruits = setOf("Orange","Apple","Mango","Grapes","Apple","Mango")
    println(fruits.size)
    println(fruits)
    //This will sort the set of array
    println(fruits.toSortedSet())
    //Here main problem is that it is not mutable

    val newfruits = fruits.toMutableList()
    newfruits.add("Watermellon")
    newfruits.add("Pear")
    println(newfruits)
    println("fruit at index 4 is ${newfruits.elementAt(4)}")

    //Now look into Map
    //here i created map of number and string
    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(daysOfTheWeek[2])

    //for printling all elements
    for(key in daysOfTheWeek.keys){
        println("$key is to ${daysOfTheWeek[key]}")
    }
   val fruitsMap = mapOf("Favorite" to fruit("Grape",2.5)
       ,"ok" to fruit("Apple",1.0)
   )

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thrusday"
    newDaysOfWeek[5] = "Friday"
    newDaysOfWeek[6] = "Saturday"
    println(newDaysOfWeek.toSortedMap())


}
data class fruit(val name:String,val price:Double)