package com.rizvi.defaults;


public interface Calculator {

    // abstract method
    public int sum(int num1, int num2);


    //default method which is subtract
    default int subtract (int num1, int num2){
        return num1 - num2;
    }

    static int multiply (int num1, int num2){
        return num1 * num2;
    }
}
