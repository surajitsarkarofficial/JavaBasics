package com.learning.inhertitence;

public class ParentChild {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.age=20;
        p.name="Amit";
        p.printDetails();
        p.printHello();


        Child c = new Child();
        c.age=30;
        c.name="Chandan";
        c.sal=80000;
        c.printDetails();
        c.printHello();
        c.printBye();


        Parent p1 = new Child();
        p1.age=35;
        p1.name="Rahul";
        p1.printDetails();
        p1.printHello();


    }
}
