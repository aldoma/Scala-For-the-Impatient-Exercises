package chapter3

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise7Test extends FlatSpec {

  private val test = Array(4, -8, 6, 4, -1, 0, -6, 6, 0, 7, -8)
  private val result = Exercise7.removeDuplicates(test)
  private val seq = result.toSeq

  "The result array" should "be of type Array[Int]" in {
    result shouldBe a[Array[_]]
  }

  it should "length equal to seq of array" in {
    result should have length seq.length
  }

  it should "have the same elements as the seq of array" in {
    result should contain theSameElementsInOrderAs seq
  }
}
