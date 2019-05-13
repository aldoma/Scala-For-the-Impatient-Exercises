package chapter6

/**
  * Implement a function that checks whether a card suit value from the preceding exercise is red.
  **/
object Exercise7 {

}

object CardSuits2 extends Enumeration {
  type CardSuits2 = Value

  val Clover: CardSuits2 = Value("♣")
  val Diamond: CardSuits2 = Value("♦")
  val Heart: CardSuits2 = Value("♥")
  val Spade: CardSuits2 = Value("♠")

  implicit class CardSuitsExtended(c: CardSuits2) {
    def isRed: Boolean = c == Diamond || c == Heart
  }

}

