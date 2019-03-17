package com.hk.scala.Lessons.Lessons1_23

trait DataValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("check data:"+data)
    super.handle(data)
  }
}
