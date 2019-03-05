package chapter3

/**
  * Make a collection of all time zones returned by [[java.util.TimeZone.getAvailableIDs]]
  * that are in America. Strip off the "`America/`" prefix and sort the result.
  */
object Exercise10 extends App {
  def americanTimeZones = {
    val prefix = "America/"
    java.util.TimeZone.getAvailableIDs.filter(_.startsWith(prefix)).map(_.substring(prefix.length)).sorted
  }

  println(americanTimeZones.mkString(", "))
}
