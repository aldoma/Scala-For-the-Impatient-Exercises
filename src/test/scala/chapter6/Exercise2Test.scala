package chapter6

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise2Test extends FlatSpec {

  "One inch" should "be 2,54 cm" in {
    InchesToCentimeters(1) should equal(2.54 +- 0.00001)
  }

  "One gallon" should "be 3,78541 liters" in {
    GallonsToLiters(1) should equal(3.78541 +- 0.00001)
  }

  "One mile" should "be 1.60934 km" in {
    MilesToKilometers(1) should equal(1.60934 +- 0.00001)
  }
}
