package com.hk.java.spark.Lessons1_12;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.List;

/**
 * 并行化集合创建RDD
 */
public class ParallelizeCollection {
    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "D:\\BigData\\hadoop");
        //创建SparkConf
        SparkConf conf = new SparkConf()
                .setAppName("ParallelizeCollection")
                .setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        JavaRDD<Integer> numberRDD = sc.parallelize(numbers);
        JavaRDD<Integer> numberFiterRDD = numberRDD.filter(a->a%2==0);
        numberFiterRDD.foreach(num->System.out.println(num));
        int num = numberRDD.reduce((a, b) -> a + b);


        System.out.println(num);

        sc.stop();
    }
}
