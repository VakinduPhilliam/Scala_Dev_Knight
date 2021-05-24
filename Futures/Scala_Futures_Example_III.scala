/**
SCALA FUTURES:
Scala Futures is the asynchronous programming engine of the Scala programming language.
Futures helps to eliminate blocking; instead of suspending the thread whenever a 
resource is not available, a separate computation is scheduled to proceed once the 
resource becomes available.
THE EXAMPLE:
This example demonstrates how to add multiple values, each generated asynchronously.
*/

import scala.concurrent._
import ExecutionContext.Implicits.global

object Futures extends App {

    println(combineFutures(5,4)) // Future(Success(2))

    def combineFutures(x:Int,y:Int):Future[Int] = {

        val first:Future[Int] = Future {
            computeFactorial(x)
        }

        val second:Future[Int] = Future {
            computeFactorial(y)
        }

        val addResult:Future[Int] = for {
            one <- first
            two <- second
        } yield one+two

        val finalVerifiedResult:Future[Int] = addResult.recover {
            case ex:Exception => -1
        }

        addResult

    }

    def computeFactorial(n:Int):Int = {

        var f = 0;

        if(n<=0 && n<=1) {

            f=1
            f
        }

        else {

        f = n * computeFactorial(n-1)

        }

        f

    }

}

