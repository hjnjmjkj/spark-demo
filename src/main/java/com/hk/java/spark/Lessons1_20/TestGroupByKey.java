package com.hk.java.spark.Lessons1_20;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestGroupByKey {
    public static void main(String[] args) {
        groupByKey();
    }

    private static void groupByKey() {
        SparkConf conf = new SparkConf()
                .setAppName("groupByKey")
                .setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        List<Tuple2<String,Integer>> socres = Arrays.asList(
                new Tuple2<String,Integer>("class1",80),
                new Tuple2<String,Integer>("class1",90),
                new Tuple2<String,Integer>("class2",80),
                new Tuple2<String,Integer>("class2",75),
                new Tuple2<String,Integer>("class2",80)
        );

        JavaPairRDD<String,Integer> scores = sc.parallelizePairs(socres);

        JavaPairRDD<String,Iterable<Integer>> groupedScores = scores.groupByKey();

        groupedScores.foreach(t->{
            System.out.println("class: "+t._1);
            Iterator<Integer> ite = t._2.iterator();
            while (ite.hasNext()){
                System.out.println(ite.next());
            }
            System.out.println("==========================");
        });
    }
}
