package com.hk.scala.Lessons1_32

object ImplicitTest {
  class  Man(val name:String)
  class SuperMan(val name:String){
    def emitlaser =println("emit a laster!")
  }
  implicit def man2superman(man:Man): SuperMan=new SuperMan(man.name)

  def main(args: Array[String]): Unit = {
    val leo=new Man("leo")
    leo.emitlaser
  }
}
