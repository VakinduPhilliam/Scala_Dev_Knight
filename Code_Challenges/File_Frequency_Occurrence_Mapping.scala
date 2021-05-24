/**
File Frequency Occurrence Mapping:
Given a file containing words, write a Scala program to map out the frequency occurrence 
of the words in the file.
*/

import scala.io.Source

object FileOperator extends App {

    println(computeWordFrequencyMap("scala.txt"))

    def computeWordFrequencyMap(file: String): Map[String,Int] = {

        var counts = Map.empty[String,Int]

        for (line <- Source.fromFile(file).getLines()) {
            
            var words = line.toLowerCase.split("[ ,!.]+")

            words.foreach((word) => {

                if (counts.contains(word)) {
            
                    counts += (word -> (counts(word) + 1)) 

                }
            
                else {
            
                    counts += (word -> (0+1))

                }

            })
        } 
        
        counts
    }

}

