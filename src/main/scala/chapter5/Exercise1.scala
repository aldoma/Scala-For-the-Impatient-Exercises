package chapter5

/**
  * Improve the `Counter` class in Section 5.1, "Simple Classes and Parameterless
  * Methods" on page 55 so that it doesn’t turn negative at [[Int.MaxValue]].
  */
object Exercise1 {

}

class Counter {
  private var value = 0 // You must initialize the field
  def increment() {
    if (value != Int.MaxValue) value += 1
  } // Methods are public by default
  def current = value
}
