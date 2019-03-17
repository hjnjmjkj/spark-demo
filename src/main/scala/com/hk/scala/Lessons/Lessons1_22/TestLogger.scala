package com.hk.scala.Lessons.Lessons1_22

object TestLogger {
  def main(args: Array[String]): Unit = {
    val p1 = new MyLoggerImpl("leo");
    p1.sayhello
    val p2 = new MyLoggerImpl("jack") with MyLogger;
    p2.sayhello
  }
}
