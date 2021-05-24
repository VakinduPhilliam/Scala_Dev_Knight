/**
Frequency Occurrence Mapping:
Given an array of words, write a Scala program to map out the frequency occurrence of the 
words in the array.
*/

object Frequency {

    def main(args:Array[String]):Unit = {

        println(wordFrequency(Array("one","two","three","one","two","THREE","FOUR","FIVE")))

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

}
