package chapter4

import scala.collection.mutable
import scala.io.Source

/**
  * Write a program that reads words from a file. Use a mutable map to count
  * how often each word appears. To read the words, simply use a [[java.util.Scanner]]:
  * {{{
  *   val in = new java.util.Scanner(new java.io.File("myfile.txt"))
  *   while (in.hasNext()) process in.next()
  * }}}
  * Or look at Chapter 9 for a Scalaesque way.
  * At the end, print out all words and their counts.
  */
object Exercise2 extends App {
  def countByWord(file: String) = {
    def normalizeWord(word: String) = {
      val wordClean = for (ch <- word if ch.isLetterOrDigit) yield ch
      if (wordClean.length == 1) wordClean else wordClean.head + wordClean.tail.toLowerCase()
    }

    val lines = Source.fromResource(file).getLines()
    val map: mutable.Map[String, Int] = mutable.Map()

    for (line <- lines; word <- line.split(' ') if word.length > 0) {
      val w = normalizeWord(word)
      map.update(w, map.getOrElse(w, 0) + 1)
    }
    map.toMap
  }
}
