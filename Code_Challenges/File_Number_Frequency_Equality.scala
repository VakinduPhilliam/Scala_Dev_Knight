/**
File Number and Frequency Equality:
Write a Scala program to check if an integer is present in a file whose frequency is exactly the same as the number. 
*/

import scala.io.Source

object FileOperator extends App {

    println(computeWordFrequencyMap("numbers.txt"))

    def computeWordFrequencyMap(file: String): Unit = {

        var counts = Map.empty[Int,Int]

        for (line <- Source.fromFile(file).getLines()) {
            
            var numbers = line.toLowerCase.split("[ ,!.]+")

            numbers.foreach((numb) => {

                var n = numb.toInt

                if (counts.contains(n)) {
            
                    counts += (n -> (counts(n) + 1)) 

                }
            
                else {
            
                    counts += (n -> (0+1))

                }

            })
        } 
        
        for(n <- counts.keys){

            if(counts(n)==n){
                
                println(n)

            }

        }

    }

}

