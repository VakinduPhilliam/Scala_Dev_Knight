/**
COVARIANT TYPE PARAMETERS:
Scala supports variance annotations of type parameters of generic classes.
The + and - symbols you place next to type parameters are called variance annotations.
The type defined by the class Stack[T] is subject to invariant subtyping
regarding the type parameter. This can restrict the reuse of the class abstraction. 
We now derive a functional (i.e. immutable) implementation for stacks which does not
have this restriction.
The annotation +T declares type T to be used only in covariant positions. 
Similarly, -T would declare T to be used only in contravariant positions. 
For covariant type parameters we get a covariant subtype relationship regarding this type 
parameter.
For our example this means Stack[T] is a subtype of Stack[S] if T is a subtype of S.
Prefixing a formal type parameter with a + indicates that subtyping is covariant
(flexible) in that parameter. By adding this single character, you are
telling Scala that you want Queue[String], for example, to be considered a
subtype of Queue[AnyRef].
The opposite holds for type parameters that are tagged with a -.
A prefix -, which indicates contravariant subtyping. If T is a subtype of type S, this 
would imply that Queue[S] is a subtype of Queue[T] (which in the case of queues would be 
rather surprising!).
For the stack example we would have to use the covariant type parameter T in a 
contravariant position for being able to define method push. 
Since we want covariant subtyping for stacks, we use a trick and abstract over the 
parameter type of method push. 
We get a polymorphic method in which we use the element type T as a lower bound of push’s 
type variable. 
This has the effect of bringing the variance of T in sync with its declaration as a 
covariant type parameter. 
Now stacks are covariant,but our solution allows that e.g. it’s possible to push a string 
on an integer stack.
The result will be a stack of type Stack[Any]; so only if the result is used in a context
where we expect an integer stack, we actually detect the error. 
Otherwise we just get a stack with a more general element type.
*/

class Stack[+A] {

def push[B >: A](elem: B): Stack[B] = new Stack[B] {

def top: B = elem
def pop: Stack[B] = Stack.this
override def toString() = elem.toString() + " " + Stack.this.toString()

}

override def toString() = ""

}

object VariancesTest extends App {

var s: Stack[Any] = new Stack().push("Hello")

s = s.push(7)
s = s.push(8)
s = s.push(9)
s = s.push(10)
s = s.push(11)
s = s.push("World")
s = s.push("Learning")
s = s.push("Scala")
s = s.push("Variances")

println(s)

}

