package com.rizvi.defaults;

public class MathOperationExample implements  Calculator {

    public static void main(String[] args) {

        MathOperationExample mathOperationExample = new MathOperationExample();
        System.out.println("SUM  :  "+mathOperationExample.sum(2, 4));
       System.out.println("Subtract    :  "+mathOperationExample.subtract(4, 2));
       System.out.println("Multiply    :  "+Calculator.multiply(4, 2));


        // our implementation for Sum and divide using Lambda Expression

        Calculator calculator = (num1, num2) -> num1%num2;
        System.out.println("Calculator override using lambda : " + calculator.sum(3, 2));
    }


    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

}
