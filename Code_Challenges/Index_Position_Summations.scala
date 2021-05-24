/**
Index Position Summations:
Given a list of integers in an array and a number T, write a Scala program that identifies the indices [positions of numbers in the array] whose numbers add to T. 
For Example given an array of integers [3,1,4,5,2,5,2,6,8], and T=9. 
The number at index 2 (which is 4), added to number at index 3 (which is 5) gives 9. 
Therefore the indices (2,3) meet the condition.
*/

object IndexPosition {
    
    def main(args:Array[String]):Unit = {

        indexPosition(Array[Int](3,1,4,5,2,5,2,6,8),9)

    }

    def indexPosition(arr:Array[Int], T:Int):Unit = {

        for(i <- Iterator.range(0,arr.length)){
            for(j <- Iterator.range(i,arr.length) if (j!=i)){

                    if(arr(i)+arr(j)==T){

                        println("(" + i + ", " + j + ")")

                    }
            }
        }

    }

}

