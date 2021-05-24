/**
Regex to identify a Valid Email Address:
Write a Scala program to identify a valid email address.
*/

import scala.util.matching.Regex

object RegexExample extends App {

    val str = "pvakindu@gmail.com"

    regexExample(str)

    def regexExample(s:String):Unit = {

      var check=""

      val pattern = new Regex("(^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}+$)")
      
      var lst = (pattern findAllIn str).toList
      
      if(lst.length>0){

        check="Is EMAIL"

      } else {

        check="Is NOT Email"
      }

      println(check)

    }

}

