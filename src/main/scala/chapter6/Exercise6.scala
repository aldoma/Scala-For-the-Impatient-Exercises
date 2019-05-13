package chapter6

/**
  * Write an enumeration describing the four playing card suits so that the `toString` method returns ♣, ♦, ♥, or ♠.
  **/
object CardSuits extends Enumeration {
  type CardSuits = Value

  val Clover: CardSuits = Value("♣")
  val Diamond: CardSuits = Value("♦")
  val Heart: CardSuits = Value("♥")
  val Spade: CardSuits = Value("♠")
}
