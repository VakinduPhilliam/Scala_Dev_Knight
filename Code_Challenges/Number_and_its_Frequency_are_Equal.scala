/**
Number and Frequency Equality:
Write a Scala program to check if any integer is present in an array whose frequency is exactly the same as the number. 
*/

object FrequencyEqual {

    def main(args:Array[String]):Unit = {

        println(frequencyEqual(Array[Int](3,1,2,4,5,4,2,5,4,1,5,4)))

    }

    def frequencyEqual(numbers:Array[Int]) = {
        
        var numcounts = Map.empty[Int,Int]
        
        numbers.foreach((n)=>{
            
            if (numcounts.contains(n)) { 

                numcounts += (n -> (numcounts(n) + 1)) 

            }
            
            else { 

                numcounts += (n -> (1))
            
            }

        })

        for(n <- numcounts.keys){

            if(numcounts(n)==n){
                
                println(n)

            }

        }
    
    }

}

