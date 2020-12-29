package com.learning.collection.comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student(100,"Rajiv",16);
        Student s2 = new Student(110,"Tina",15);
        Student s3 = new Student(106,"Amit",18);

        List<Student> studentsList = new LinkedList<Student>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        Collections.sort(studentsList,new AgeComparator());

        System.out.println("Sorting students by age ----");
        for(Student s: studentsList)
        {
            System.out.println(s.name+"\t"+s.rno+"\t\t"+s.age);
        }

        Collections.sort(studentsList,new NameComparator());

        System.out.println("Sorting students by name ----");
        for(Student s: studentsList)
        {
            System.out.println(s.name+"\t"+s.rno+"\t\t"+s.age);
        }

        Collections.sort(studentsList,new RnoComparator());

        System.out.println("Sorting students by Rno ----");
        for(Student s: studentsList)
        {
            System.out.println(s.name+"\t"+s.rno+"\t\t"+s.age);
        }



    }
}
