package chapter5

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec, MustMatchers}

class Exercise7Test extends FlatSpec with BeforeAndAfterEach with MustMatchers {
  private val fredSmith = new Person2("Fred Smith")
  private val ana = new Person2("Ana")
  private val antonio = new Person2("Antonio López Pérez")

  behavior of "A Person"
  it should "produce IllegalArgumentException when the constructor argument is empty" in {
    an[IllegalArgumentException] should be thrownBy {
      new Person2("")
    }
  }

  it should "produce IllegalArgumentException when the constructor argument is only spaces" in {
    an[IllegalArgumentException] should be thrownBy {
      new Person2("  ")
    }
  }

  behavior of "A Person called \"Fred Smith\""
  it must "have firstName equal to \"Fred\"" in {
    fredSmith.firstName should equal("Fred")
  }

  it must "have lastName equal to \"Smith\"" in {
    fredSmith.lastName should equal("Smith")
  }

  behavior of "A Person called \"Ana\""
  it must "have firstName equal to \"Ana\"" in {
    ana.firstName should equal("Ana")
  }

  it must "have lastName empty" in {
    ana.lastName shouldBe empty
  }

  behavior of "A Person called \"Antonio López Pérez\""
  it must "have firstName equal to \"Antonio\"" in {
    antonio.firstName should equal("Antonio")
  }

  it must "have lastName equal to \"López Pérez\"" in {
    antonio.lastName should equal("López Pérez")
  }
}
