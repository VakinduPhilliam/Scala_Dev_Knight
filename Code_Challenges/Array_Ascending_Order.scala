/**
Ascending Order:
Write a Scala program to arrange the elements of an array in ascending order.
*/

object ArrayAscending {

    def main(args:Array[String]):Unit = {

        println(ascendingArray(Array(11,3,9,1,2,19,7,4,2,8,2,10,1,5,23,15,3,7,5)))

    }

    def ascendingArray(arr:Array[Int]):List[Int] = {
        
        var sortedArray = arr.sortWith(_<_)

        sortedArray.toList
    }

}

