package chapter3

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.collection.mutable

class Exercise11Test extends FlatSpec {

  private val result = Exercise11.imageTypes

  "The list of image types" should "be of type Buffer[String]" in {
    result shouldBe an[mutable.Buffer[String]]
  }

  it should "have 6 elements" in {
    result should have length 6
  }
}
