package chapter5

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

import scala.util.Random

class Exercise10Test extends FlatSpec {

  behavior of "A default Employee"
  private val employee = new Employee()

  it must "have name equal to 'John Q. Public'" in {
    employee.name should equal("John Q. Public")
  }

  it must "have salary equal to '0.0'" in {
    employee.salary should equal(0.0)
  }

  it must "be able to change the salary" in {
    val newSalary = 12.2
    employee.salary = newSalary
    employee.salary should equal(newSalary)
  }

  behavior of "A Employee"
  private val name: String = "Fred Smith"
  private val salary: Double = new Random().nextDouble() * 1000.0
  private val emp = new Employee(name, salary)

  it must s"have name equal to $name" in {
    emp.name should equal(name)
  }

  it must s"have salary equal to $salary" in {
    emp.salary should equal(salary)
  }
}
