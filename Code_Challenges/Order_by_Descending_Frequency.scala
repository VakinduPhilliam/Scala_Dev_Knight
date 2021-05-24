/**
Order by Descending Frequency:
Write a Scala Program to map out an array of elements in descending frequency 
(from the most frequently occurring element to the least frequently occurring element).
*/

import scala.collection.mutable.LinkedHashMap

object Frequency {

    def main(args:Array[String]):Unit = {

        println(descendingSort(wordFrequency(Array("one","two","three","two","one","two","seven","two","ten","THREE","FOUR","FIVE","thrEE"))))

    }

    def wordFrequency(words:Array[String]):Map[String,Int] = {
        
        var wordcounts = Map.empty[String,Int]
        
        words.foreach((w)=>{

            var word = w.toLowerCase()
            
            if (wordcounts.contains(word)) { 

                wordcounts += (word -> (wordcounts(word) + 1)) 

            }
            
            else { 

                wordcounts += (word -> (0+1))
            
            }

        })

        wordcounts
    
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

