package com.stringexample;

public class Example8 {
    public static void main(String[] args){

      String a = "this is a test string";
      String [] r = a.split(" ");// r = ["this is a test string"]

        System.out.println(r[0]);// this
        System.out.println(r[r.length-1]);// string


    }
}
