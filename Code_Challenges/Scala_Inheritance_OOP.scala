/**
Scala Inheritance OOP new Public:
Complete the implementation of the following Scala program.
User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits. 
Implement the class TextInput that contains: 
1. Public method def add(c:Char) – concatenates the given character to the current value. 
2. Public method def getValue: String – returns the current value. 
Implement the class NumericInput that: 
1. Inherits from TextInput. 
2. Overrides the add method so that each non-numeric character is ignored. 
For example, the following code should output “10”: 
val input:TextInput = new NumericInput()
input.add(‘1’)
input.add(‘a’)
input.add(‘0’)
println(input.getValue())

*/

object UserInput {
        
  var buf = new StringBuilder

  class TextInput { 

      def add (c:Char){

          buf.append(c)

      }

      def getValue():String ={
          buf.toString
      }

  }
    
  class NumericInput extends TextInput { 

      override def add(c:Char){
          if(c.isDigit){
              buf.append(c)
          }
      }

      override def getValue():String ={
          buf.toString
      }

  }
  
  def main(args: Array[String]) = {

    val input: TextInput = new NumericInput()
    input.add('1')
    input.add('a')
    input.add('0')
    println(input.getValue())
    
  }
}
