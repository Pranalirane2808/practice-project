package com.example.demo.practice;

public class NoNStaticMethodExample {

    //----------------------------below method is non static method---------------------------
    public void testNonStatic() {
        System.out.println("This is a NonStatic method");
    }

    //------------------------------------------------

    public String getName(String name){
        return name;
    }

    public static void main(String[] args) {

        //calling non static method
      //  testNonStatic(); //-- 1st failed
      //  NoNStaticMethodExample.testNonStatic(); // --- 2nd failed

        //-------------------------------
        NoNStaticMethodExample obj = new NoNStaticMethodExample();
        obj.testNonStatic();

        //----non static method with return type printing way 1st
        String name = obj.getName("Pranali Kulkarni");
        System.out.println(name);

        //-----non static method with return type printing way 2nd
        System.out.println(obj.getName("Pranali Bhushan Kulkarni"));
    }
}
