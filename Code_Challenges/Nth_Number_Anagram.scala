/*
The Nth Number Anagram:
Write a Scala program to print the Nth number anagram.
An anagram number is a number whose value remains the same if its digits are reversed.
11, 121, 101, 3773, are all anagrams because each number's value remains the same if its 
digits are reversed. 78 is NOT an anagram, because 87 (reverse of 78) has a different value.
Assume all anagram numbers must have atleast two digits, with 11 being the first 
anagram number.
*/

object NthAnagram extends App {

    println(nth(1)) // 11
    println(nth(2)) // 22
    println(nth(3)) // 33
    println(nth(4)) // 44
    println(nth(10)) // 101
    println(nth(11)) // 111  
    println(nth(12)) // 121        
    println(nth(100)) // 1001   

    def nth(m:Int):Int = {

    // Count number anagrams
    var count=0

    // Number Iterator
    // Starts at 10 because we assume 11 is the first anagram
    // number.
    var i = 10

    var anagramDetector = false

    while(anagramDetector==false){

        if(isAnagram(i)==true){

            count=count+1

        }

        if(count<m){

            i=i+1

        } else {

            anagramDetector=true

        }            

    }

    i

}

    
def isAnagram(s:Int):Boolean = {
        
    var detector:Boolean = false;

    // Convert digits to string
    // Then rverse the string and compare if string still has same value
    if(s.toString.reverse==s.toString){
            
        detector=true;
        
    }
        
    detector
    
}

}

