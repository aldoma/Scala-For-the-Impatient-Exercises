package chapter5

/**
  * Write a class `BankAccount` with methods `deposit` and `withdraw`, and a read-only
  * property `balance`.
  */
object Exercise2 {

}

class BankAccount {
  private[this] var _balance = 0.0

  def balance: Double = _balance

  def deposit(amount: Double): Double = {
    if (amount > 0.0) _balance += amount
    _balance
  }

  def withdraw(amount: Double): Double = {
    if (amount > 0.0 && _balance >= amount) _balance -= amount
    _balance
  }
}
