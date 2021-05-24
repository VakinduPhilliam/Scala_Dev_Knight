/**
Regex Letters Only:
Write a Scala program to identify text made up of alphabet letters only.
*/

import scala.util.matching.Regex

object RegexExample extends App {

    val str = "scala"

    regexExample(str)

    def regexExample(s:String):Unit = {
    
      var check=""

      val pattern = new Regex("(^[a-zA-Z]+$)")

      var lst = (pattern findAllIn str).toList
      
      if(lst.length>0){

        check="Is Letters ONLY"

      } else {

        check="Is NOT letters only"
      }

      println(check)

    }

}

