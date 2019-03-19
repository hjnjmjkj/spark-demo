package com.hk.scala.spark.Lessons1_5

import org.apache.spark.{SparkConf, SparkContext}


object WordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
          .setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("D:\\BigData\\wordCount.txt",1)
    val words = lines.flatMap({line => line.split(" ")})
    val pairs = words.map({word => (word,1)})
    val wordCounts = pairs.reduceByKey({_+_})
    wordCounts.foreach(wordCount => println(wordCount._1 + " appeared " + wordCount._2 + "times."))

  }
}
