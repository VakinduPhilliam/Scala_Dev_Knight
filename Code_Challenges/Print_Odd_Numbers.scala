/**
Print Odd Numbers:
Given a list of Integers, write a Scala program to print the odd numbers in the list.
*/
object OddNumbers {

    def main(args:Array[String]):Unit = {

        println(odds(List[Int](1,2,3,4,5,6)))

    }

    def odds(list:List[Int]):List[Int] = {

        var newList = List[Int]()

        newList = list filter (_ %2 == 1)

        newList
    }

}

