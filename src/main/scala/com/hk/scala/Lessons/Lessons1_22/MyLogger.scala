package com.hk.scala.Lessons.Lessons1_22

trait MyLogger extends Logger {
  override def log(message: String){println("log:"+message)}
}
