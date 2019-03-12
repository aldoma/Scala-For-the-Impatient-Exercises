package chapter4

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.util.Random

class Exercise8Test extends FlatSpec {
  private val random = Random
  private val test = (for (_ <- 1 to 10) yield (random nextInt 200) - 100) toArray

  private val result = Exercise8 minmax test

  "The resulting tuple" should "have the first component less than or equal to the second" in {
    result._1 should be <= result._2
  }

  "The original array" should "not have any element smaller than the first component of the tuple." in {
    test filter (_ < result._1) shouldBe empty
  }

  it should "not have any element greater than the second component of the tuple." in {
    test filter (_ > result._2) shouldBe empty
  }
}
