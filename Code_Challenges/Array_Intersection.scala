/**
Array Intersection:
Write a Scala program that compares two arrays of integer numbers and returns elements that 
occur in both arrays.
*/

import scala.collection.mutable.ListBuffer

object ArrayIntersect {

    def main(args:Array[String]):Unit = {

        println(arrayIntersect(Array[Int](4,1,2,7,5,4),Array[Int](7,1,5,8,10,9,11)))

    }

    def arrayIntersect(arr1:Array[Int],arr2:Array[Int]):List[Int] = {

        var arr3 = ListBuffer[Int]()

        arr1.foreach((x) => {

            for(i <- Range(0,arr2.length)){

                if(x==arr2(i)){

                    arr3+=arr2(i)

                }
            }
        })

        arr3.toList

    }

}

