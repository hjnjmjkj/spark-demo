package com.hk.scala.Lessons.Lessons1_17

import scala.beans.BeanProperty

class Student {
  @BeanProperty
  var myName = "leo"
  def name="your name is"+myName
  def name_=(newValue:String){
    print("you cannot edit your name!!!")
  }
  def this(name:String){
    this()
    this.myName = name;
  }

}
