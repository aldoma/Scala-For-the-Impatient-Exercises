package chapter3

/*
Write a loop that swaps adjacent elements of an array of integers. For example,
Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .
 */
object Exercise2 {
  def swap(c: Array[Int]): Unit = {
    for (i <- c.indices by 2 if i < c.length - 1) {
      val t = c(i)
      c(i) = c(i + 1)
      c(i + 1) = t
    }
  }
}
