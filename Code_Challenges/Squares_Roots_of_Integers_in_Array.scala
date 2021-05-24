/**
Squares Roots of Integers in Array:
Write a Scala program to print all the square roots of integers in a given array.
For example an array with values (1,4,9) should return (1,2,4).
*/

object Square {

    def main(args:Array[String]):Unit = {

        println(square(Array[Int](1,9,25,64,121)))

    }

    def square(arr:Array[Int]):List[Int] = {

        var sqrs = arr.map((a)=>{Math.sqrt(a).toInt})

        sqrs.toList

    }

}

