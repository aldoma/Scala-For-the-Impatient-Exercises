package chapter4

import scala.collection.JavaConverters.propertiesAsScalaMap

/**
  * Print a table of all Java properties reported by the getProperties method of the
  * [[java.lang.System]] class, like this:
  * {{{
  * java.runtime.name      | Java(TM) SE Runtime Environment
  * sun.boot.library.path  | /home/apps/jdk1.6.0_21/jre/lib/i386
  * java.vm.version        | 17.0-b16
  * java.vm.vendor         | Sun Microsystems Inc.
  * java.vendor.url        | http://java.sun.com/
  * path.separator         | :
  * java.vm.name           | Java HotSpot(TM) Server VM
  * }}}
  * You need to find the length of the longest key before you can print the table.
  */
object Exercise7 extends App {
  private val properties = systemProperties
  private val longest = longestKey(properties)
  private val spaces = " " * longest

  private def systemProperties = {
    propertiesAsScalaMap(System.getProperties).toMap
  }

  private def longestKey(m: Map[String, String]) = m.keys map (_.length) max

  properties foreach (p => println(s"${p._1 + spaces take longest} | ${p._2}"))
}
