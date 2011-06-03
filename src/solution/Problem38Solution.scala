package Problem38Solution

// Problem38Solution (*) Compare the two methods of calculating Euler's totient function.
//     Use the solutions of problems Problem34Solution and P37 to compare the algorithms.  Try
//     to calculate phi(10090) as an example.

// Here's an object that will test the relative execution times of the two
// approaches.
// On a 2.4 GHz Athlon 64 X2, here's what happens the first time `test` is called:
//   Preload primes: 20 ms.
//   Problem34Solution (10090): 65 ms.
//   Problem37Solution (10090): 3 ms.
//
// The JVM tends to profile its execution, though.  Here's a several-iteration run.
//   scala> import Problem38Solution.Problem38Solution._
//   import Problem38Solution.Problem38Solution._
//   
//   scala> test(10090)
//   Preload primes: 9 ms.
//   Problem34Solution (10090): 53 ms.
//   Problem37Solution (10090): 4 ms.
//   
//   scala> test(10090)
//   Preload primes: 2 ms.
//   Problem34Solution (10090): 28 ms.
//   Problem37Solution (10090): 1 ms.
//   
//   scala> test(10090)
//   Preload primes: 2 ms.
//   Problem34Solution (10090): 17 ms.
//   Problem37Solution (10090): 1 ms.
//   
//   scala> test(10090)
//   Preload primes: 2 ms.
//   Problem34Solution (10090): 3 ms.
//   Problem37Solution (10090): 0 ms.
//   
//   scala> test(10090)
//   Preload primes: 4 ms.
//   Problem34Solution (10090): 2 ms.
//   Problem37Solution (10090): 0 ms.

object Problem38Solution {
  import arithmetic.S99Int._

  def time[A](label: String)(block: => A): A = {
    val now = System.currentTimeMillis()
    val ret = block
    println(label + ": " + (System.currentTimeMillis() - now) + " ms.")
    ret
  }
  
  def test(n: Int) {
    time("Preload primes") {
      primes takeWhile { _ <= Math.sqrt(n) } force
    }
    time("Problem34Solution (" + n + ")") {
      n.totientProblem34Solution
    }
    time("Problem37Solution (" + n + ")") {
      n.totient
    }
  }
}
