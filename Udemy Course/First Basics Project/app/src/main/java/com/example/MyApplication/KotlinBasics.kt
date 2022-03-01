package com.example.MyApplication

import android.app.backup.BackupAgent
import java.lang.IllegalArgumentException
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
/*
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
 */

/*
fun main(){
    println("\n-------------------- Learning Classes and object ---------------------")
    var bhawna =Person("Bhawna")
    var mayank=Person()
    var bhumika=Person(lastName = "Chodhary")

}

class Person(firstName: String = "John", lastName: String = "Chauhan"){

    //Initializer Block
    init {
        println(" Initialized a new person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
}
*/
/*
fun main(){
    kotlin.io.print("\n --------------------Learning scope of a parameter--------------------- \n")
    myFunction(5)

}
fun myFunction(a:Int){ //here 'a'  is a variable
    var a = 4 //here 'a' is a parameter
    println("a is $a")
}
 */
/*
fun main(){
    println("\n-------------------- Learning Member Variables and properties ---------------------")
    var bhawna =Person("Bhawna","Chauhan,19")
    var mayank=Person()
    var bhumika=Person(lastName = "Chodhary")

    kotlin.io.print("\n--------------Here using member variables-------------\n")
    bhawna.age = 19
    println("\nbHAWNA IS ${bhawna.age} years old\n")
    bhawna.stateHobby()
    kotlin.io.print("\n")
    bhawna.hobby="SkateBoard"
    bhawna.stateHobby()

    kotlin.io.print("\n")
    mayank.hobby = "Play video games"
    mayank.stateHobby()

}

class Person(firstName: String = "John", lastName: String = "Chauhan"){
     //Member Variables - Properties
    var age :Int ? = null
    var hobby :String = "watch Netflix"
    //Initializer Block
    init {
        println(" Initialized a new person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
    //member secondary Constructor
    constructor(firstName: String,lastName: String,age :Int)
              :this(firstName,lastName){
          this.age = 13

    }

    //Member functions -Methods
    fun stateHobby(){
        kotlin.io.print("My hobby is $hobby")
    }
}
*/
/*
fun main(){
    kotlin.io.print("\n------------------- Learning Lateinit,getter and setter ----------------\n")
    var myCar = Car()
    myCar.owner
    myCar.myBrand
    kotlin.io.print("brand is : ${myCar.myBrand}")
    println("\nMaxspeed is ${myCar.maxSpeed}")

    println("\n Model is ${myCar.myModel}")

}
class Car(){
    lateinit var owner: String
    val myBrand: String = "BMW"
        //custom getter
    get(){
        return field.toLowerCase()
    }
    var maxSpeed:Int = 250
        get() = field
        set(value){
            field = if(value > 0) value else throw IllegalArgumentException("Value can't be less than 0")
        }

    var myModel:String = "MS"
          private set
    init {
        this.myModel = "M3"
        this.owner = "Bhawna"
    }
}
*/
/*
//Data class must have one data member otherwise it gives an error
data class User(val id:Long,var name:String)
fun main(){
    println("\n----------------- About Data Class -----------------\n")
    val user1 = User(1,"Bhawna")
    val name = user1.name
    println(name)
    user1.name = "Mayank chauhan"


    val user2 = User(2,"Bhumika chauhan")
    println(user1.equals(user2))

    println("User Datails: $user1")

    val updatedUser = user1.copy(name="Denis panjuta")
    println(user1)
    println(updatedUser)

    println(" First data is ${updatedUser.component1()}") //print first argument
    println("Second data is ${updatedUser.component2()}")//print second argument

    val(id) = updatedUser
    println("id is ${id}")

}
 */

/*
fun main(){
    println("\n ---------------- Here we are learning Inheritance --------------- \n")
    var audiA3 = Car("A3","Audi")
    var teslaS = ElectricCar("S-Model","Tesla",85.0)

    var obj1:Any
    teslaS.extendRange(50.5)
    audiA3.drive(200.0)
    teslaS.drive(200.0)
    teslaS.drive()

}
//Inheritance
//The class that inferits the features id another class
//is called the sub class or chils class or
//derived class,and the class whose features are
//inherited ia called the super class or parent class or
//Base class

//super class ,parebt child,base class
open class Car(val name:String,val brand:String){ //we use use to make its properties inherit by others
       //properties
       //methods

    open var range: Double = 0.0
     fun extendRange(amount:Double){
         if(amount > 0){
             range += amount
         }
     }
     open fun drive(distance: Double){
        println("Drove for $distance km")
    }

}
//sub class child class or derived class of vehicle
class ElectricCar(name:String, branc:String,batteryLife:Double)
    :Car(name,branc){

        override var range = batteryLife * 6


        override fun drive(distance: Double){
            println("Drove for $range km on electricity")
        }

        fun drive(){
            println("Rove for $range km on electricity")
        }



    }

 */
/*
interface Drivable{

    abstract var chargeType: String
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

open class Car(override val maxSpeed: Double,
               val name:String, val brand:String, override var chargeType: String
): Drivable{ //we use use to make its properties inherit by others
    //properties
    //methods

    open var range: Double = 0.0
    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }
    open fun drive(distance: Double){
        println("Drove for $distance km")
    }

}
class ElectricCar(maxSpeed: Double,name:String, branc:String,batteryLife:Double)
    :Car(maxSpeed,name,brand = "hey",chargeType = "hello"){

    override var range = batteryLife * 6


    override fun drive(distance: Double){
        println("Drove for $range km on electricity")
    }

    override fun drive(): String{
        return "Rove for $range km on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake nside of electric car")
    }



}
fun main(){
    println("\n ---------------- Here we are learning interfaces --------------- \n")
    var audiA3 = Car(200.0,"A3","Audi","WhatsApp")
    var teslaS = ElectricCar(250.0,"S-Model","Tesla",85.0)


    teslaS.extendRange(50.5)

  //  audiA3.drive(200.0)
    teslaS.brake()
    audiA3.brake()

    audiA3.drive(200.0)
    teslaS.drive(200.0)


}

 */
/*
An abstract class cannot be instantiated you cannot create object of an abstract class
homeever you can inherit subclasses from an an=bstract class. The memebers (properties and methods)
of an abstract class are non abstract unless you explicitly use the abstract keyword to makethem abstract
 */
abstract class mammal(private val name:String,private val origin: String,private val weight: Double){
    //abstract property(must be overridden by subclass
    abstract var maxSpeed: Double
    //abstract methods (must be implemented by subclasses)
    abstract fun run()
    abstract fun breath()

    fun displayDetails(){
        println("Name : $name, Origin: $origin, Weight: $weight," + "Max speed: $maxSpeed")
    }
}

class Human(name:String, origin: String, weight: Double,
            override var maxSpeed: Double):mammal(name,origin, weight){
 //here learn inheritance so that do something good
                override fun run(){
                    //code to run
                    println("Run on two legs")
                }

                 override fun breath() {
                     //code to breath
                     println("Breath through mouth or nose")
                }

            }

class Elephant(name: String,origin: String,weight: Double,
               override var maxSpeed: Double):mammal(name,origin,weight){

    override fun run() {
        //code to run
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }

}
fun main(){
    println("\n-------------For abstract Classes-------------\n")
    val human = Human("Dennis","Russia",70.0,28.0)
    val elephant = Elephant("Rosy","India",5400.0,25.0)
  //  val mammal = mammal("Dennis","Russia",70.0,28.0)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}







