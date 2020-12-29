package com.learning.strings.stringbuffer;

public class StringBufferClass {

    public static void main(String[] args) {
        StringBuffer sb1 =new StringBuffer("Hello");
        StringBuffer sb2 =new StringBuffer("Hello");
        StringBuffer sb3=sb2;
        System.out.println("sb1==sb2 - "+(sb1==sb2));
        System.out.println("sb2==sb3 - "+(sb2==sb3));

        //The equals() of StringBuffer is not overridden form Objects class
        //Hence it doesnt compares the content rather compares the reference.
        System.out.println("sb1.equals(sb2) - "+(sb1.equals(sb2)));
        System.out.println("sb2.equals(sb3) - "+(sb2.equals(sb3)));
        System.out.println("sb1.toString().equals(sb2.toString()) - "+(sb1.toString().equals(sb2.toString())));
    }
}
