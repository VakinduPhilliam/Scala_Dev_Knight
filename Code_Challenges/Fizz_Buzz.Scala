/**
Fizz Buzz Scala Style:
Write a Scala program that prints numbers from 1 to 100. 
But for multiples of three print “FIZZ” instead of the number and for the multiples of 
five print “BUZZ”. For numbers which are multiples of both three and five print “FIZZBUZZ”.
*/

object FizzBuzz {

    def main(args:Array[String]):Unit = {

        fizzBuzz(100)

    }

    def fizzBuzz(n:Int):Unit = {

        println("SHALL WE PLAY A GAME:...?")

        for(i <-1 to n){

            if((i%3==0) && (i%5!=0)){

                println("FIZZ")

            } else if ((i%5==0) && (i%3!=0)){

                println("BUZZ")

            } else if ((i%3==0) && (i%5==0)){

                println("FIZZBUZZ")

            } else {

                println(i)
            
            }

        }

    }

}

