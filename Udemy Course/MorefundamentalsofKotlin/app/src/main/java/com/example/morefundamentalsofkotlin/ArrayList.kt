package com.example.morefundamentalsofkotlin
/*
fun main(){
    //empty arraylist
    val arrayList = ArrayList<String>() //creatinf an empty arraylist
    arrayList.add("One")             //Adding an object in arrayList
    arrayList.add("Two")
    println("___print ArrayList____")
    for(i in arrayList){
        println(i)
    }

    //Now arrayList using collections
    val arrayList1: ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)
    println(".......print Araylist.........")

    //filled element in Arraylist using collections
    val itr=arrayList.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }
    println("size of arraylist =" + arrayList.size)
}

 */
/*
fun main(){
    val arrayList : ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    for(i in arrayList){
        println(i)
    }
    println("______arrayList.get(1)_______")
    println(arrayList.get(1))
}

 */
fun main(){
    //Exercise = write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers. Please use a for (in) loop in this exercise.
    val number:ArrayList<Double> = ArrayList<Double>()
    number.add(12.3)
    number.add(35.1)
    number.add(21.0)
    number.add(76.2)
    number.add(22.4)
    var sum:Double = 0.0;
    for(i in number){
        sum += i
    }
    println("Average of sum of ${number[0]} , ${number[1]} , ${number[2]} , ${number[3]} , ${number[4]} =  ${sum/number.size}")
}
