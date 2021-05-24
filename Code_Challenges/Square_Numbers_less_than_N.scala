/*
Square numbers less than n:
Write a Scala program to print all square numbers less than 100.
Assume 0 is the first square number.
*/

object Square extends App {

    var i = 0

    while(i<100){

        if(isSquare(i)==true){

            println(i)
        
        }
        i=i+1
    }

    def isSquare(n:Int):Boolean = {

        var squareDetector = false

        if(Math.sqrt(n).toInt*Math.sqrt(n).toInt==n){

        squareDetector = true

        }

        squareDetector

    }

}

