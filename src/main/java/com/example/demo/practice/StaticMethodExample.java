package com.example.demo.practice;

public class StaticMethodExample {



    //----------------------------below method is static method--------------------
    public static void testStaticMethod1() {
        System.out.println("This is a static method // by using direct method");
    }

    public static void testStaticMethod2() {
        System.out.println("This is a static method // by calling static method using class name");
    }

    public static void testStaticMethod3() {
        System.out.println("This is a static method // by calling static method using object");
    }



    public static void main(String[] args) {

        //we can caling static method by using 3 ways
        //1st
        testStaticMethod1();  ///--direct calling static method
        //2nd
        StaticMethodExample.testStaticMethod2(); // by using class name
        //3rd using object
        StaticMethodExample staticMethodExample = new StaticMethodExample();
        staticMethodExample.testStaticMethod3(); // by using object


    }
}
