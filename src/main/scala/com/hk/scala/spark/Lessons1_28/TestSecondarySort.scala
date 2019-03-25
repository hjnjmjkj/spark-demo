package com.hk.scala.spark.Lessons1_28

import org.apache.spark.{SparkConf, SparkContext}

object TestSecondarySort {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("secondarySort")
      .setMaster("local")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("D:\\BigData\\SecondarySort.txt",1)
    val pairs = lines.map(line=>
      (new SecondarySortKey(line.split(" ")(0).toInt,line.split(" ")(1).toInt),line)
    )
    val sortedPairs = pairs.sortByKey(false)
    val sortedLines = sortedPairs.map(sortedPair => sortedPair._2)

    sortedLines.foreach(f=>println(f))

  }
}
