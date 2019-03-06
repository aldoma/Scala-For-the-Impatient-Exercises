package chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Suppose you are given an array buffer of integers and want to remove all but
  * the first negative number. Here is a sequential solution that sets a flag
  * when the first negative number is called, then removes all elements beyond.
  *
  * {{{
  *   var first = true
  *   var n = a.length
  *   var i = 0
  *   while (i < n) {
  *     if (a(i) >= 0) i += 1
  *     else {
  *       if (first) { first = false; i += 1 }
  *       else { a.remove(i); n -= 1 }
  *     }
  *   }
  * }}}
  *
  * This is a complex and inefficient solution. Rewrite it in Scala by collecting
  * positions of the negative elements, dropping the first element, reversing the
  * sequence, and calling a.remove(i) for each index.
  */
object Exercise8 {
  def sampleSolution(a: ArrayBuffer[Int]): Unit = {
    var first = true
    var n = a.length
    var i = 0
    while (i < n) {
      if (a(i) >= 0) i += 1
      else {
        if (first) {
          first = false
          i += 1
        }
        else {
          a.remove(i)
          n -= 1
        }
      }
    }
  }

  def scalaWaySolution(c: ArrayBuffer[Int]): Unit = {
    val positionsToRemove = for (i <- c.indices if c(i) < 0) yield i
    for (i <- positionsToRemove.drop(1).reverse) c.remove(i)
  }
}
