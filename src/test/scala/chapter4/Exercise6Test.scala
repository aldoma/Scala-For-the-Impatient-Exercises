package chapter4

import java.util.Calendar.{MONDAY, SUNDAY, TUESDAY}

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise6Test extends FlatSpec {
  private val result = Exercise6.weekdays()

  "The resulting map" should "be of type immutable.Map" in {
    result shouldBe a[scala.collection.immutable.Map[_, _]]
  }

  it should "have size equal to 7" in {
    result should have size 7
  }

  it should "have in the first position 'Monday'" in {
    result.head._2 should be(MONDAY)
  }

  it should "have in the second position 'Tuesday'" in {
    result.tail.head._2 should be(TUESDAY)
  }

  it should "have in the last position 'Sunday'" in {
    result.last._2 should be(SUNDAY)
  }
}
