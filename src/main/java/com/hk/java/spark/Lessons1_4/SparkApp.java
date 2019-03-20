package com.hk.java.spark.Lessons1_4;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public final class SparkApp {
    private static final Pattern SPACE = Pattern.compile(" ");

    public static void main(String[] args) throws Exception {
        //String input="hdfs://n1:8020/home/wordcount/input";
        System.setProperty("hadoop.home.dir", "D:\\BigData\\hadoop");

        String input ="D:\\BigData\\wordCount.txt";

        SparkConf sparkConf = new SparkConf().setAppName("JavaWordCount")
                .setMaster("local");
        JavaSparkContext ctx = new JavaSparkContext(sparkConf);

        //读取数据
        JavaRDD<String> lines = ctx.textFile(input, 1);
        //切割压平
        JavaRDD<String> jrdd2 = lines.flatMap(t -> Arrays.asList(t.split(" ")).iterator());
        //和1组合
        JavaPairRDD<String, Integer> jprdd = jrdd2.mapToPair(t -> new Tuple2<String, Integer>(t, 1));
        //分组聚合
        JavaPairRDD<String, Integer> counts = jprdd.reduceByKey((a, b) -> a + b);

        /*List<Tuple2<String, Integer>> output = counts.collect();
        for (Tuple2<?,?> tuple : output) {
            System.out.println(tuple._1() + ": " + tuple._2());
        }*/
        counts.saveAsTextFile("D:\\BigData\\wordCount2.txt");

        ctx.stop();
    }
}
