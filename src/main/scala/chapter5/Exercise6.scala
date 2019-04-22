package chapter5

/**
  * In the `Person` class of Section 5.1, “Simple Classes and Parameterless Methods,”
  * on page 55, provide a primary constructor that turns negative ages to 0.
  */
object Exercise6 {

}

class Person {
  private var _age = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    _age = math.max(0, newAge)
  }
}
