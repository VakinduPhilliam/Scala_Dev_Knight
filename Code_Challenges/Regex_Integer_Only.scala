/**
Regex Integer Only:
Write a Scala program to identify a text made up of integers only.
*/

import scala.util.matching.Regex

object RegexExample extends App {

    val str = "614"

    regexExample(str)

    def regexExample(s:String):Unit = {

      var check=""

      val pattern = new Regex("(^[0-9]+$)")
    
      var lst = (pattern findAllIn str).toList
      
      if(lst.length>0){

        check="Is Integer ONLY"

      } else {

        check="Is NOT integer only"
      }

      println(check)

    }

}

