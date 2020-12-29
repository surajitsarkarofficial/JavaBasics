package com.learning.inhertitence;

public class Parent {


    String name;
    int age;

    public void printDetails()
    {
        System.out.println("Parent class called");
        System.out.println( name + "   "+ age);
    }

    public void printHello()
    {
        System.out.println("Hello from Parent...");
    }
}
