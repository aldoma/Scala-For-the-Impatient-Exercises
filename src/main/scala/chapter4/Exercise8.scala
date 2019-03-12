package chapter4

/**
  * Write a function `minmax(values: Array[Int])` that returns a pair containing the
  * smallest and the largest values in the array.
  */
object Exercise8 {
  def minmax(values: Array[Int]): (Int, Int) = {
    (values.min, values.max)
  }
}
