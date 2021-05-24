/*
The Nth Odd Number:
Write a Scala program to print the Nth odd number.
Assume 1 is the first odd number.
*/

object NthOdd extends App {

    println(nth(1)) // 1
    println(nth(2)) // 3
    println(nth(3)) // 5
    println(nth(4)) // 7
    println(nth(5)) // 9
    println(nth(6)) // 11     
    println(nth(100)) // 199    

    def nth(m:Int):Int = {

    // Count odd numbers found
    var count=0

    // Number Iterator
    var i = 0

    var oddDetector = false

    while(oddDetector==false){

        if(isOdd(i)==true){

            count=count+1

        }

        if(count<m){

            i=i+1

        } else {

            oddDetector=true

        }            

    }

    i

}
        
def isOdd(n:Int):Boolean = {
        
    var oddDetector = false
        
    if(n%2>0){
        
        oddDetector = true
        
    }
        
    oddDetector

}

}

