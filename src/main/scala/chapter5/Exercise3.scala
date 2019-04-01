package chapter5

/**
  * Write a class `Time` with read-only properties `hours` and `minutes` and a method
  * `before(other: Time): Boolean` that checks whether this time comes before the
  * other. A `Time` object should be constructed as `new Time(hrs, min)`, where `hrs` is in
  * military time format (between 0 and 23).
  */
object Exercise3 {

}

class Time(val hrs: Int, val min: Int) {
  if (!(0 to 23 contains hrs)) throw new IllegalArgumentException
  if (!(0 to 59 contains min)) throw new IllegalArgumentException

  def before(other: Time): Boolean = {
    if (hrs == other.hrs) min < other.min else hrs < other.min
  }
}
