/**
UPPER TYPE BOUNDS ORDERED MERGE SORT:
To require that the type of the list passed to your new sort function mixes in Ordered, 
you need to use an upper bound. 
An upper bound is specified similar to a lower bound, except instead of the >: symbol 
used for lower bounds, you use a <: symbol. 
With the "T <: Ordered[T]" syntax, you indicate that the type parameter, T, has an upper 
bound, Ordered[T]. 
This means that the element type of the list passed to orderedMergeSort must be a subtype 
of Ordered. 
Thus, you could pass a List[Person] to orderedMergeSort, because Person mixes in Ordered.
On the other hand, you couldn’t use the orderedMergeSort function to sort a list of 
integers, because class Int is not a subtype of Ordered[Int].
Doing so would give the error: 
"error: inferred type arguments [Int] do not conform to method orderedMergeSort's type
parameter bounds [T <: Ordered[T]]."
EXAMPLE II:
*/

class Person(val firstName: String, val lastName: String) extends Ordered[Person] {
    
    def compare(that: Person) = {
        
        val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
        
        if (lastNameComparison != 0)
        
        lastNameComparison
        
        else
        
        firstName.compareToIgnoreCase(that.firstName)
    
    }
    
    override def toString = firstName +" "+ lastName

}

object MergeSort {

    def main(args:Array[String]):Unit = {

        val people = List( 
            new Person("Larry", "Wall"), 
            new Person("Anders", "Hejlsberg"),
            new Person("Guido", "van Rossum"),
            new Person("Alan", "Kay"),
            new Person("Yukihiro", "Matsumoto")
            )

        println(orderedMergeSort[Person](people))

    }
    
    def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
        
        def merge(xs: List[T], ys: List[T]): List[T] = 
        
        (xs, ys) match {
            
            case (Nil, _) => ys
            case (_, Nil) => xs
            case (x :: xs1, y :: ys1) =>
            
            if (x < y) x :: merge(xs1, ys)
            
            else y :: merge(xs, ys1)
        
        }
        
        val n = xs.length / 2
        
        if (n == 0) xs
        
        else {
            
            val (ys, zs) = xs splitAt n
            
            merge(orderedMergeSort(ys), orderedMergeSort(zs))
        
        }
    }

}

