/**
Array Max Sum Non-consecutive Numbers:
Given an array of numbers, write a Scala program to find the highest sum of non-consecutive numbers.
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

