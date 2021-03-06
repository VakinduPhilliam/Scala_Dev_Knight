/**
SEQUENCE COMPREHENSIONS WITH UNIT:
Scala offers a lightweight notation for expressing sequence comprehensions. 
Comprehensions have the form "for (enums) yield e", where enums refers to a semicolon-separated
list of enumerators. 
An enumerator is either a generator which introduces new variables, or it is a filter. 
A comprehension evaluates the body "e" for each binding generated by the enumerators enum and returns 
a sequence of these values.
There is also a special form of sequence comprehension which returns Unit. 
Here the bindings that are created from the list of generators and filters are used to perform
side-effects. 
The programmer has to omit the keyword yield to make use of such a sequence comprehension.
THE EXAMPLE:
*/

object ComprehensionTest3 extends App {

    for (i <- Iterator.range(0, 20); j <- Iterator.range(i + 1, 20) if i + j == 32)

    Console.println("(" + i + ", " + j + ")")

}

