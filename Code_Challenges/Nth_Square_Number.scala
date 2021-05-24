/*
The Nth Square Number:
Write a Scala program to print the Nth square number.
Assume 0 is the first square number.
*/

object NthSquare extends App {

    println(nth(1)) // 0
    println(nth(2)) // 1
    println(nth(3)) // 4
    println(nth(4)) // 9
    println(nth(5)) // 16
    println(nth(6)) // 25     
    println(nth(100)) // 9801    

    def nth(m:Int):Int = {

    // Count square numbers found
    var count=0

    // Number Iterator
    var i = 0

    var squareDetector = false

    while(squareDetector==false){

        if(isSquare(i)==true){

            count=count+1

        }

        if(count<m){

            i=i+1

        } else {

            squareDetector=true

        }            

    }

    i

}
    
def isSquare(n:Int):Boolean = {
        
    var squareDetector = false
        
    if(Math.sqrt(n).toInt*Math.sqrt(n).toInt==n){
        
        squareDetector = true

    }

    squareDetector

    }

}

