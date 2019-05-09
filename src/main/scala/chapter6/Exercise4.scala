package chapter6

/**
  * Define a `Point` class with a companion object so that you can construct `Point` instances as `Point(3, 4)`,
  * without using `new`.
  **/
object Exercise4 {

}

class Point(val x: Int, val y: Int) {
  def this() = this(0, 0)
}

object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}
