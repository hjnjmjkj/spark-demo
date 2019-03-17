package com.hk.scala.Lessons.Lessons1_22

object TraitTest {
  def main(args: Array[String]): Unit = {
    val p:Person=new Person("huangkai");
    p.sayHello("zhangshan");
    p.makeFriends(new Person("lisi"));
  }
}
