/**
Vector Implementation:
Complete the implementation of the following Scala program. 
When passed two vectors of names, it will return a vector containing the names that appear in either or both input vectors. 
The returned vector should have no duplicates. 
For example calling MergeNames.uniqueNames(Vector(“Ava”, “Emma”, “Olivia”), Vector(“Olivia”, “Sophia”, “Emma”)) 
should return a vector containing Ava, Emma, Olivia, Sophia in any order.
*/

object MergeNames {
    
  def uniqueNames(names1: Vector[String], names2: Vector[String]): Vector[String] = {
    // throw new UnsupportedOperationException("Waiting to be implemented.")

    var v1=names1++names2
    var v2=v1.distinct
    v2
  }

  def main(args: Array[String]): Unit = {

    val names1 = Vector("Ava", "Emma", "Olivia")
    val names2 = Vector("Olivia", "Sophia", "Emma")
    println(uniqueNames(names1, names2).mkString(","))

  }
}
