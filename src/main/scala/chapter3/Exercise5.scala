package chapter3

object Exercise5 extends App {
  /*
  How do you compute the average of an Array[Double]?
   */
  def average(c: Array[Double]) = {
    c.sum / c.size
  }

  val test = Array(3,7, 1.1, -4.8, 2.1, 9.3, -5.6)
  println(s"Average of Array(${test.mkString(", ")}) is ${average(test)}")
}
