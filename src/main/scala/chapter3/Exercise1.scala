package chapter3

import scala.util.Random

/*
Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 */
object Exercise1 extends App {

  val random = Random

  def generate(n: Int) = {
    for (_ <- 0 to n) yield
      random.nextInt(n)
  }

  println(generate(5))
  println(generate(8))
}
