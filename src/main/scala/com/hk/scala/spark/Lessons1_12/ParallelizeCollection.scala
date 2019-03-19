package com.hk.scala.spark.Lessons1_12

import org.apache.spark.{SparkConf, SparkContext}

object ParallelizeCollection {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("ParallelizeCollection")
      .setMaster("local")
    val sc = new SparkContext(conf)

    val numbers = Array(1,2,3,4,5,6,7,8,9,10)
    val numberRDD = sc.parallelize(numbers)
    val i = numberRDD.reduce(_+_)
    println(i)
  }
}
