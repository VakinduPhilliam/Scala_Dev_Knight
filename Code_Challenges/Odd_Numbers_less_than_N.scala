/*
Odd numbers less than n:
Write a Scala program to print all odd numbers less than 100.
Assume 1 is the first odd number.
*/

object Odd extends App {

    var i = 0

    while(i<100){

        if(isOdd(i)==true){

            println(i)
        
        }
        i=i+1
    }

    def isOdd(n:Int):Boolean = {

        var oddDetector = false

        if(n%2>0){

        oddDetector = true

        }

        oddDetector

    }

}

