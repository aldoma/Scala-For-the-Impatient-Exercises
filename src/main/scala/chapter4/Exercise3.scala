package chapter4

import scala.io.Source

/**
  * Repeat the preceding exercise with an immutable map.
  */
object Exercise3 extends App {
  def countByWord(file: String) = {
    def normalizeWord(word: String) = {
      val wordClean = for (ch <- word if ch.isLetterOrDigit) yield ch
      if (wordClean.length == 1) wordClean else wordClean.head + wordClean.tail.toLowerCase()
    }

    val lines = Source.fromResource(file).getLines()
    var map: Map[String, Int] = Map()

    for (line <- lines; word <- line.split(' ') if word.length > 0) {
      val w = normalizeWord(word)
      map = map + (w -> (map.getOrElse(w, 0) + 1))
    }
    map
  }
}
