package com.hk.java.spark.Exmaple;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.hive.HiveContext;

public class UserVistSessionAnalyzeSpark {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf().setAppName("UserVistSessionAnalyzeSpark")
                .setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(sparkConf);
        sc.close();
    }

    private static SQLContext getSqlContext(SparkContext sc){
        boolean local = true;
        if(local) {
            return new SQLContext(sc);
        }else {
            return new HiveContext(sc);
        }
    }
}
