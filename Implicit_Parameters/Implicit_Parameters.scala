/**
IMPLICIT PARAMETERS:
A method with implicit parameters can be applied to arguments just like a normal
method. If a defined method misses arguments for its implicit parameters, such arguments 
will be automatically provided.
The actual arguments that are eligible to be passed to an implicit parameter fall into
two categories:
1. First, eligible are all identifiers x that can be accessed at the point of the method
call without a prefix and that denote an implicit definition or an implicit parameter.
2. Second, eligible are also all members of companion modules of the implicit
parameter’s type that are labeled implicit.

THE EXAMPLE:
In the following example we define a method sum which computes the sum of a list
of elements using the monoid’s add and unit operations. 
Please note that implicit values can not be top-level, they have to be members of a 
template.
*/

abstract class SemiGroup[A] {

    def add(x: A, y: A): A

}

abstract class Monoid[A] extends SemiGroup[A] {

    def unit: A

}

object ImplicitTest extends App {

    implicit object StringMonoid extends Monoid[String] {

        def add(x: String, y: String): String = x.concat(y)

        def unit: String = ""

    }

    implicit object IntMonoid extends Monoid[Int] {

        def add(x: Int, y: Int): Int = x + y

        def unit: Int = 0

    }

    def sum[A](xs: List[A])(implicit m: Monoid[A]): A =

    if (xs.isEmpty) m.unit

    else m.add(xs.head, sum(xs.tail))

    println(sum(List(1, 2, 3)))

    println(sum(List("a", "b", "c")))

}
