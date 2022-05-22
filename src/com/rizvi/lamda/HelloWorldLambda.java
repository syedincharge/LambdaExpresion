package com.rizvi.lamda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        // implementing sayhelloWorld using Lambda

        HelloWorldInterface helloWorldInterface = () ->  "Hello World";

        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
