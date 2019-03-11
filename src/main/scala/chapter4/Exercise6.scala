package chapter4

import java.util.Calendar._

import scala.collection.immutable

/**
  * Define a linked hash map that maps `"Monday"` to [[java.util.Calendar.MONDAY]], and
  * similarly for the other weekdays. Demonstrate that the elements are visited
  * in insertion order.
  */
object Exercise6 {
  def weekdays(): immutable.ListMap[String, Int] = {
    scala.collection.immutable.ListMap("Monday" -> MONDAY,
      "Tuesday" -> TUESDAY,
      "Wednesday" -> WEDNESDAY,
      "Thursday" -> THURSDAY,
      "Friday" -> FRIDAY,
      "Saturday" -> SATURDAY,
      "Sunday" -> SUNDAY)
  }
}
