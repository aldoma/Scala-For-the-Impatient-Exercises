package chapter5

/**
  * Make a class `Car` with read-only properties for manufacturer, model name,
  * and model year, and a read-write property for the license plate. Supply four
  * constructors. All require the manufacturer and model name. Optionally,
  * model year and license plate can also be specified in the constructor. If not,
  * the model year is set to `-1` and the license plate to the empty string. Which
  * constructor are you choosing as the primary constructor? Why?
  */
object Exercise7 {
}

class Car(val manufacturer: String,
          val modelName: String,
          val modelYear: Int,
          var licensePlate: String) {

  require(manufacturer.trim.length > 0, "Manufacturer can not be empty")
  require(modelName.trim.length > 0, "Model name can not be empty")

  def this(manufacturer: String, modelName: String) = {
    this(manufacturer, modelName, Car.DefaultModelYear, Car.DefaultLicensePlate)
  }

  def this(manufacturer: String, modelName: String, modelYear: Int) = {
    this(manufacturer, modelName, modelYear, Car.DefaultLicensePlate)
  }

  def this(manufacturer: String, modelName: String, licensePlate: String) = {
    this(manufacturer, modelName, Car.DefaultModelYear, licensePlate)
  }
}

object Car {
  val DefaultModelYear: Int = -1
  val DefaultLicensePlate: String = ""
}
