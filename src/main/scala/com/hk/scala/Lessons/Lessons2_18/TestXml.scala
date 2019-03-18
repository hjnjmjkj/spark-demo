package com.hk.scala.Lessons.Lessons2_18
import scala.xml._

object TestXml {
  def main(args: Array[String]): Unit = {
    val books = Array("book1","book2")
    val books2 = <books><book>{books(0)}</book><book>{books(1)}</book></books>
    println(books2)

    val booksXml = <books>{for (book <- books) yield <book>{book}</book>}</books>
    println(booksXml)
  }
}
