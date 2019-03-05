package chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Improve the solution of the preceding exercise by collecting the positions
  * that should be moved and their target positions. Make those moves and
  * truncate the buffer. Don’t copy any elements before the first unwanted
  * element.
  */
object Exercise9 extends App {
  def scalaWaySolution(c: ArrayBuffer[Int]): Unit = {
    var first = true
    var start = false
    var offset = 0
    val changes = for (i <- c.indices) yield {
      if (c(i) < 0)
        if (first) first = false else {
          start = true
          offset += 1
        }
      else if (start) {
        (i - offset, i)
      }
    }
    for ((dest: Int, origin: Int) <- changes)
      c(dest) = c(origin)
    c.trimEnd(offset)
  }


  val test = ArrayBuffer(4, -8, 6, 4, -1, 0, -6, 6, 0, 7, -8)
  println(s"   Original: ${test.mkString(", ")}")
  scalaWaySolution(test)
  println(s"Transformed: ${test.mkString(", ")}")
}
