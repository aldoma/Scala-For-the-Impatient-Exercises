package chapter3

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise10Test extends FlatSpec {

  private val result = Exercise10.americanTimeZones

  "The list of america's time zones" should "be of type Array[String]" in {
    result shouldBe an[Array[String]]
  }

  it should "have 166 elements" in {
    result should have length 166
  }

  it should "not have any element starting with the word 'America'" in {
    every(result) should not startWith "America/"
  }

  it should "be ordered" in {
    result shouldBe sorted
  }
}
