package chapter3

/*
Write a code snippet that produces all values from an array with duplicates
removed. (Hint: Look at Scaladoc.)
 */
object Exercise7 extends App {
  def removeDuplicates(c: Array[Int]) = {
    c.distinct
  }

  val test = Array(4, -8, 6, 4, -1, 0, -6, 6, 0, 7, -8)
  println(s"   Original: ${test.mkString(", ")}")
  println(s"Transformed: ${removeDuplicates(test).mkString(", ")}")
}
