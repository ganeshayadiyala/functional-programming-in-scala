package com.ganesh.functions

/**
 * Created by ganesh on 30/1/17.
 */

object HigherOrderFunctions {

  //function taking a function as a parameter
  def sum(f: (Int,Int) => Int, x:Int, y:Int): Int = {
    f(x,y)
  }

  //function returning function as a result
  def saySomething(prefix:String) : String => String  = (name:String) =>{
    prefix+" "+name
  }

  def main(args: Array[String]) {

    val sumOfIntegers = sum((x,y)=>x+y,10,20)

    val sumOfSquaresOfIntegers = sum((x,y) => (x*x) + (y*y),2,3)

    println("sum of 10 and 20 is "+sumOfIntegers)

    println("sum of square of 2 and square of 3 is "+sumOfSquaresOfIntegers)

    val greetings = saySomething("Hello")
    val greetHarris = greetings("Harris")
    val greetChris = greetings("Chris")

    println(greetHarris)
    println(greetChris)

  }
}
