package chapter4

import org.scalatest.FlatSpec
import org.scalatest.Inspectors._
import org.scalatest.Matchers._

class Exercise1Test extends FlatSpec {

  private val gizmos = Map("Nintendo Switch" -> 299.00, "Tablet" -> 379.95, "Trackball" -> 49.90, "Printer" -> 119.00)
  private val percentage = 10
  private val result = Exercise1.applyDiscount(gizmos, percentage)

  "The resulting map" should "be of type Map" in {
    result shouldBe a[Map[_, _]]
  }

  it should "have size equal to original map" in {
    result should have size gizmos.size
  }

  it should "have same keys as the original map" in {
    result.keys should equal(gizmos.keys)
  }

  it should "have all prices greater than to 0" in {
    all(result.values) should be > 0.0
  }

  it should "have all the elements decremented by the percentage" in {
    forAll(result) { g => g._2 shouldBe gizmos.getOrElse(g _1, 0.0) * (1.0 - percentage / 100.0) }
  }
}
