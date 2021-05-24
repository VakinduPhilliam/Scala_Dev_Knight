/**
Squares of Integers in Array:
Write a Scala program to print all the squares of integers in a given array.
For example an array with values (1,2,3) should return (1,4,9)
*/

object Square {

    def main(args:Array[String]):Unit = {

        println(square(Array[Int](1,2,3,4,5)))

    }

    def square(arr:Array[Int]):List[Int] = {

        var sqrs = arr.map((a)=>(a*a))

        sqrs.toList

    }

}
