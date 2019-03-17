package com.hk.scala.Lessons.Lessons1_16

object MapAndTuple {
  def main(args: Array[String]): Unit = {
    val ages = scala.collection.mutable.Map(20->"Leo",40->"Jack",25->"Jen");
    val ages2= for((key,value)<-ages) yield (value,key);
    println(ages2.toString());

    //Tuple
    val t=("leo",30);
    println(t._1)

    val names = Array("leo","jack","mike","hk")
    val ages3 = Array(30,24,26)
    val ages4 = Array(30,24,26)

    val nameAges = names.zip(ages3)
    for((name,age)<-nameAges) println(name+":"+age);
    val nameAges2 =ages4.zip(nameAges);
    for((name,age)<-nameAges2) println(name+":"+age);
  }
}
