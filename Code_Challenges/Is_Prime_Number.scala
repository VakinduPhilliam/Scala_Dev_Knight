/**
Is a Prime Number:
Write a Scala program to determine if a given number is a prime number.
*/

object Prime {

    def main(args:Array[String]):Unit = {

        println(isPrime(7)) // true
        println(isPrime(3)) // true
        println(isPrime(29)) // true
        println(isPrime(31)) // true

        println(isPrime(48)) // False
        println(isPrime(10)) // False
        println(isPrime(21)) // False
        println(isPrime(9)) // False
        println(isPrime(4)) // False
        println(isPrime(2)) // False
        println(isPrime(0)) // False

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

