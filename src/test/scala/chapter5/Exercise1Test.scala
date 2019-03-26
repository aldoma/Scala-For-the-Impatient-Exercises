package chapter5

import org.scalatest.Matchers._
import org.scalatest.{BeforeAndAfterEach, FlatSpec}

class Exercise1Test extends FlatSpec with BeforeAndAfterEach {
  private var counter = new Counter

  override def beforeEach() {
    counter = new Counter
  }

  "The value of counter" should "be zero after creation" in {
    counter.current should equal(0)
  }

  it should "be one after call to increment()" in {
    counter.increment()
    counter.current should equal(1)
  }

  it should s"be Int.MaxValue(${Int.MaxValue}) after ${Int.MaxValue} calls to increment()" in {
    incrementCounterToMaxValue()
    counter.current should equal(Int.MaxValue)
  }

  private def incrementCounterToMaxValue(): Unit = {
    for (_ <- 1 to Int.MaxValue) counter.increment()
  }

  it should s"be Int.MaxValue(${Int.MaxValue}) after ${Int.MaxValue} +1 calls to increment()" in {
    incrementCounterToMaxValue()
    counter.increment()
    counter.current should equal(Int.MaxValue)
  }
}
