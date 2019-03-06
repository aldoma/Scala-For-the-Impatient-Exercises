package chapter3

/*
Write a code snippet that produces all values from an array with duplicates
removed. (Hint: Look at Scaladoc.)
 */
object Exercise7 {
  def removeDuplicates(c: Array[Int]): Array[Int] = {
    c.distinct
  }
}
