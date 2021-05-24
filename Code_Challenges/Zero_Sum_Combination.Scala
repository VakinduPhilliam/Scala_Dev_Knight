/**
Zero Sum Combination:
Write a Scala program to find all the combinations of three numbers that sum to zero. 
For example, given a sample input: 2, 3, 1, -2, -1, -4, 4, -3, 0.
The numbers 3, -1 and -2 sum to zero.
*/

object ZeroSum {
    
    def main(args:Array[String]):Unit = {

        println(zeroSum(Array[Int](2, 3, 1, -2, -1, -4, 4, -3, 0)))

    }

    def zeroSum(arr:Array[Int]):Unit = {

        for(i <- Iterator.range(0,arr.length)){
            for(j <- Iterator.range(i,arr.length) if (j!=i)){
                for(k <- Iterator.range(j,arr.length) if (k!=i) && (k!=j)){

                    if(arr(i)+arr(j)+arr(k)==0){

                        println("(" + arr(i) + ", " + arr(j) + ", " + arr(k) + ")")

                    }
                }
            }
        }

    }

}

