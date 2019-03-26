package chapter5

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

import scala.util.Random

class Exercise2Test extends FlatSpec with BeforeAndAfterEach {
  private val random = Random
  private var bankAccount = new BankAccount

  override def beforeEach() {
    bankAccount = new BankAccount
  }

  "The balance of Bank Account" should "be zero immediately after creation." in {
    bankAccount.balance should be(0.0)
  }

  it should "be increased by the amount of the deposit." in {
    val previousBalance = makeRandomDeposit
    val deposit = generateRandomAmount
    bankAccount.deposit(deposit) should be((previousBalance + deposit) +- 0.001)
  }

  it should "be the same after making a negative deposit." in {
    val previousBalance = makeRandomDeposit
    bankAccount.deposit(-1.0) should be(previousBalance +- 0.001)
  }

  it should "be reduced by the amount withdrawn." in {
    val previousBalance = makeRandomDeposit
    val withdraw = generateRandomAmountMinorThan(previousBalance)
    bankAccount.withdraw(withdraw) should be((previousBalance - withdraw) +- 0.001)
  }

  it should "be the same after making a negative withdrawn." in {
    val previousBalance = makeRandomDeposit
    bankAccount.withdraw(-1.0) should be(previousBalance +- 0.001)
  }

  it should "be the same after you try to withdraw an amount greater than the balance." in {
    val previousBalance = makeRandomDeposit
    bankAccount.withdraw(previousBalance + 1.0) should be(previousBalance +- 0.001)
  }

  private def makeRandomDeposit = {
    bankAccount.deposit(generateRandomAmount)
  }

  private def generateRandomAmount = {
    random.nextDouble * random.nextInt(1000)
  }

  private def generateRandomAmountMinorThan(m: Double) = {
    var result = 0.0
    do {
      result = generateRandomAmount
    } while (result > m)
    result
  }
}
