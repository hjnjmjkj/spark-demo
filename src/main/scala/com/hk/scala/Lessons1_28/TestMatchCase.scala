package com.hk.scala.Lessons1_28

object TestMatchCase {
  def judgeGrade(name:String,grade:String): Unit ={
    grade match {
      case "A"=>println("Excellent")
      case "B"=>println("Good")
      case "C"=>println("Just so so")
      case _ if name=="leo"=>println(name+",you are a good boy,come on")
      case bb=>println("you need work harder "+bb)
    }
  }
  def main(args: Array[String]): Unit = {
    judgeGrade("le","d")
  }
}
