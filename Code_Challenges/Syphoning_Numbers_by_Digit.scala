/**
Syphoning Numbers by Digit:
Uganda’s Social Security Numbers (SSN) are 7 digit numbers. 
Write a Scala program to identify all SSN numbers in a given array.
*/

object SSN_Numbers {

    def main(args:Array[String]):Unit = {

        println(SSN_Numbers(Array(3423,6571846,67123,78234,212,31,3871870,451,8671873,89,324,9155419,34,12,378,78)))

    }

    def SSN_Numbers(arr:Array[Int]):List[Int] = {

        var SSNs = Array[Int]()
        
        // Identify SSN numbers (7 digit numbers) and store them

        SSNs = arr.filter(digits(_)==7)

        SSNs.toList
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

