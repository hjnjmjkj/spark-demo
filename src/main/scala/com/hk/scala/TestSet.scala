package com.hk.scala

object TestSet {
  def main(args: Array[String]): Unit = {
    val s=scala.collection.mutable.SortedSet("orage","apple","banana");
    s+="grepe";
    s.foreach(println(_));
  }
}
