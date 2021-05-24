/**
SCALA FUTURES:
Scala Futures is the asynchronous programming engine of the Scala programming language.
Futures helps to eliminate blocking; instead of suspending the thread whenever a 
resource is not available, a separate computation is scheduled to proceed once the 
resource becomes available.
THE EXAMPLE:
Here's a simple code example of how Scala futures work.
*/

import scala.concurrent._
import ExecutionContext.Implicits.global

object FuturesCreate extends App {

    Future{

        println("The Future is here.")
    }

    println("The Future is coming!")

    Thread.sleep(3000)

}

