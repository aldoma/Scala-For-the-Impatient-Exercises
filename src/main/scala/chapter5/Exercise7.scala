package chapter5

/**
  * Write a class `Person` with a primary constructor that accepts a string containing
  * a first name, a space, and a last name, such as `new Person("Fred Smith")`. Supply
  * read-only properties `firstName` and `lastName`. Should the primary constructor
  * parameter be a `var`, a `val`, or a plain parameter? Why?
  */
object Exercise6 {
}

class Person2(name: String) {
  require(name.trim.length > 0, "Name can not be empty")

  val (firstName, lastName) = {
    val strings = name.split("\\s+")
    (strings.head, strings.tail.mkString(" "))
  }
}
