package com.example.newconcept

/*
Feature of Lanbdas Function
- Simple and Concise
- Function with no name
- Functions as Parameter
 */
/*
Syntax for the same is:
        variable:(parameter) -> return type
 */
class Lambdas {
    /*
    Example of Lambda Example as a Parameter
    sum:(result:Int) -> Unit

     */

}
/*
As a class Constructor Parameters
class Arithmatic(val sum:(result:Int)->Boolean){
       init{
        sum(5)
       }
 }
 */

/*
Trigger a lambda
Using invoke:

button.setOnClickListener{
sum.invoke(5)
}
 */


/*
Passing Argument to a Lambda
Arithmatic({result ->
      if(result > 5){
           print(result)
           true
      }
      else{
          print(false)
          false
      }

  })
 */


/*
Pass in a Method

fun operation(result:Int):Boolean{
       if(result > 5){
            print(result)
            return true
       }
       else{
           print(false)
           return false
       }
    }
    Arithmatic({result -> operation(result)
})
 */