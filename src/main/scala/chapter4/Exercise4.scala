package chapter4

import scala.collection.immutable.SortedMap
import scala.collection.mutable
import scala.io.Source

/**
  * Repeat the preceding exercise with a sorted map, so that the words are
  * printed in sorted order.
  */
object Exercise4 {
  def countByWord(file: String): SortedMap[String, Int] = {
    def normalizeWord(word: String) = {
      val wordClean = for (ch <- word if ch.isLetterOrDigit) yield ch
      if (wordClean.length == 1) wordClean else wordClean.head + wordClean.tail.toLowerCase()
    }

    val lines = Source.fromResource(file).getLines()
    val map: mutable.SortedMap[String, Int] = mutable.SortedMap()

    for (line <- lines; word <- line.split(' ') if word.length > 0) {
      val w = normalizeWord(word)
      map.update(w, map.getOrElse(w, 0) + 1)
    }
    SortedMap.empty ++ map
  }
}
