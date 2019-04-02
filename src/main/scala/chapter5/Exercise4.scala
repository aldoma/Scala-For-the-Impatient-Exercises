package chapter5

/**
  * Reimplement the Time class from the preceding exercise so that the internal
  * representation is the number of minutes since midnight (between 0 and 24 ×
  * 60 – 1). Do not change the public interface. That is, client code should be
  * unaffected by your change.
  */
object Exercise4 {

}

class Time2(val hrs: Int, val min: Int) {
  require(0 to 23 contains hrs, "Hours must be between 0 and 23 inclusive")
  require(0 to 59 contains min, "Minutes must be between 0 and 59 inclusive")

  private val minutesSinceMidnight = hrs * 60 + min

  def before(other: Time2): Boolean = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }
}



