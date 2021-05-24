/**
Parentheses Validator:
Given a string, write a Scala program to make sure that parentheses '(', ')' are 
opened/closed in the correct order.
*/

object Parentheses extends App {

    println(validateParentheses("Parentheses placed (rightly) or wrong.")) // true
    println(validateParentheses("Parentheses (placed (rightly) or wrong.")) // false
    println(validateParentheses("Parentheses placed (rightly) or wrong).")) // false
    println(validateParentheses("(Parentheses) (placed (rightly) or wrong).")) // true
      
    def validateParentheses(str: String): Boolean = {
        validateCharSeq(str.toList, 0)
    }

  
    private def validateCharSeq(str: Seq[Char], count: Int): Boolean = {

        if (count < 0) {
            false
        }

        else str match {

            case Nil => count == 0
            case head :: tail if head == '(' => validateCharSeq(tail, count + 1)
            case head :: tail if head == ')' => validateCharSeq(tail, count - 1)
            case _ :: tail => validateCharSeq(tail, count)

        }
    }
}

