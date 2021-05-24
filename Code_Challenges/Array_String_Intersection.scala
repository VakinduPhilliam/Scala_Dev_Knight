/**
String Intersection:
Write a Scala program that compares two arrays of words and returns the elements that 
occur in both arrays.
*/

import scala.collection.mutable.ListBuffer

object StringIntersect {

    def main(args:Array[String]):Unit = {

        println(stringIntersect(Array[String]("One","Two","SIX","TEN","seven","five"),Array[String]("five","FIFTEEN","twenty","SEVEN","Eleven","ONE")))

    }

    def stringIntersect(arr1:Array[String],arr2:Array[String]):List[String] = {

        var arr3 = ListBuffer[String]()

        arr1.foreach((x) => {

            for(i <- Range(0,arr2.length)){

                if(x.toLowerCase()==arr2(i).toLowerCase()){

                    arr3+=arr2(i).toLowerCase()

                }
            }
        })

        arr3.toList

    }

}

