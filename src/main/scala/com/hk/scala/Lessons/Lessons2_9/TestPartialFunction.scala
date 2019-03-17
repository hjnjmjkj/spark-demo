package com.hk.scala.Lessons.Lessons2_9

object TestPartialFunction {
  val getStudentGrade: PartialFunction[String,Int]={
    case "Leo"=>90
    case "Jack"=>85
    case "Marry"=>95
  }
  def main(args: Array[String]): Unit = {
    print(getStudentGrade("Leo"))
    print(getStudentGrade.isDefinedAt("Leo"))
  }
}
