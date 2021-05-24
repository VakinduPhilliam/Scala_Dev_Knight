/**
Factorial N:
Write a Scala program to find factorial of number N.
*/

object factorial {

    def main(args:Array[String]):Unit = {

        println(factorialN(0)) // 1
        println(factorialN(1)) // 1
        println(factorialN(2)) // 2
        println(factorialN(3)) // 6
        println(factorialN(4)) // 24
        println(factorialN(5)) // 120

    }

    def factorialN(n:Int):Int = {

        var f = 0;

        if(n<=0 && n<=1) {

            f=1

            f
        }

        else {

        f = n * factorialN(n-1)

        }

        f

    }

}
