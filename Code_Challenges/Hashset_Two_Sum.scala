/**
Hashset Two Sum:
Given a HashSet, write a Scala program to find a pair in the set that would add up to a given sum.
For example in the array, [1,2,3], find two numbers that would add to 5. 
[2,3] would add to 5.

*/

import scala.annotation.tailrec
import scala.collection.immutable.HashSet

class TwoSum {

    def findPairSum(seq: Seq[Int], sum: Int): Option[(Int, Int)] = {

    @tailrec
    def inner(seq: Seq[Int], hash: HashSet[Int]): Option[(Int, Int)] = seq match {

        case Nil => None
        case head :: tail => 
        
        val lookingFor = sum - head
        if (hash.contains(lookingFor))
        Some(head -> lookingFor)
        else inner(tail, hash + head)
    }

    inner(seq, HashSet.empty[Int])
  }
}

object twoSum extends App {

    val twosum = new TwoSum()
    println(twosum.findPairSum(Seq(1,2,3),5))

}

