package chapter1

/*
Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5)
becomes Array(2, 1, 4, 3, 5).
 */

object Exercise2 extends App {

  def swap(c: Array[Int]) = {
    for (i <- 0 until array.length by 2 if (i < c.length - 1)) {
      val t = c(i)
      c(i) = c(i + 1)
      c(i + 1) = t
    }
  }

  val array = Array(1, 2, 3, 4, 5)
  swap(array)
  println(array.mkString(", "))

  val array2 = array :+ 6
  swap(array2)
  println(array2.mkString(", "))
}
