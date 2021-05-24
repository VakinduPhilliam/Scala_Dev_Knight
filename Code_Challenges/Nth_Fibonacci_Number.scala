/**
Nth Fibonacci Number
Write a simple scala program to find the Nth Fibonacci number.
*/

// Nth fibonacci numbers
object FibonacciGenerator {

  def main(args:Array[String]):Unit ={
      println(generate1(10))
      println(generate2(11))
  }

  // Solution 1: Iterative Version
  def generate1(n: Int): Int = {
    if (n < 0) {
      throw new IllegalArgumentException(
        "Invalid Argument, n must be >= 0")
    }
    if (n == 0) 0
    else if (n == 1) 1
    else {
      var prev2 = 0
      var prev1 = 1
      var sum = 0
      for (i <- 2 to n) {
        sum = prev1 + prev2
        prev2 = prev1
        prev1 = sum
      }
      sum
    }
  }

  // Solution II: Recursive Version
  def generate2(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else {
      generate2(n - 2) + generate2(n - 1)
    }
  }
}
