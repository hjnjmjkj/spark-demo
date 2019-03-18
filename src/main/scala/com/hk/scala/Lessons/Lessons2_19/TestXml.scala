package com.hk.scala.Lessons.Lessons2_19
import scala.xml._

object TestXml {
  def main(args: Array[String]): Unit = {
    val books = <books><book>book1</book></books>

    val booksCopy = books.copy(child = books.child ++ <book>book2</book>)
    println(booksCopy)

    val book = <book id="1">book1</book>

    val bookCopy = book % Attribute(null, "id","2",Null)
    println(bookCopy)

    val bookCopy2 = book % Attribute(null, "id","2",Attribute(null,"price","10.0",Null));
    println(bookCopy2)

    var coll = List(1,2,3)

  }
}
