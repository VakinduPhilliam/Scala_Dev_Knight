/**
Regex Alphanumeric Only:
Write a Scala program to identify text made up of alphanumeric characters only 
(Alphabets and Numbers Only).
*/

import scala.util.matching.Regex

object RegexExample extends App {

    val str = "Year2007"

    regexExample(str)

    def regexExample(s:String):Unit = {
    
      var check=""

      val pattern = new Regex("(^[0-9a-zA-Z]+$)")
      
      var lst = (pattern findAllIn str).toList
      
      if(lst.length>0){

        check="Is Alphanumeric ONLY"

      } else {

        check="Is NOT alphanumeric only"
      }

      println(check)

    }

}
