/*
The Nth Prime Number:
Write a Scala program to print the Nth prime number.
Assume 3 is the first prime number.
*/

object NthPrime extends App {

    println(nth(1)) // 3
    println(nth(2)) // 5
    println(nth(3)) // 7
    println(nth(4)) // 11
    println(nth(100)) // 547   

    def nth(m:Int):Int = {

    // Count prime numbers found
    var count=0

    // Number Iterator
    var i = 2

    var primeDetector = false

    while(primeDetector==false){

        if(isPrime(i)==true){

            count=count+1

        }

        if(count<m){

            i=i+1

        } else {

            primeDetector=true

        }            

    }

    i

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

