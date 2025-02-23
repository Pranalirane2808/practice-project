package com.example.demo.practice;

public class GlobalVariableTest {

    int x; //declaration of global variable
    int i=10;//initialization of global/instance variable.

    public static void main(String[] args) {
        GlobalVariableTest globalVar = new GlobalVariableTest();
        //this is the way to create object of class name.
        //globalVar is object name.
        System.out.println("value of x=" + globalVar.x);
        //how to print value of variable=objectName.variableName
        //+ is used to concatenate or to join

        System.out.println("value of i=" + globalVar.i);
    }
}
