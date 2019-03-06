package chapter3

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise3Test extends FlatSpec {

  private val test = Array(1, 2, 3, 4, 5)
  private val result = Exercise3.swap(test)

  "The swapped array" should "be of type Array[Int]" in {
    result shouldBe a[Array[_]]
  }

  it should "have length equal to original array" in {
    result should have length test.length
  }

  it should "have the two first positions swapped" in {
    assert(test(0) == result(1) && test(1) == result(0))
  }

  it should "have exchanged the third and fourth positions" in {
    assert(test(2) == result(3) && test(3) == result(2))
  }

  it should "have the last (odd) position as the original array" in {
    assert(test(4) == result(4))
  }
}
