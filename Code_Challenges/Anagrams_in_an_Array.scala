/**
Anagrams in an Array:
Write a Scala program to identify the anagrams in an array of words.
*/

object Anagram {

    def main(args:Array[String]):Unit = {

        println(anagram(Array("Anna", "the", "you", "fresh","racecar", "Tomcat", "math")))

    }

    def anagram(arr:Array[String]):List[String] = {

        var anagrams = Array[String]()
        
        // Identify anagrams and store them

        anagrams = arr.filter(isAnagram(_)==true)

        anagrams.toList
    }

    def isAnagram(s:String):Boolean = {

        var detector:Boolean = false;

        if(s.reverse.toLowerCase()==s.toLowerCase()){

            detector=true;
        }

        detector
    }

}

