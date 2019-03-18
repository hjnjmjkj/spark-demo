package com.hk.scala.Lessons.Lessons2_10

object TestMatch {
  def main(args: Array[String]): Unit = {
    val pattern1 = "[a-z]+".r
    for(matchString <- pattern1.findAllIn("hello,world")){
      println(matchString)
    }
  }
}
