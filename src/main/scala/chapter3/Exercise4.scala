package chapter3

object Exercise4 extends App {
  /*
  Given an array of integers, produce a new array that contains all positive
  values of the original array, in their original order, followed by all values that
  are zero or negative, in their original order.
   */
  def produce(c: Array[Int]) = {
    (for (i <- c if (i > 0)) yield i) ++ (for (i <- c if (i <= 0)) yield i)
  }

  val test = Array(1, -4, 0, 5, 2, -3, 9)
  println(s"   Original: ${test.mkString(", ")}")
  println(s"Transformed: ${produce(test).mkString(", ")}")
}
