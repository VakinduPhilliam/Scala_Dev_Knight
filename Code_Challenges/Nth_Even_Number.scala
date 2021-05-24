/*
The Nth Even Number:
Write a Scala program to print the Nth even number.
Assume 0 is the first even number.
*/

object NthEven extends App {

    println(nth(1)) // 0
    println(nth(2)) // 2
    println(nth(3)) // 4
    println(nth(4)) // 6
    println(nth(5)) // 8
    println(nth(6)) // 10     
    println(nth(100)) // 198    

    def nth(m:Int):Int = {

    // Count even numbers found
    var count=0

    // Number Iterator
    var i = 0

    var evenDetector = false

    while(evenDetector==false){

        if(isEven(i)==true){

            count=count+1

        }

        if(count<m){

            i=i+1

        } else {

            evenDetector=true

        }            

    }

    i

}
            
def isEven(n:Int):Boolean = {
        
    var evenDetector = false
        
    if(n%2==0){
        
        evenDetector = true
        
    }
        
    evenDetector
    
}

}

