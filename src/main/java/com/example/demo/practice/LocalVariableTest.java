package com.example.demo.practice;

public class LocalVariableTest {

    public void show() {
        int x=10;//Initialization of local variable
        System.out.println("Value of x:"+x);
    }

    public static void main(String[] args) {
        int m; //declaration of local variable
        int p=10;//initialization of local variable

        System.out.println(p);
        //here, we passing variable p
        System.out.println("value of p="+p);
        //here, we are writing message in double quotes then passing variable p
        //Both statements indicates output value of p is 10.

        //---> System.out.println("value of m="+m);//compile time error, because we are not initialize value of m

        LocalVariableTest localVar = new LocalVariableTest();
        //this is the way to create object of class name.
        //localVar is object name.

       //---> System.out.println("value of x:"+localVar.x);//compile time error because scope of local variable x is within show method only.

    }


}
