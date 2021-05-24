/**
SCALA FUTURES:
Scala Futures is the asynchronous programming engine of the Scala programming language.
Futures helps to eliminate blocking; instead of suspending the thread whenever a 
resource is not available, a separate computation is scheduled to proceed once the 
resource becomes available.
THE EXAMPLE:
This example demonstrates how to asynchronously read a file in Scala.
*/

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.io.Source

object FuturesDataType extends App {

    val buildFile:Future[String] = Future {

        val f = Source.fromFile("build.sbt")

        try f.getLines.mkString("n")

        finally f.close()
    }

    println("BEFORE FUTURE:")
    println(s"Started reading the build file asynchronously.")
    println(s"Status (Is Completed): ${buildFile.isCompleted}.")

    Thread.sleep(250)
    
    println("AFTER FUTURE:")
    println(s"Status (Is Completed): ${buildFile.isCompleted}.")
    println(s"Value: ${buildFile.value}")

}

