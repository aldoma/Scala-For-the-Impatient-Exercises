package chapter5

import org.scalatest.{BeforeAndAfterEach, FlatSpec, MustMatchers}

class Exercise3Test extends FlatSpec with BeforeAndAfterEach with MustMatchers {
  private var time: Time = _

  override def beforeEach() {
    time = new Time(12, 30)
  }

  behavior of "A Time"
  it should "produce IllegalArgumentException when the hour is not between 0 and 23" in {
    an[IllegalArgumentException] should be thrownBy {
      new Time(24, 0)
    }
  }

  it should "produce IllegalArgumentException when the minute is not between 0 and 59" in {
    an[IllegalArgumentException] should be thrownBy {
      new Time(4, -5)
    }
  }

  behavior of "A Time containing 12:30"
  it must "be after than 11:30" in {
    !time.before(new Time(11, 30))
  }

  it must "be earlier than 13:30" in {
    time.before(new Time(13, 30))
  }

  it must "be after than 12:29" in {
    !time.before(new Time(12, 29))
  }

  it must "be earlier than 12:31" in {
    time.before(new Time(12, 31))
  }
}
