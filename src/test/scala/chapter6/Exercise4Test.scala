package chapter6

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise4Test extends FlatSpec {
  behavior of "A Point(3, 4) created with new"
  private val p1 = new Point(3, 4)

  it must s"have x equal to 3" in {
    p1.x should equal(3)
  }

  it must s"have y equal to 4" in {
    p1.y should equal(4)
  }

  behavior of "A Point(3, 4) created without new"
  private val p2 = Point(3, 4)

  it must s"have x equal to 3" in {
    p2.x should equal(3)
  }

  it must s"have y equal to 4" in {
    p2.y should equal(4)
  }
}
