package com.hk.scala.Lessons.Lessons1_22

import scala.beans.BeanProperty

class Person(val name:String) extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable {
  override def sayHello(name: String)=println("Hello,"+name)

  override def makeFriends(p: Person)=println("hello,my name is "+name+",your name is "+p.name)
}
