/**
SEQUENCE COMPREHENSIONS:
Scala offers a lightweight notation for expressing sequence comprehensions. 
Comprehensions have the form "for (enums) yield e", where enums refers to a semicolon-separated
list of enumerators. 
An enumerator is either a generator which introduces new variables, or it is a filter. 
A comprehension evaluates the body "e" for each binding generated by the enumerators enum and returns 
a sequence of these values.
THE EXAMPLE:
*/

object ComprehensionTest1 extends App {

def even(from: Int, to: Int): List[Int] =

for (i <- List.range(from, to) if i % 2 == 0) yield i

Console.println(even(0, 20))

}

