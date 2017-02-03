package com.ganesh.exceptionhandling

import java.io.{IOException, FileNotFoundException, FileReader}

/**
 * Created by ganesh on 30/1/17.
 */
object ExceptionThrowing {
  def createFile(fileName:String) {
    if( ! (fileName endsWith ".scala") )
      throw new IllegalArgumentException("File name should end with .scala")
    //... rest of the program
  }

  def printFileContentFinally(fileName:String) {
    var file : FileReader = null
    try {
      file = new FileReader("input.txt")
      // read and print file content
    } catch {
      case ex: FileNotFoundException => // Handle missing file
      case ex: IOException => // Handle other I/O error
    } finally {
      file.close() //whether expression is thrown or not, file should be closed before control is transferred to caller method
    }
  }

  def convertToInt(str:String) : Int = {
    try{
      str.toInt
    } catch {
      case nfe : NumberFormatException =>
        throw new Exception(s"Cannot convert your input text '$str' to integer.")
    }
  }

  def main(args: Array[String]) {
    println(createFile("anyfile"))
    println(convertToInt("10"))
    println(convertToInt("wronginput"))
    print(printFileContentFinally("wrongFileName"))
  }
}
