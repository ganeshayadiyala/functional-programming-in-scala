package com.ganesh.functions

/**
 * Created by ganesh on 30/1/17.
 */

import scala.annotation.tailrec

object TailRecursion {
  //Normal recursion (if you put tail recursion notation then it will lead to compilation error)
  //@tailrec
  def normalSum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + normalSum(xs.tail)
  }

  @tailrec
  def sum(ints: List[Int], accum: Int): Int = {
    ints match {
      case Nil => accum
      case x :: tail => sum(tail, accum + x)
    }
  }

  def main(args: Array[String]) {
    val list = List(1,2,3)
    println(s"sum using normal recursive method is ${normalSum(list)}")
    /*
        normalSum(List(1,2,3)) -> 1 + List(2,3)
        1 + (2 + List(3))
        1 + (2 + (3 + 0))
        1 + (2 + 3)
        1 + 5
        6
     */
    println(s"sum using tail recursive method is ${sum(list,0)}")
    /*
        sum(List(1,2,3)) -> sum(List(2,3),0+1)
        sum(List(3),1+2)
        sum(Nil,3+3)
        6
     */

  }
}
