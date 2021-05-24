/**
Anagram Detector:
Write a simple scala program to detect if a word is an anagram (a word whose meaning remains the same if its letters are reversed).
For example "Anna" is an anagram because its reverse "annA" has the same meaning as the original word.
"John" on the other hand is not an anagram, because "nhoj" doesn't have the same meaning as the original word "John".
*/

object Anagram {

    def main(args:Array[String]):Unit = {

        println(isAnagram("Anna")) // true
        println(isAnagram("John")) // false

    }

    def isAnagram(s:String):Boolean = {

        var detector:Boolean = false;

        if(s.reverse.toLowerCase()==s.toLowerCase()){

            detector=true;
        }

        detector
    }

}

