package chapter3

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

class Exercise3Test extends FlatSpec with BeforeAndAfterEach {

  val array = Array(1, 2, 3, 4, 5)
  var result: Array[Int] = _

  override def beforeEach(): Unit = {
    result = Exercise3.swap(array)
  }

  "The swapped array" should "be of type Array[Int]" in {
    result shouldBe a[Array[_]]
  }

  it should "have length equal to original array" in {
    result should have length array.length
  }

  it should "have the two first positions swapped" in {
    assert(array(0) == result(1) && array(1) == result(0))
  }

  it should "have exchanged the third and fourth positions" in {
    assert(array(2) == result(3) && array(3) == result(2))
  }

  it should "have the last (odd) position as the original array" in {
    assert(array(4) == result(4))
  }
}
