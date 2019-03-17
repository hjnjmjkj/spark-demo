package com.hk.scala.Lessons.Lessons2_2
import scala.util.control.Breaks._;

object BreakTest {
  def main(args: Array[String]): Unit = {
    breakable {
      for (i <- 0 until 10) {
        if (i == 5) {
          break;
        }
        System.out.println("hello  world" + i );
      }

    }

  }
}
