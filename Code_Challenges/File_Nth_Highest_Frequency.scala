/**
File Nth Highest Frequency:
Write a Scala program to find the element in a file with the nth highest frequency 
occurrence. 
*/

import scala.collection.mutable.LinkedHashMap
import scala.io.Source

object FileOperator extends App {

    println(nthfrequency(descendingSort(computeWordFrequencyMap("scala.txt")),1)) // is
    println(nthfrequency(descendingSort(computeWordFrequencyMap("scala.txt")),2)) // and

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

    def descendingSort(unsorted: Map[String,Int]):LinkedHashMap[String,Int] = {

    var sortedMap = new LinkedHashMap[String,Int]()
    val keys = unsorted.keys.toList

    // sort in descending order of frequency
    val sortedKeys = keys.sortWith((a,b)=>{unsorted(a)>unsorted(b)})
    
    sortedKeys.foreach(key => sortedMap += (key -> (unsorted(key))))
    sortedMap

  }

  def nthfrequency(sortedArray:LinkedHashMap[String,Int],nth:Int) = {

    var nthkey =""

    val sortedKeys = sortedArray.keys.toArray

    nthkey = sortedKeys(nth-1)

    nthkey

  }

}

