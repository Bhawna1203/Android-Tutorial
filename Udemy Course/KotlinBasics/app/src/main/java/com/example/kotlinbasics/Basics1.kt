package com.example.kotlinbasics
/*
fun main(){
    //Now learning datatype
    //string type
    var myName = "DENIS"
    //type int 32 bits
    var myAge = 31
    //Integer types : Byte (8 bits),Short(16 bits),
    //Int(32 bits),Long(64 bits)
    val myByte: Byte = 13
    val myShort: Short = 1334
    val myInt: Int = 123445
    val myLong: Long = 12_33345543_111113

    //Floating Point NUmber types : Float(32 bits), Double(64 bits)
    val myFloat: Float = 13.47f
    val myDouble: Double = 13.2345596842342844444440

    //Booleans the type Boolean s used to represent logical values.
    //It can have two possible values true and false
    var isSunny: Boolean = true
    isSunny = false

    //characters
    val letterChar = 'A'
    val digitChar = '$'

    //Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("----First character of String is-----" + firstCharInStr + "---- Last Character of string is ----" + lastCharInStr)


    print("Hello " + myName)

    // Exercise of Variables
 //   var x:String = "Android Masterclass"
 //   var y:Float = 13.37F
  //  var z:Double = 3.14159265358979
 //   var w:Short = 25
  //  var w1:Int = 2020
   // var w2:Long = 18881234567
  //  var w3:Boolean = true

 }

 */

/*
//String Interpolation
fun main(){
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    //In the below code $ indication with letters is known as string interpolation
    print("First character $firstCharInStr and the length of myStr is ${myStr.length}")

}
*/

/*

fun main(){
    //Arithmatic operators(+,-,*,/,%)

    val a = 5
    val b = 3
    var result = a+b
    print(result)

    result = a-b
    print(result)

    result = a/b
    print(result)

    result = a%b
    print(result)

}

 */
/*
fun main(){
    //Now Comparison Operators(==, != , < ,> , <= , >=)
    println("is 5 is equal to 5 ${5 == 5}")
    println("is 5 is notEqual to 5 ${5 != 5}")
    println("is 5 is greaterEqualTo to 5 ${5 >= 5}")
    println("is 5 is lessThanEqualTo to 5 ${5 <= 5}")
    println("is 5 is Greater to 5 ${5 > 5}")
    println("is 5 is LessThan to 5 ${5 < 5}")

}
 */
/*
fun main(){
    //Assignment Operators(+=,-=,*=,/=,%=)
    var myNum = 5
    myNum += 3
    println(myNum)
    myNum -= 2
    println(myNum)
    myNum *= 4
    println(myNum)
    myNum /= 5
    println(myNum)
    myNum %= 3
    println(myNum)

    //Increment and decrement operators (++, --) - prefix and postfix operators
    myNum++
    println("muNum is $myNum")
    println("muNum is ${myNum++}")
    println("muNum is ${++myNum}")


}
*/
/*
fun main(){
    //create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")
}

 */

fun main(){
    // Control Flows
    // If Statements
    var age = 17
    if(age >= 21){
        print("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age >= 18){
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16){
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        print("you're too young")
    }

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}