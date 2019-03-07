package chapter4

/**
  * Set up a map of prices for a number of gizmos that you covet. Then produce
  * a second map with the same keys and the prices at a 10 percent discount.
  */
object Exercise1 {
  def applyDiscount(m: Map[String, Double], percentage: Int) = {
    for ((name, price) <- m) yield (name, price * (1.0 - percentage / 100.0))
  }
}
