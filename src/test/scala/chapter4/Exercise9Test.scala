package chapter4

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.util.Random

class Exercise9Test extends FlatSpec {
  private val random = Random
  private val test = (for (_ <- 1 to 10) yield (random nextInt 200) - 100) toArray

  private val v: Int = test(test.length / 2)
  private val result = Exercise9 lteqgt(test, v)

  "The sum of the components of the tuple" should "be equal to the length of the original matrix" in {
    (result._1 + result._2 + result._3) should be equals test.sum
  }

  "The original array" should s"have ${result._1} elements smaller than $v" in {
    result._1 should be equals test.sorted.find(_ == v).get
  }

  it should s"have ${result._3} elements greater than $v" in {
    result._3 should be equals test.sorted(Ordering[Int].reverse).find(_ == v).get
  }
}
