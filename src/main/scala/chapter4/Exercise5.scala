package chapter4

import scala.collection.JavaConverters.mapAsScalaMap
import scala.collection.immutable.TreeMap
import scala.io.Source

/**
  * Repeat the preceding exercise with a [[java.util.TreeMap]] that you adapt to the
  * Scala API.
  */
object Exercise5 {
  def countByWord(file: String): TreeMap[String, Int] = {
    def normalizeWord(word: String) = {
      val wordClean = for (ch <- word if ch.isLetterOrDigit) yield ch
      if (wordClean.length == 1) wordClean else wordClean.head + wordClean.tail.toLowerCase()
    }

    val lines = Source.fromResource(file).getLines()
    val map: scala.collection.mutable.Map[String, Int] = mapAsScalaMap(new java.util.TreeMap[String, Int])

    for (line <- lines; word <- line.split(' ') if word.length > 0) {
      val w = normalizeWord(word)
      map.update(w, map.getOrElse(w, 0) + 1)
    }
    new TreeMap[String, Int] ++ map
  }
}
