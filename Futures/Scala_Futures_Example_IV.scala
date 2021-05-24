/**
SCALA FUTURES:
Scala Futures is the asynchronous programming engine of the Scala programming language.
Futures helps to eliminate blocking; instead of suspending the thread whenever a 
resource is not available, a separate computation is scheduled to proceed once the 
resource becomes available.
THE EXAMPLE:
This example demonstrates how to fetch a file resource asynchronously with failure 
exception.
*/

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Success,Failure}
import scala.io.Source

object FileFrequency extends App {

    println(processFile("build.sbt"))

    def processFile(f_name:String):Unit = {

        val getFileData:Future[String] = Future {

            val f = Source.fromFile(f_name)

            try f.getLines.mkString("")
            finally f.close()

        }

        getFileData.onComplete {

            case Success(data) => println("Frequency Data: "+data)
            case Failure(ex) => println("ERROR occured: "+ex.getMessage)

        }
    }

}

