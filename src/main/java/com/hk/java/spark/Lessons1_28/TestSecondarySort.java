package com.hk.java.spark.Lessons1_28;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

public class TestSecondarySort {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf()
                .setAppName("TestSecondarySort")
                .setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> lines = sc.textFile("D:\\BigData\\SecondarySort.txt");
        JavaPairRDD<SecondarySortKey,String> pairs = lines.mapToPair(line->{
           String[] lineSplited = line.split(" ");
           SecondarySortKey key = new SecondarySortKey(
                   Integer.valueOf(lineSplited[0]),
                   Integer.valueOf(lineSplited[1])
           );
            return new Tuple2<>(key,line);
        });
        JavaPairRDD<SecondarySortKey,String> sortedParis =pairs.sortByKey();

        JavaRDD<String> sortedLines =sortedParis.map(t ->t._2);

        sortedLines.foreach(t->System.out.println(t));

        sc.close();
    }
}
