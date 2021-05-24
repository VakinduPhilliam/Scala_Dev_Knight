/**
Bubble Sort Algorithm:
Write a Scala program that implements the Bubble Sort Algorithm to sort an Array of integers 
in ascending order.
*/

object BubbleSort extends App {

    println(bubbleSort(Array[Int](5,1,8,2,9,7,3,10,4,6)))

    def bubbleSort(arr:Array[Int]):List[Int] = {

        var done = false

        while(!done){
            done=true

            for(i <- 1 until arr.length){
                if(arr(i-1)>arr(i)){
                    done=false

                    var tmp = arr(i-1)
                    arr(i-1)=arr(i)
                    arr(i)=tmp
                }
            }
        }
        
        arr.toList

    }

}

