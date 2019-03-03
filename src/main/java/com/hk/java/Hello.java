package com.hk.java;

import com.hk.scala.Lessons1_17.Student;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student s=new Student();
        Student s2=new Student("name");
        s.name_$eq("hell");
        System.out.println(s.name());
    }
}
