package chapter5

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

import scala.util.Random

class Exercise6Test extends FlatSpec with BeforeAndAfterEach {
  private val random: Random = new Random

  behavior of "A Person"
  it should "store the previously established age" in {
    val age = random.nextInt(100)
    val person = new Person
    person.age = age

    person.age should equal(age)
  }

  it should "store 0 if an attempt is made to establish a negative age" in {
    val person = new Person
    person.age = -5

    person.age should equal(0)
  }
}
