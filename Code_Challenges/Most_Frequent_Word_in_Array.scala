/**
Most Frequent Word in Array:
Write a Scala program to find and return the most frequently occurring word in an array 
and its corresponding frequency in the format (MostFrequentWord, Frequency). 
The program must be case insensitive (it should consider “three” and “THREE” to be the same word). 
For example given a Scala array: 
Array("one","two","three","two","one","two","seven","two","ten","THREE","FOUR","FIVE","thrEE").
The program should return (two, 4). “two” being the most frequently occurring word, appearing 4 times.
*/

object Frequency {

    def main(args:Array[String]):Unit = {

        println(MostFrequency(Array("one","two","three","two","one","two","seven","two","ten","THREE","FOUR","FIVE","thrEE")))

    }

    def MostFrequency(words:Array[String]) = {
        
        var wordcounts = Map.empty[String,Int]
        var largestFreq = 0
        var largestWord = words(0)
        
        words.foreach((w)=>{

            var word = w.toLowerCase()
            
            if (wordcounts.contains(word)) { 

                wordcounts += (word -> (wordcounts(word) + 1)) 

            }
            
            else { 

                wordcounts += (word -> (1))
            
            }

        })

        for(w <- wordcounts.keys){

            if(wordcounts(w)>largestFreq){
                
                largestFreq = wordcounts(w)
                largestWord = w

            }

        }

        (largestWord, largestFreq)
    
    }

}

