package chapter3

import scala.util.Random

/*
Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */
object Exercise1 {

  private val random = Random

  def generate(n: Int): Array[Int] = {
    (for (_ <- 0 until n) yield
      random.nextInt(n)).toArray
  }
}
