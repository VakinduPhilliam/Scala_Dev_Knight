/**
Data Pipeline Processing:
As part of a data processing pipeline, complete the implementation of the Scala 'makePipeline' function: 
The function should accept a variable number of functions, and it should return a new function that accepts one parameter arg. 
The returned function should call the first function in the makePipeline with the parameter arg, and call the second function with the result of the first function. 
The returned function should continue calling each function in the makePipeline in order, following the same pattern, and return the value from the last function. 
For example, makePipeline((x:Int) =>x+3, (x:Int) =>x+1, (x:Int) => (x/2), and then calling the returned function with 3 should return 5.
*/

object Pipeline {

    def compute[T](input:T, fn:T=>T) = {
        fn(input)
    }

    def makePipeline[T](functions: (T=>T)*): (T=>T) = {

        (arg:T) => {
            var v=functions.foldLeft(arg)((arg,fn) => compute(arg, fn))
            v
        }
    }

    def main(args:Array[String]) = {

        println(makePipeline((x:Int) => x*3, (x:Int) => x+1, (x:Int) => x/2)(3))
    }
}
