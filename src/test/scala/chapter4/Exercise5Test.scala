package chapter4

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.collection.immutable.TreeMap

class Exercise5Test extends FlatSpec {
  private val file = "myfile.txt"
  private val result = Exercise5.countByWord(file)

  "The resulting map" should "be of type TreeMap" in {
    result shouldBe a[TreeMap[_, _]]
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
