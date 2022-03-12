package com.example.oopsbasics

import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import java.lang.IllegalArgumentException

/*
fun main(){
    //Here denis is the variable of datatype Person
    var denis = Person("Denis","Sharma")
    var john = Person()
    var johnPeterson = Person(lastName = "Chauhan")
    var bhawna = Person(firstName = "Bhawna")

}
class Person constructor(firstName: String = "John", lastName: String = "Doe"){

    //initializer block
    init{
        println("Initialised a new Person object with " +
                "firstName = $firstName and lastname = $lastName")

    }

}

 */
/*
//Exercise question
fun main(){
    val phone = MobilePhone()
}
class MobilePhone(osName:String="Android",brand:String="Samsung",model:String="S20 Ultra"){
    init{
        println("$brand Galaxy $model ")
    }
}

 */
/*
//Member Variable - Function And Constructor
fun main(){
    //Here denis is the variable of datatype Person
    //Creating instance of class
    var denis = Person("Denis","Sharma")
    denis.StateHobby()
    //If i want to change the hobby of the person
    denis.hobby = "Skating on skateboard"
    denis.StateHobby()
    var john= Person()
    john.hobby = "play video games"
    john.StateHobby()
    var bhawna = Person("Bhawna","Sharma",22)


}
class Person constructor(firstName: String = "John", lastName: String = "Doe"){

    //Member Variables - Properties
    var age : Int ?= null //----------(1)
    var hobby : String = "Watching Netfix"
    var firstname:String ?= null
    //initializer block
    init{
        this.firstname = firstName
        println("Initialised a new Person object with " +
                "firstName = $firstName and lastname = $lastName")

    }

    //Member secondary Constructor
    constructor(firstName: String,lastName: String,age:Int):this(firstName,lastName){//Here it takes firstname and lastname from primary constructor
        this.age = age //It means it take th age from equation 1 in this class primary constructor
        println("Initialised a new Person object with " +
                "firstName = $firstName and lastname = $lastName"+
             "And age is $age")

    }
    //Member Function - Methods
    fun StateHobby(){

        println("$firstname \'s hobby is $hobby")

    }
}

 */
/*
fun main(){
    var myCar = Car()
    myCar.owner
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 91
    println("Maxspeed is ${myCar.maxSpeed }")

    println("Model is ${myCar.myModel}")

}
class Car(){
    // we use lateinit if we initialise it later whenever it need
    lateinit var owner: String
    val myBrand: String = "BMW"
    //custom getter
    get(){
        return field.lowercase()
    }

    //Creating variable maxSpeed
    var maxSpeed:Int = 250
         get() = field         //This is the default code made  when we just create the variable

        //if you want to check the value is greater or not
         set(value){
             field = if(value > 0) value  else throw IllegalArgumentException("Max Speed can't be less than zero")
         }

    var myModel :String = "M5"
     private set //this means it is only available in this class



    init{
        this.owner = "BHAWNA CHAUHAN"
    }
}
*/
/*
//Data class
data class User(val id: Long,val name:String)
fun main(){
    val user1 = User(1,"Denis")
    val name = user1.name
    println(name)
    //If you want to change the value you can't bcz it is val
    //user1.name = "BHawna" //here it will give you error

    val user2 = User(1,"Denis")
    println(user1.equals(user2))

    println(user1 == user2)

    println("User Details:$user1 ")

    val updatedUser = user1.copy(name="BHawna chauhan")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) //Print 1
    println(updatedUser.component2()) //prints Bhawna chauhan

}

 */
// Inheritance is one of the main concepts of
// Object Oriented Programming (OOP).
///It allows a class to inherit features
//(properties and methods) from another class and reuse them.
// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class , and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.
// All the classes in Kotlin inherit from a class called Any. It corresponds to the Object class in Java.
// Every class that you create in Kotlin implicitly
// inherits from Any -

class Person // Implicitly inherits from the default Parent class - Any
// The Any class contains three methods toString(),
// equals() and hashCode().
// All classes in Kotlin inherit these three methods
// from Any, and can override them in order to
// provide their own implementation.

// Base class (Super class)
open class Vehicle {
}

/* Derived class (Sub class)
class Car: Vehicle() {
}
*/

// notice the keyword open. All classes in
// Kotlin are final by default (non-inheritable),
// so you need to use the open Keyword to make a
// class inheritable

/* Parent class
open class Car(val name: String,
               val brand: String) {
}*/

/* Child class (initializes the parent class)
class ElectricCar(name: String,
                  brand: String,
                  val batteryLife: Double) : Car(name, brand) {

}

// In case there is no primary Constructor
class ElectricCar : Car {
    val batteryLife: Double

    // Calls super() to initialize the Parent class
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }

    // Calls another constructor (which calls super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {

    }
}

 */

//-------------------------------------
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

open class Car(val name: String, val brand: String) {
    // open so it can be overriden by inhereting classes
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {

    var chargerType = "Type1"
    // in KM
    override var range = batteryLife/6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
}

fun main(args: Array<String>){
    var audiA3 = Car("A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)

    // Polymorphism is the ability to treat objects
    // with similar traits in a common way
    audiA3.drive(200.0)
    // Only works because ElectricCar is a Subclass of Car
    // Or alternativly works if Car was a Interface and Electriccar would inherit from it
    teslaS.drive(200.0)
}




