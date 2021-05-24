/*
Number Anagrams less than n:
Write a Scala program to print all number anagrams less than n.
An anagram number is a number whose value remains the same if its digits are reversed.
11, 121, 101, 3773, are all anagrams because each number's value remains the same if its 
digits are reversed. 78 is NOT an anagram, because 87 (reverse of 78) has a different value.
Assume all anagram numbers must have atleast two digits, with 11 being the first 
anagram number.
*/

object Anagram extends App {

    // Number iterator
    // Starts at 10 because we assume 11 is the first anagram number.
    var i = 10

    while(i<1000){

        if(isAnagram(i)==true){

            println(i)
        
        }
        i=i+1
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

