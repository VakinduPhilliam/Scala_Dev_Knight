/**
POLYMORPHISM:
Methods in Scala can be parameterized with both values and types. 
Like on the class level, value parameters are enclosed in a pair of parentheses, while 
type parameters are declared within a pair of brackets.
In the example, method dup in object PolyTest is parameterized with type T and with the 
value parameters x: T and n: Int. 
When method dup is called, the programmer provides the required parameters, but the 
programmer is not required to give actual type parameters explicitly. 
The type system of Scala can infer such types. This is done by looking at the types of 
the given value parameters and at the context where the method is called.
THE EXAMPLE:
*/

object PolyTest extends App {

def dup[T](x: T, n: Int): List[T] =

if (n == 0) Nil

else x :: dup(x, n-1)

Console.println(dup[Int](3, 4))
Console.println(dup("three", 3))

}

