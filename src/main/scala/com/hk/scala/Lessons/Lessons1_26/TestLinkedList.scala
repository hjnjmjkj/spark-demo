package com.hk.scala.Lessons.Lessons1_26

object TestLinkedList {
  def main(args: Array[String]): Unit = {
    val list=scala.collection.mutable.LinkedList(1,2,3,4,5)
    var currentList=list
    while (currentList!=Nil){
      currentList.elem =currentList.elem*2
      println(currentList.elem)
      currentList=currentList.next
    }
  }
}
