package com.hk.scala.Lessons1_22

class MyLoggerImpl(val name:String) extends Logger {
  def sayhello: Unit ={
    println("Hi,i'm "+name);
    log("sayHello is invoked!")
  }
}
