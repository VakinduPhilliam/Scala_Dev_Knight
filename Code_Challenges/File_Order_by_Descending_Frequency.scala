/**
File Order by Descending Frequency:
Write a Scala Program to map out the elements of a file in descending frequency (from the 
most frequently occurring element to the least frequently occurring element).
*/

import scala.collection.mutable.LinkedHashMap
import scala.io.Source

object FileOperator extends App {

    println(descendingSort(computeWordFrequencyMap("scala.txt")))

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

    def descendingSort(unsorted: Map[String,Int]) = {

    var sortedMap = new LinkedHashMap[String,Int]()
    val keys = unsorted.keys.toList

    // sort in descending order of frequency
    val sortedKeys = keys.sortWith((a,b)=>{unsorted(a)>unsorted(b)})
    
    sortedKeys.foreach(key => sortedMap += (key -> (unsorted(key))))
    sortedMap

  }

}

