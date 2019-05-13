package chapter6

import chapter6.CardSuits._
import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise6Test extends FlatSpec {
  "Clover" must "print ♣" in {
    Clover.toString charAt 0 shouldBe '♣'
  }

  "Diamond" must "print ♦" in {
    Diamond.toString charAt 0 shouldBe '♦'
  }

  "Heart" must "print ♥" in {
    Heart.toString charAt 0 shouldBe '♥'
  }

  "Spade" must "print ♠" in {
    Spade.toString charAt 0 shouldBe '♠'
  }
}
