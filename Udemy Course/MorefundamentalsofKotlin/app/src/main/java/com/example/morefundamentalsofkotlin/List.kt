package com.example.morefundamentalsofkotlin

fun main(){
    val months = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    //println(anyTypes.size)
   // println(months[1])
 /*
  //This one is for printing the list
    for(month in months){
        println(month)
    }
  */
    //Here as we all know list is mutable so you can't add new item you can do it just by using unmutable list
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April","May","JUne")
    additionalMonths.addAll(newMonths)
    println("Before =  $additionalMonths")

    //If you want to add more you can do
    additionalMonths.add("July")
    println("After =  $additionalMonths")

    //If you know in future you need to add the element then use mutablelist
    val days = mutableListOf<String>("Mon","Tues","Wed","Thu")
    days.add("fri")
    println("Original one $days")

    //You can update the value to
    days[3] = "Friday"
    println("After applying Changes $days")

    //If you want to remove the item you can do in this way
    days.removeAt(3)
    println("After removing the element at 3 is $days")

    //for deleting all the items
    val removeList = mutableListOf<String>("Mon","Tues","Wed","Thu","fri")
    /*days.removeAll(removeList) or*/  days.removeAll(days)
    println(days)




}