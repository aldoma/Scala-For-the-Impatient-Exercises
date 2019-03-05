package chapter3

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

class Exercise1Test extends FlatSpec with BeforeAndAfterEach {

  val argument = 15
  var result: Array[Int] = _

  override def beforeEach() {
    result = Exercise1.generate(argument)
  }

  "The generated array" should "be of type Array [Int]" in {
    result shouldBe a[Array[_]]
  }

  it should "have length equal to parameter" in {
    result should have length argument
  }

  it should "have all values greater than or equal to 0" in {
    all(result) should be >= 0
  }

  it should "have all values smaller than the parameter" in {
    all(result) should be < argument
  }
}
