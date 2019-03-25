package com.hk.scala.spark.Lessons1_20

import org.apache.spark.{SparkConf, SparkContext}

object TestGroupByKey {
  def main(args: Array[String]): Unit = {
    groupByKey();
  }

  def groupByKey(): Unit = {
    val conf = new SparkConf()
      .setAppName("groupByKey")
      .setMaster("local")
    val sc = new SparkContext(conf)

    val scoreList = Array(Tuple2("class1",80),Tuple2("class2",75),
      Tuple2("class2",80),Tuple2("class2",90))
    val scores = sc.parallelize(scoreList,1)
    val groupedScores = scores.groupByKey()

    groupedScores.foreach(score => {
      println(score._1); score._2.foreach(singleScore => println(singleScore))
      println("===========================")
    })
  }
}
