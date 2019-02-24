package com.hk.scala.Lessons1_32

object ImplicitArgsTest {
  class SignPen{
    def write(content:String) =println(content)
  }
  implicit val signPen = new SignPen

  def signForExam(name:String)(implicit signPen: SignPen): Unit ={
    signPen.write(name+" com to exam in time.")
  }

  def main(args: Array[String]): Unit = {
    signForExam("leo")
  }
}
