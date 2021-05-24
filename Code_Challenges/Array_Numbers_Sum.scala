/**
Sum of Numbers in an Array:
Write a Scala program to add all the numbers in a given array.
*/

object ArraySum {

    def main(args:Array[String]):Unit = {

        println(sum(Array(5,2,3,1,5,4))) // 20

    }

    def sum(args:Array[Int]):Int = {

        var total=args(0)

        for(i<-1 until args.length){

                total+=args(i)            

        }

        total

    }

}

