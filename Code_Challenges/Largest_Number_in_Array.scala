/**
Largest Number in Array:
Write a Scala program to identify the largest number in an array of numbers.
*/

object ArrayLargest {

    def main(args:Array[String]):Unit = {

        println(largest(Array(11,3,9,1,2,7,4,2,8,2,10,1,5,15,3,7,5)))

    }

    def largest(args:Array[Int]):Int = {

        var large=args(0)

        for(i<-1 until args.length){

            if(args(i)>large){
                large=args(i)
            }

        }

        large

    }

}

