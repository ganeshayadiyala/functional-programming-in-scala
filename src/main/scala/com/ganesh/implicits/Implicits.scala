package com.ganesh.implicits

/**
 * Created by ganesh on 2/2/17.
 */
object Implicits {
  case class Text(value : String)

  case class Source(sourceName : String){
    def sendText(t:Text) = println(s"Text is coming from $sourceName and its value is ${t.value}")
  }

  def communicateFrom1(t:Text)(implicit s:Source) = s.sendText(t)

  def main(args: Array[String]) {

    implicit val defaultSource = Source("default source")

    communicateFrom1(Text("1st message"))

    val newSource = Source("new source")

    communicateFrom1(Text("2nd message"))(newSource)

  }

}
