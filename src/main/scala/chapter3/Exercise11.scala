package chapter3

import java.awt.datatransfer._
import scala.collection.JavaConverters._
import scala.collection.mutable

/**
  * Import `java.awt.datatransfer._` and make an object of type `SystemFlavorMap` with
  * the call {{{
  * val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  * }}}
  * Then call the `getNativesForFlavor` method with parameter `DataFlavor.imageFlavor`
  * and get the return value as a Scala buffer. (Why this obscure class? It’s hard
  * to find uses of [[java.util.List]] in the standard Java library.)
  */
object Exercise11 extends App {
  val imageTypes: mutable.Buffer[String] = {
    asScalaBuffer(SystemFlavorMap.getDefaultFlavorMap
      .asInstanceOf[SystemFlavorMap]
      .getNativesForFlavor(DataFlavor.imageFlavor))
  }

  println(imageTypes)
}
