/**
Wild Card Pattern Matching:
Write a Scala program that implements a wildcard pattern matching mechanism.
Skipping one character should be represented by '?' and '*’ should represent skipping multiple characters.
The following should return ‘true’.
isMatching(“abcdef”, “a*f”)
isMatching(“abcdef”, “abcd?f”)
isMatching(“abcdef”, “a*def”)
isMatching(“abcdef”, “a*”)
*/

class WildCardPattern {

    private val matchOnce = '?'  
    private val matchZeroOrMany = '*'
  
    def isMatching(str: String, pattern: String): Boolean = {
        isMatchingSeq(str.toList, pattern.toList)
    }

    private def isMatchingSeq(str: Seq[Char], pattern: Seq[Char]): Boolean = {

        (str, pattern) match {
            case (Nil, Nil) => true
            case (sHead :: sTail, pHead :: pTail) if sHead == pHead || pHead == matchOnce => {
                isMatchingSeq(sTail, pTail)
            }
            case (_ :: sTail, pHead :: pTail) if pHead == matchZeroOrMany => {
                isMatchingSeq(sTail, pTail) || isMatchingSeq(sTail, pattern) || isMatchingSeq(str, pTail)
            }
            case _ => false

    }
}

}

object WildCard extends App {

    val wildcard = new WildCardPattern()

    println(wildcard.isMatching("abcdf","abcdf")) // true    
    println(wildcard.isMatching("abcdef","abcdey")) // false
    println(wildcard.isMatching("abcdef","abcd?f")) // true
    println(wildcard.isMatching("abcdef","a*f")) // true      

    println(wildcard.isMatching("","")) // true
    println(wildcard.isMatching("abcdef","a*")) // true       
    println(wildcard.isMatching("abcdef","a*def")) // true
    println(wildcard.isMatching("abcdef","a?cdef")) // true   

}

