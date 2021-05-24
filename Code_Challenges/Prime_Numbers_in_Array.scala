/**
Prime Numbers in Array:
Write a Scala program to identify the prime numbers in a given array.
*/

object Prime {

    def main(args:Array[String]):Unit = {

        println(primeNumbers(Array(11,3,9,1,2,19,7,4,2,8,2,21,31,0,10,1,5,23,15,3,7,5)))

    }

    def primeNumbers(arr:Array[Int]):List[Int] = {

        var primes = Array[Int]()
        
        // Identify prime numbers and store them

        primes = arr.filter(isPrime(_)==true)

        primes.toList
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

