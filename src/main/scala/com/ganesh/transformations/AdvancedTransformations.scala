package com.ganesh.transformations

/**
 * Created by ganesh on 30/1/17.
 */
object AdvancedTransformations {
  def main(args: Array[String]) {
    val integerList = List(2,4,1,3)

    //reduce operation
    val sumUsingReduce = integerList.reduce((acc,ele)=>acc+ele)
    println(s"sum value is $sumUsingReduce")

    val map = List((1,5),(2,6),(3,7),(1,4))
    val groupedData = map.groupBy(ele=>ele._1)

    println(s"grouped data is $groupedData")


    val sumUsingFold = integerList.fold(0)((element,intermediateSum)=>{
      intermediateSum+element
    })

    val maxUsingFoldLeft = integerList.foldLeft(0)((acc,ele) => acc max ele)
    println(s"max value is $maxUsingFoldLeft")

    val sum = integerList.sum
    println("integer list sum using fold "+sumUsingFold+" using normal api "+sum)

    val filteredList = integerList.filter(element => element < 3)
    println(s"list containing values which is less than 3 is $filteredList")

  }
}
