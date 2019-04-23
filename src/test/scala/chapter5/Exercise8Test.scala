package chapter5

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class Exercise8Test extends FlatSpec {
  private val manufacturer = "Ford"
  private val model = "Fiesta"
  private val year = 1985
  private val license = "M 1245 AA"

  behavior of "The constructor of a Car"
  it should "produce IllegalArgumentException when the manufacturer is empty" in {
    an[IllegalArgumentException] should be thrownBy {
      new Car("", model)
    }
  }

  it should "produce IllegalArgumentException when the manufacturer is only spaces" in {
    an[IllegalArgumentException] should be thrownBy {
      new Car("  ", model)
    }
  }

  it should "produce IllegalArgumentException when the model is empty" in {
    an[IllegalArgumentException] should be thrownBy {
      new Car(manufacturer, "")
    }
  }

  it should "produce IllegalArgumentException when the model is only spaces" in {
    an[IllegalArgumentException] should be thrownBy {
      new Car(manufacturer, "  ")
    }
  }

  behavior of "A Car (with all values established)"
  private val car1 = new Car(manufacturer, model, year, license)

  it must s"have manufacturer equal to '$manufacturer'" in {
    car1.manufacturer should equal(manufacturer)
  }

  it must s"have model name equal to '$model'" in {
    car1.modelName should equal(model)
  }

  it must s"have model year equal to '$year'" in {
    car1.modelYear should equal(year)
  }

  it must s"have license plate equal to '$license'" in {
    car1.licensePlate should equal(license)
  }

  behavior of "A Car (with manufacturer and model name established)"
  private val car2 = new Car(manufacturer, model)

  it must s"have manufacturer equal to '$manufacturer'" in {
    car2.manufacturer should equal(manufacturer)
  }

  it must s"have model name equal to '$model'" in {
    car2.modelName should equal(model)
  }

  it must s"have model year equal to '${Car.DefaultModelYear}'" in {
    car2.modelYear should equal(Car.DefaultModelYear)
  }

  it must s"have license plate equal to '${Car.DefaultLicensePlate}'" in {
    car2.licensePlate should equal(Car.DefaultLicensePlate)
  }

  behavior of "A Car (with manufacturer, model name and year established)"
  private val car3 = new Car(manufacturer, model, year)

  it must s"have manufacturer equal to '$manufacturer'" in {
    car3.manufacturer should equal(manufacturer)
  }

  it must s"have model name equal to '$model'" in {
    car3.modelName should equal(model)
  }

  it must s"have model year equal to '$year'" in {
    car3.modelYear should equal(year)
  }

  it must s"have license plate equal to '${Car.DefaultLicensePlate}'" in {
    car3.licensePlate should equal(Car.DefaultLicensePlate)
  }

  behavior of "A Car (with manufacturer, model name and license plate established)"
  private val car4 = new Car(manufacturer, model, license)

  it must s"have manufacturer equal to '$manufacturer'" in {
    car4.manufacturer should equal(manufacturer)
  }

  it must s"have model name equal to '$model'" in {
    car4.modelName should equal(model)
  }

  it must s"have model year equal to '${Car.DefaultModelYear}'" in {
    car4.modelYear should equal(Car.DefaultModelYear)
  }

  it must s"have license plate equal to '$license'" in {
    car4.licensePlate should equal(license)
  }

  behavior of "A Car (with license plate changed)"
  private val car5 = new Car(manufacturer, model, license)
  private val newLicense = "new license"
  car5.licensePlate = newLicense
  it must s"have license plate equal to '$newLicense'" in {
    car5.licensePlate should equal(newLicense)
  }
}
