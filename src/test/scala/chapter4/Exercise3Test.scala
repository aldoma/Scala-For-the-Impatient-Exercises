package chapter4

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise3Test extends FlatSpec {
  private val file = "myfile.txt"
  private val result = Exercise3.countByWord(file)

  "The resulting map" should "be of type Map" in {
    result shouldBe a[Map[_, _]]
  }

  it should "have size equal to 733" in {
    result should have size 733
  }

  it should "have the word 'caballero' 13 times" in {
    result("caballero") should be(13)
  }

  it should "have the word 'hidalgo' 3 times" in {
    result("hidalgo") should be(3)
  }
}
