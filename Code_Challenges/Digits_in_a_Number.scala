/**
Digits in a Number:
Write a Scala program to identify the number of digits in a number.
*/

object Digits {

    def main(args:Array[String]):Unit = {

        println(digits(325)) //3
        println(digits(82356)) //5
        println(digits(2)) //1
        println(digits(987655452)) //9

    }

    def digits(n:Int):Int = {

        var count = 0
        var N = n

        if(n>=1) {
            
            count=count+1
        }

        while ((N/10)>=1){

            N= N/10
            count=count+1
        }

        count

    }

}

