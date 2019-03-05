package chapter3

/*
Given an array of integers, produce a new array that contains all positive
values of the original array, in their original order, followed by all values that
are zero or negative, in their original order.
 */
object Exercise4 {
  def produce(c: Array[Int]): Array[Int] = {
    (for (i <- c if i > 0) yield i) ++ (for (i <- c if i <= 0) yield i)
  }
}
