/**
SCALA TRAITS:
Traits are a fundamental unit of code reuse in Scala. 
A trait encapsulates method and field definitions, which can then be reused by mixing them 
into classes. Unlike class inheritance, in which each class must inherit from just one 
superclass, a class can mix in any number of traits.

EXAMPLE:
Given an array of numbers, find the highest sum of non-consecutive numbers.
If the array is, [1, 2, 3, 4, 5], then, 1 + 3 + 5 = 9. 
9 is the answer.

*/

trait ArrayMaxSumNonConsecutive {

    def maxSum(numbers: Seq[Int]): Int
}

class Recursive extends ArrayMaxSumNonConsecutive {

    def maxSum(numbers: Seq[Int]): Int = numbers match {

        case Nil => 0
        case Seq(n) => n
        case Seq(a, b) => Math.max(a, b)
        case head :: tail =>

        val currentAndSkipOne = head + maxSum(tail.tail)
        val skipCurrent = maxSum(tail)

        Math.max(currentAndSkipOne, skipCurrent)

    }
}

object ArrayMaxSum extends App {

    var recursive:ArrayMaxSumNonConsecutive = new Recursive()

    println(recursive.maxSum(Seq(1,2,3,4,5)))

}

