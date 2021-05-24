/**
Regex to Identify Words in String:
Write a Scala program to identify occurrences of the word “scala” in a given string of words.
*/

import scala.util.matching.Regex

object RegexExample extends App {

    val str = "Scala is scalable and cool"

    regexExample(str)

    def regexExample(s:String):Unit = {

      val pattern = new Regex("(S|s)cala")
      
      println((pattern findAllIn str).mkString(","))

    }

}

