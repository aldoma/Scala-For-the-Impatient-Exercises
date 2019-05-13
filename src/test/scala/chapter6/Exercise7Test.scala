package chapter6

import chapter6.CardSuits2._
import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise7Test extends FlatSpec {
  "Clover" must "be black" in {
    Clover.isRed should be(false)
  }

  "Diamond" must "be red" in {
    Diamond.isRed should be(true)
  }

  "Heart" must "be red" in {
    Heart.isRed should be(true)
  }

  "Spade" must "be black" in {
    Spade.isRed should be(false)
  }
}
