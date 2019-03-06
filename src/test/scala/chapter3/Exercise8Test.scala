package chapter3

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Exercise8Test extends FlatSpec {

  private val random = Random
  private val test = ArrayBuffer((for (_ <- 1 to 10) yield random.nextInt(20) - 10): _*)
  private val result1 = test.clone()
  Exercise8.sampleSolution(result1)
  private val result2 = test.clone()
  Exercise8.scalaWaySolution(result2)

  "The result array" should "be equal to the one produced by the sample code" in {
    result1 should contain theSameElementsInOrderAs result2
  }
}
