package chapter4

/**
  * Write a function `lteqgt(values: Array[Int], v: Int)` that returns a triple containing
  * the counts of values less than `v`, equal to `v`, and greater than `v`.
  */
object Exercise9 {
  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values count (_ < v), values count (_ == v), values count (_ > v))
  }
}
