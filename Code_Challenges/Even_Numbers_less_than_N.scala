/*
Even numbers less than n:
Write a Scala program to print all even numbers less than 100.
Assume 0 is the first even number.
*/

object Even extends App {

    var i = 0

    while(i<100){

        if(isEven(i)==true){

            println(i)
        
        }
        i=i+1
    }

    def isEven(n:Int):Boolean = {

        var evenDetector = false

        if(n%2==0){

        evenDetector = true

        }

        evenDetector

    }

}

