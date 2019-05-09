package chapter6

/**
  * The preceding problem wasn’t very object-oriented. Provide a general super-
  * class `UnitConversion` and define objects `InchesToCentimeters`, `GallonsToLiters`, and
  * `MilesToKilometers` that extend it.
  */
object Exercise2 {

}

class UnitConversions(val factor: Double) {
  def apply(value: Double): Double = convert(value)

  private def convert(value: Double) = value * factor
}

object InchesToCentimeters extends UnitConversions(2.54)

object GallonsToLiters extends UnitConversions(3.78541)

object MilesToKilometers extends UnitConversions(1.60934)
