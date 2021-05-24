/**
Longest Word in Sentence:
Given a sentence, write a Scala program to find and return the longest word in the sentence 
and its index in the format (Word, Index). 
For example given the sentence “Jesus is King over all”, the function should return: (Jesus, 0)
*/

object LongestWord {

    def main(args:Array[String]):Unit = {

        println(longestWord("Jesus is King over all."))

    }
    
    def longestWord(txt: String) = {

        var words = txt.split(" ")
        
        var word = words(0)
        var idx = 0

        for (i <-1 until words.length) {
        
        if (words(i).length > word.length) {
            word = words(i)
            idx = i
        
        }
    }

        (word, idx)
    
    }

}
