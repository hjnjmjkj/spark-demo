package com.hk.scala.Lessons1_23

class Person(val name:String) extends SignatureValidHandler with  DataValidHandler {
  def sayHello ={
    println("hello,"+name)
    handle(name)
  }
}
