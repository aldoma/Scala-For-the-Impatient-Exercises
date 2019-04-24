package chapter5

/**
  * Consider the class
  * {{{
  * class Employee(val name: String, var salary: Double) {
  *   def this() { this("John Q. Public", 0.0) }
  * }
  * }}}
  * Rewrite it to use explicit fields and a default primary constructor. Which form
  * do you prefer? Why?
  */
object Exercise10 {
}

class Employee {
  var salary: Double = 0.0
  private var _name: String = "John Q. Public"

  def this(name: String, salary: Double) {
    this()
    this._name = name
    this.salary = salary
  }

  def name: String = _name
}
