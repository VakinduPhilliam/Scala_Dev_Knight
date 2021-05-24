/*
Prime numbers less than n:
Write a Scala program to print all prime numbers less than n.
*/

object Prime extends App {

    var i = 0

    while(i<1000){

        if(isPrime(i)==true){

            println(i)
        
        }
        i=i+1
    }

    def isPrime(n:Int):Boolean = {

        var primeDetector = true

        val range = Range(2,n,1)

        // Find factors of n
        var factors = range.toList filter (n%_==0)

        if((factors.length>0) || (n<2) || n==2){

        primeDetector = false

        }

        primeDetector

    }

}

