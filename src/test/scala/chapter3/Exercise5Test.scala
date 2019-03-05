package chapter3

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

class Exercise5Test extends FlatSpec with BeforeAndAfterEach {

  private val test = Array(3, 7, 4.7, -4.8, 0.7, 9.3, -5.2)
  private val result: Double = Exercise5.average(test)

  s"The average of ${test.mkString("Array(", ", ", ")")}" should "be 2.1" in {
    result should be(2.1)
  }
}
