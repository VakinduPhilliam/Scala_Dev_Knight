/**
HIGHER-ORDER FUNCTIONS:
Scala allows the definition of higher-order functions. 
These are functions that take other functions as parameters, or whose result is a function. 
Here is a function "apply" which takes another function f and a value v and applies function f to v:

def apply(f: Int => String, v: Int) => f(v)

Note that methods are automatically coerced to functions if the context requires this.

THE EXAMPLE:
In this example, the method "decorator.layout" is coerced automatically to a value
of type Int => String as required by method app. 
Please note that method "decorator.layout" is a polymorphic method (i.e. it abstracts over 
some of its signature types) and the Scala compiler has to instantiate its method type 
first appropriately.

*/

class Decorator(left: String, right: String) {
    
    def layout[A](x: A) = left + x.toString() + right

}

object HOCTest extends App {

    def apply(f: Int => String, v: Int) = f(v)

    val decorator = new Decorator("[", "]")

    Console.println(apply(decorator.layout, 7))

}

