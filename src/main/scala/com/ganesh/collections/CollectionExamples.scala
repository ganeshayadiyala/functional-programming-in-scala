package com.ganesh.collections

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * Created by ganesh on 30/1/17.
 */
object CollectionExamples {
  def main(args: Array[String]) {

    //Different immutable collections
    val list : List[Int] = List(1,2,3)
    println(list)

    //It'll not allow to do
    //list += 4

    val listWithoutSpecifyingType = List(1,2,3)
    println(listWithoutSpecifyingType)

    val array : Array[Int] = Array(1,2,3)
    println(array.length)

    val map : Map[String,Int] = Map("Sunday"->0,"Monday"->1)
    println(map)

    val set : collection.Set[String] = mutable.Set("hi","how","how","are","you")
    println(set)

    val tupleOfTwo : Tuple2[Int,Int] = Tuple2(1,2)
    println(tupleOfTwo)

    val tupleWithMixedDataType : Tuple3[Int,String,Double] = Tuple3(1,"One",1.0)
    println(tupleWithMixedDataType)

    //Mutable collections
    val listBuf = new ListBuffer[Int]
    println(listBuf)

    //allows to add the values
    println(listBuf += 4)

  }
}
