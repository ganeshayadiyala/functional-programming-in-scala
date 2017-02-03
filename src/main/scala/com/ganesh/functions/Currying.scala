package com.ganesh.functions

/**
 * Created by ganesh on 30/1/17.
 */
object Currying {
  case class Text(value : String)

  case class Source(sourceName : String){
    def sendText(t:Text) = println(s"Text is coming from $sourceName and its value is ${t.value}")
  }

  //Normal function
  def communicate(t:Text,s:Source) = s.sendText(t)

  //Scala currying way
  def communicateFrom(t:Text) = (s:Source) => s.sendText(t)

  //or
  def communicateFrom1(t:Text)(s:Source) = s.sendText(t)


  def main(args: Array[String]) {
    //Normal way 1
    communicate(Text("hi"),Source("first source"))

    //Normal way 2
    Source("Second source").sendText(Text("Hello"))

    //currying way 1
    val communication = communicateFrom(Text("How are you"))
    communication(Source("3rd source"))
    communication(Source("4th source"))
    //currying way 2
    communicateFrom1(Text("??"))(Source("5th source"))



    //convert normal function to curried function
    val curriedCommunicate = (communicate _).curried

    val backToNormalFunction = Function.uncurried(curriedCommunicate)

  }
}
