package chapter3

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

class Exercise4Test extends FlatSpec with BeforeAndAfterEach {

  private val test = Array(1, -4, 0, 5, 2, -3, 9)
  private val result = Exercise4.produce(test)
  private val positive = test.filter(_ > 0)
  private val (firstHalf, secondHalf) = result.splitAt(positive.length)

  "The result array" should "be of type Array[Int]" in {
    result shouldBe a[Array[_]]
  }

  it should "have length equal to original array" in {
    result should have length test.length
  }

  it should "have the first half with all positive values" in {
    firstHalf should contain theSameElementsInOrderAs positive
  }

  it should "have the first half with all negative or zero values" in {
    val negative = test.filter(_ <= 0)
    secondHalf should contain theSameElementsInOrderAs negative
  }
}
