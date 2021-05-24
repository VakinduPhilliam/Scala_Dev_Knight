/**
Kadane's Algorithm (Dynamic Programming): 
Given an integer array, numbers = [-2,1,-3,4,-1,2,1,-5,4], write a Scala program to find 
the continuous sub-array (containing at least one number) which has the largest sum and 
return its sum.
Example: 
Input: numbers = [-2,1,-3,4,-1,2,1,-5,4], 
Output: 6, 
Explanation: [4,-1,2,1] has the largest sum = 6.
*/	

object Kandane {

    def main(args:Array[String]):Unit = {

        println(kandane(Array(-2,1,-3,4,-1,2,1,-5,4)))

    }

    def kandane(list:Array[Int]):Int = {

        var cursum =0
        var maxSum=0

        for(i <- Iterator.range(0,list.length)){

            var curNum=list(i)

            cursum=Math.max((cursum+curNum),0)
            maxSum=Math.max(cursum,maxSum)

        }

        maxSum

    }

}

