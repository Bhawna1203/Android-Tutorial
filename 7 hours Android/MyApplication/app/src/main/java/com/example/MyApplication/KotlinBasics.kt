package com.example.MyApplication

import kotlin.io.print as print1

/*
fun main(){
    val myName = "Bhawna"
    //myName = "franchise"
    print("Hello $myName \n What are you doing")

    print("\n-------------------Here we are learning DataTypes-------------\n")
    //Integer types: Byte (8 bit),Short (16 bit),
    //Int(32 bit),Long(64 bit)
    val myByte: Byte = 13
    val myShort:Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_123_1234

    //floating point number types:Float(32bit),Double(64bit)
    val myFLoat=13.37f
    val myDouble: Double = 3.141617232827192093

    //Boolean the type boolean is used to represent logical values
    //it can have the two possible values true or false
    var isSunny:Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Helllo world"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("\n FirstCharacter $firstCharInStr")
    print("\n LastCharacter $lastCharInStr")


    //Arithmatic Operators(+,-,*,/,%)
    print("\n----------Now we are learning operators----------\n")
    var result = 5+3
    print("\n5+3 = $result")
    result = 8
    print("\nOverridded Result = $result")
    result = 15%2 //this gives remainder
    print("\n15%2 = $result")
    val a=5
    val b=3
    result = a/b //this gives also integer because a and b is also integer
    print("\n5/3 = $result") //it gives the divident


    //If there is a type match between the numbers then you need
    //to change the type of number
    val c=4
    val d=3.5
    result = (c/d).toInt()
    print("\n4/3.5 = $result")

    print("\n-------Comparison Operator--------\n")
    //comparison operators (==,!=,<,>,<=,>=)
    val isEqual = 5 == 5
    print("\nIs 5==5 = $isEqual")

    val isNotEqual = 5!=5
    print("\nIs 5!=5 = $isNotEqual")

    print("\nIs -5<3 = ${-5<3}")
    print("\nIs 5<=3  = ${5<=3}")
    print("\nIs 5>=5 = ${5>=5}")


    print("\n-----------Assignment Operator------------\n")
    //assignment operators (+=,-+,*=,/=,%=)
    var mynum = 5
    mynum += 3
    print("\n mynum+=3 = $mynum")
    mynum -= 3
    print("\n num-=3 = $mynum")
    mynum *= 3
    print("\n num*=3 = $mynum")


    print("\n-----------Increment and Decreament Operator------------\n")
    //assignment operators (+=,-+,*=,/=,%=)
    var myNum = 5
    print("\n myNum = $myNum")
    print("\n myNum++ = ${myNum++}")
    print("\n ++myNum = ${++myNum}")
    print("\n myNum-- = ${myNum--}")


    print("\n-----------If Statement------------\n")

    var heightPerson1 = 170
    var heightPerson2 = 170

    if(heightPerson1 > heightPerson2){
        print("\n Use raw force")
    }
    else if(heightPerson1 == heightPerson2){
        print("Have a great day")
    }
    else{
        print("\n you did something wrong ")
    }

    print("\n----------- More in 'if' statement ------------\n")
    var name = "Bhawna"
    if(name == "Bhawna"){
        print("\n Welcome Home")
    }
    else{
        print("\n Who are you ?")
    }

    var age = 22
    if(age >= 21){
        print("\n You can drink")
    }
    else if(age >= 18){
        print("\n You are drink now")
    }
    else if(age >= 16){
        print("\n Have a great day")
    }
    else{
        print("\n As of now you are so younger so you can't drink")
    }

    print("\n----------- When statement ------------\n")
    var month = 3
    when(month){
        in 3..5 -> print("\nSpring")
        in 6..8 -> print("\nSummer")
        in 9..11 -> print("\nFall")
        in 12..2 ->print("\nWinter")
        else -> print("Invalid Season")
    }

    print("\n Your selected month = $month")


    when(age){
        !in 18..150 -> print("\nYou can drive")
        in 1..18 -> print("\nYou can drive but on intructions")
        in 1..15 ->print("\n As of new you can't drive")

    }

    var x :Any = 13.37f
    when(x){
        is Int -> println("\n $x is an Int")
        !is Double -> print("\n $x is a Double")
        is String -> print("\n $x is a String")
        else -> print("\n $x is not in one of the above")
    }

    print("\n-------------- Now we are looking into loop statement -------------\n")
    var hey:Int = 1
    //while loop first
    while(hey <= 10){
        print("$hey\n")
        hey++
    }
    print("While loop is done\n")
    //printing 1009998 ---
    var n:Int = 100
    while(n>=0){
        print("$n")
        n-=2;
    }
    print("\nNow print all the numbers\n")

    print("\n-----------DO WHILE LOOP-----------\n")
    var e:Int =15
    do{
        print("$e")
        e++;
    }while(e<=10)
    print("\n Do while loop is done")


    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++;
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("\n It id comfy now")
        }
    }


    print("\n----------- Now For loop --------------\n")
    for(num in 1..10){
        print(" $num")
    }
    print("\n")
    for(i in 1 until 10){  //in this last variable is not included
        print(" $i")
    }
    print("\n")
    for(i in 10 downTo 1 step 2){
        print(" $i")
    }
*/
/*
fun main() {
    print("\n------------ Learning Function ---------\n")
    myFunction()
    myFunction()
    var result: Int
    //argument
    result = addUp(2,3)
    print("\n $result")

    print("\n------------ Divide ----------------\n")
    var result1:Double
    result1 = average(2.3,4)
    print("\n $result1")
}
//Method is a function within a Class
//parameter
fun addUp(a:Int,b:Int) :Int{
     return a+b
}
fun average(a:Double,b:Int): Double {
    return (a+b)/2;
}

fun myFunction(){
    print("\n Have a great day cutie!!!")
}
 */

/*fun main(){
    print1("\n --------------- Learning Nullable ----------------- \n")
    var name :String = "Denis"
  //  name = null -> Compilation error

    var nullableName : String? = "Bhawna"
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }
/*
    THis works in the same way like this peace of code
    if(nullableName != null){
         var len2 = nullableName.length
    }
    else{
       null
    }
    */
}
*/

fun main(){
    println("\n ---------------- This one is for Nullables and the elvis operator --------------- \n")
    var nullableName : String? = "Bhawna"
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    //?: Elvis operator
    val name = nullableName ?: "Guest"
   // println("name is $name")

    println(nullableName!!.toLowerCase())


}

