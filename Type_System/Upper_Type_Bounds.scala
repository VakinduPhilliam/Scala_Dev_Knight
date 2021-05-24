/**
UPPER TYPE BOUNDS:
In Scala, type parameters and abstract types may be constrained by a type bound.
Such type bounds limit the concrete values of the type variables and possibly reveal
more information about the members of such types. 
An upper type bound T <: A declares that type variable T refers to a subtype of type A.
This example relies on an upper type bound for the implementation of the polymorphic 
method findSimilar:
Without the upper type bound annotation it would not be possible to call method
isSimilar in method findSimilar.
THE EXAMPLE:
*/

trait Similar {

def isSimilar(x: Any): Boolean

}

case class MyInt(x: Int) extends Similar {

def isSimilar(m: Any): Boolean =

m.isInstanceOf[MyInt] &&
m.asInstanceOf[MyInt].x == x

}

object UpperBoundTest extends App {

def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean =

if (xs.isEmpty) false

else if (e.isSimilar(xs.head)) true

else findSimilar[T](e, xs.tail)

val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))

Console.println(findSimilar[MyInt](MyInt(4), list))
Console.println(findSimilar[MyInt](MyInt(2), list))

}

