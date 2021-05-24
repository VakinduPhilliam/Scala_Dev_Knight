/**
Maximum Possible Combination Sum:
Given five positive integers, write a Scala program to find the maximum possible value 
that can be calculated by summing exactly four of the five integers. 
*/

object MaxCombinationSum {
    
    def main(args:Array[String]):Unit = {

        println(maxCombinationSum(Array[Int](2,3,1,5,4)))

    }

    def maxCombinationSum(arr:Array[Int]):Int = {

        var max = 0;

        for(i <- Iterator.range(0,arr.length)){
            for(j <- Iterator.range(i,arr.length) if (j!=i)){
                for(k <- Iterator.range(j,arr.length) if (k!=i) && (k!=j)){
                    for(l <- Iterable.range(k,arr.length) if(l!=i) && (l!=j) && (l!=k)){

                        var sum =arr(i)+arr(j)+arr(k)+arr(l)

                        if(sum>max){

                            max=sum

                     }

                    }
                }
            }
        }

        max

    }

}
