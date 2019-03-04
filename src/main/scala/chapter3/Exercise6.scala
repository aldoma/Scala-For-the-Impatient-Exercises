package chapter3

/*
How do you rearrange the elements of an Array[Int] so that they appear in
reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
 */

// NOTE: Non-recursive implementations
object Exercise6 extends App {
  def reverseSort(c: Array[Int]): Unit = {
    def swap(j: Int): Unit = {
      val t = c(j)
      c(j) = c(j + 1)
      c(j + 1) = t
    }

    for (i <- c.indices.reverse)
      for (j <- 0 until i)
        if (c(j) < c(j + 1)) {
          swap(j)
        }
  }

  val test = Array(0, 4, -5, 8, 6, -7, 12, 3)
  println(s"   Original: ${test.mkString(", ")}")
  reverseSort(test)
  println(s"Transformed: ${test.mkString(", ")}")
}
