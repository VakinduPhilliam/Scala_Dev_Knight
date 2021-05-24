/**
Palindrome Chain Length:
Write a Scala program to determine the number of palindrome chain iterations needed to 
generate a Palindrome from a given number.
HINT:
A Palindrome is a number whose value and identity do not change when its digits are 
reversed. 4884 is a palindrome. So is 333 and 272. 
Palindrome Chain Length is the number of reverse chain iterations needed to generate a 
palindrome from a given number. 
For Example; 
Given the number 87.
Step 1: Reverse 87 to get 78. 78 is not a Palindrome. So add 78 to 87 to get 165.
In other words, 87+78=165
Step 2: Repeat Step 1 with the new number generated (165).
In other words, 561+165 =726
Repeat steps for all new numbers generated until you generate a Palindrome.
For the above example the first palindrome generated will be 4884 on the 4th iteration step.
*/

object PalindromeChainLength {

    def main(args:Array[String]):Unit = {

        println(palindromeChainLength(87))

    }

    def palindromeChainLength(n:Int):Int = {

        var i=0
        var p=n

        var palindrome = p.toString.reverse

        while(palindrome.toInt!=p){

            p+=palindrome.toInt

            palindrome = p.toString.reverse

            i=i+1

        }

        i

    }

}

