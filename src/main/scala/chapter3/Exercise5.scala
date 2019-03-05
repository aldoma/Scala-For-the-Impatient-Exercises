package chapter3

/*
How do you compute the average of an Array[Double]?
 */
object Exercise5 {
  def average(c: Array[Double]): Double = {
    c.sum / c.length
  }
}
