/**
Sentence Word Frequency Count:
Write a Scala program to count the frequency occurrences of words in a given sentence.
*/

object NewObject {

    def main(args:Array[String]):Unit = {

        println(countWords("See Spot run! Run, Spot. Run!"))

    }
    
    def countWords(text: String) = {
        
        var counts = Map.empty[String,Int]
        
        for (rawWord <- text.split("[ ,!.]+")) {
            
            val word = rawWord.toLowerCase
            
            if (counts.contains(word)) {
            
            counts += (word -> (counts(word) + 1)) 

            }
            
            else {
            
            counts += (word -> (0+1))

            }
        
        } 
        
        counts
}

}
