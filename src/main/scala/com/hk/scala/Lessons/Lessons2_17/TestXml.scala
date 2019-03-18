package com.hk.scala.Lessons.Lessons2_17
import scala.xml._

object TestXml {
  def main(args: Array[String]): Unit = {
    val books = <books><book>book1</book></books>

    println(books);

    var booksBuffer = new scala.xml.NodeBuffer;
    booksBuffer += <book>book1</book>;
    booksBuffer += <book>book2</book>;
    val books2: NodeSeq = booksBuffer
    println(books2)

    val books3 = <book id="1" price ="10.0">book3</book>
    val bookId = books3.attributes("id").text
    println("bookId:"+bookId)
    for (attr <- books3.attributes){
      println(attr)
    }


  }
}
