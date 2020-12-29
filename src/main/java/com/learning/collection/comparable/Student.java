package com.learning.collection.comparable;

public class Student implements Comparable<Student>{


    int rno;
    String name;
    int age;

    Student(int rno,String name,int age)
    {
        this.rno=rno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student s) {

        return name.compareTo(s.name);
    }

}
