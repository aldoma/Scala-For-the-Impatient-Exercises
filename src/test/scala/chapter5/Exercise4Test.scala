package chapter5

import org.scalatest.{BeforeAndAfterEach, FlatSpec, MustMatchers}

class Exercise4Test extends FlatSpec with BeforeAndAfterEach with MustMatchers {
  private var time: Time2 = _

  override def beforeEach() {
    time = new Time2(12, 30)
  }

  behavior of "A Time2"
  it should "produce IllegalArgumentException when the hour is not between 0 and 23" in {
    an[IllegalArgumentException] should be thrownBy {
      new Time2(24, 0)
    }
  }

  it should "produce IllegalArgumentException when the minute is not between 0 and 59" in {
    an[IllegalArgumentException] should be thrownBy {
      new Time2(4, -5)
    }
  }

  behavior of "A Time2 containing 12:30"
  it must "be after than 11:30" in {
    !time.before(new Time2(11, 30))
  }

  it must "be earlier than 13:30" in {
    time.before(new Time2(13, 30))
  }

  it must "be after than 12:29" in {
    !time.before(new Time2(12, 29))
  }

  it must "be earlier than 12:31" in {
    time.before(new Time2(12, 31))
  }
}
