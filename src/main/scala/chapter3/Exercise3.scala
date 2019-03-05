package chapter3

/*
Repeat the preceding assignment, but produce a new array with the swapped
values. Use for / yield .
 */
object Exercise3 {
  def swap(c: Array[Int]): Array[Int] = {
    (for (i <- c.indices) yield {
      if (i % 2 == 0)
        if (i == c.length - 1) c(i)
        else c(i + 1)
      else c(i - 1)
    }).toArray
  }
}
