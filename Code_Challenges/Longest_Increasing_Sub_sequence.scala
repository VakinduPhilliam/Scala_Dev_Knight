/**
Longest Increasing Sub-sequence:
Given an array of integers, write a Scala program to find the longest increasing sub-sequence.
For example, in the array [8, 1, 2, 3], the longest increasing sub-sequence is [1,2,3].
And in the array [1, 2, 0, 0, 3, 0, 4, 5, 6, 5, 2, 3], the longest increasing sub-sequence is [0,4,5,6].
*/

import scala.annotation.tailrec

trait LongestIncreasing {
    def findLongestIncreasing(seq: Seq[Int]): Seq[Int]
}
    
class LongestIncreasingRecursive extends LongestIncreasing {

    override def findLongestIncreasing(seq: Seq[Int]): Seq[Int] = {
        require(seq.nonEmpty)
        findLongestIncreasingInternal(seq)
    }
  
    private def findLongestIncreasingInternal(seq: Seq[Int]): Seq[Int] = seq match {
    
        case Nil => Nil
        case _ =>
        val firstIncreasing = increasingSeq(seq)
        val otherIncreasing = findLongestIncreasingInternal(seq.drop(firstIncreasing.length))
  
        Seq(firstIncreasing, otherIncreasing).maxBy(_.length)
    }
  
    @tailrec
    private def increasingSeq(seq: Seq[Int], res: Seq[Int] = Nil): Seq[Int] = seq match {

        case head :: (tail@Seq(next, _*)) =>
        if (head < next) increasingSeq(tail, res :+ head)
        else res :+ head

        case Seq(single) => res :+ single
        case _ => res
    }
}
  
object LongestIncreasing extends App {

    val longIncrease:LongestIncreasing = new LongestIncreasingRecursive()

    println(longIncrease.findLongestIncreasing(Seq(8, 1, 2, 3))) // 1,2,3
    println(longIncrease.findLongestIncreasing(Seq(1, 2, 0, 0, 3, 0, 4, 5, 6, 5, 2, 3))) // 0,4,5,6

}

