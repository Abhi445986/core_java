package com.stringexmples;

public class Example1 {
    public static void main(String[] args){
        String a = "Hello";
        String b = "Hello";
        System.out.println(a==b); // true


        // == used to compare by reference
        String s = new String("hello");
        String r = new String("hello");
        System.out.println(s==r);

        // equals (): to compare by values
        System.out.println(a.equals(b));
        System.out.println(s.equals(r));



    }

}
