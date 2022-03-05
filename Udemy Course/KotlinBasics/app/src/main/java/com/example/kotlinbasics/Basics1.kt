package com.example.kotlinbasics

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

}