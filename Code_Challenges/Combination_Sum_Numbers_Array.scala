/**
Combination Sum in Numbers Array:
Given an array with numbers, your task is to write a Scala program that can find 4 numbers that will satisfy this equation: 
A + B + C = D
*/

object CombinationSum {
    
    def main(args:Array[String]):Unit = {

        println(combinationSum(Array[Int](67,2,3,1,6,45,4,5,7,16)))

    }

    def combinationSum(arr:Array[Int]):Unit = {

        for(i <- Iterator.range(0,arr.length)){
            for(j <- Iterator.range(i,arr.length) if (j!=i)){
                for(k <- Iterator.range(j,arr.length) if (k!=i) && (k!=j)){
                    for(l <- Iterable.range(0,arr.length)){

                        if(arr(i)+arr(j)+arr(k)==arr(l)){

                            println("(" + arr(i) + " + " + arr(j) + " + " + arr(k) + " = "+arr(l)+")")

                     }

                    }
                }
            }
        }

    }

}

