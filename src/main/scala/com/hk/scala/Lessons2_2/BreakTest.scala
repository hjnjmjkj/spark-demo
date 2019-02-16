package com.hk.scala.Lessons2_2
import scala.util.control.Breaks._;

object BreakTest {
  def main(args: Array[String]): Unit = {
    var res =0;
    breakable {
      for (i <- 0 until 10) {
        if (i == 5) {
          break;
        }
        printf("hello  world" + i + "\n");
      }

    }

  }
}
