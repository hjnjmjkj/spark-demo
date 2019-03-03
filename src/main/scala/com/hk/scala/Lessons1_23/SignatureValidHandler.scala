package com.hk.scala.Lessons1_23

trait SignatureValidHandler extends Handler{
  override def handle(data: String): Unit = {
    println("check signature:"+data)
    super.handle(data)
  }
}
