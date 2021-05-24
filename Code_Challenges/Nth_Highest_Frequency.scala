/**
Nth Highest Frequency:
Write a Scala program to find the element with the nth highest frequency occurrence. 
For example given an array with elements: "one","two","three","two","one","two","seven","two","ten","Two","THREE","FOUR","FIVE","thrEE","TWO". 
If nth=2, program returns “three”. If nth=1, program returns “two”. If nth=3, program return “one”.
*/

import scala.collection.mutable.LinkedHashMap

object Frequency {

    def main(args:Array[String]):Unit = {

        println(nthfrequency(descendingSort(wordFrequency(Array("one","two","three","two","one","two","seven","two","ten","Two","THREE","FOUR","FIVE","thrEE","TWO"))),2))

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

