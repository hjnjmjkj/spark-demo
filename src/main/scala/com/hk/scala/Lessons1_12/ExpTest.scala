package com.hk.scala.Lessons1_12
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object ExpTest {
  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>{
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}
