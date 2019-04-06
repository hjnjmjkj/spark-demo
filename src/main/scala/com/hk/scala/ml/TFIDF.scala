package com.hk.scala.ml

import org.apache.spark.ml.feature.{HashingTF, IDF,Tokenizer}
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object TFIDF {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setAppName("tfidftest1")
    conf.setMaster("local[2]")
    val sc=new SparkContext(conf)

    val sqlContext=new SQLContext(sc);
    import sqlContext.implicits._

    val sData = sqlContext.createDataFrame(Seq(
      (0,"hi i ha aaa"),
      (1,"i wish java could use case classes"),
      (1,"logistic regression models are neat"))).toDF("label","sentence")
    val tokenizer=new Tokenizer().setInputCol("sentence").setOutputCol("words")
    val wordDate=tokenizer.transform(sData)
    wordDate.show()

    val hashingTF=new HashingTF().setInputCol("words").setOutputCol("rowFeatures").setNumFeatures(20)
    val featurizedData=hashingTF.transform(wordDate)
    featurizedData.show()
    val idf=new IDF().setInputCol("rowFeatures").setOutputCol("features")
    //保持计算模型
    val idfModel=idf.fit(featurizedData)
    val rescaledDate=idfModel.transform(featurizedData)
    rescaledDate.select("features","label").take(3).foreach(println)

  }
}
