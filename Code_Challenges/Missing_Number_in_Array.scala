/**
Missing Number in Array:
You have n - 1 numbers from 1 to n. Your task is to write a Scala program that can find the missing number. 
For example, given an array [4, 2, 5, 1]. The array contains 5 numbers (n = 5) if the missing number is included. 
The program should display the missing number in this case as 3.
*/

object MissingNumber {

    def main(args:Array[String]):Unit = {

        missingNumber(Array[Int](4,2,5,1))

    }

    def missingNumber(arr:Array[Int]):Unit = {

        // To find missing number;
        // 1. Add all numbers to n, including missing number.
        // 2. Add all numbers in array.
        // 3. Substract.

        val n = arr.length+1

        var realSum = n*(n+1)/2

        var sum = arr.sum

        println(realSum-sum)

    }

}
