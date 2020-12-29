package com.learning.inhertitence;

public class Child extends Parent{

    int sal;

    @Override
    public void printDetails()
    {
        System.out.println("Child class called");
        System.out.println( name + "   "+ age + " " + sal);
    }

    public void printBye()
    {
        System.out.println("Bye from child...");
    }
}
