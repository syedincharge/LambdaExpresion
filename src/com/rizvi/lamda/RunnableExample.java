package com.rizvi.lamda;

public class RunnableExample {

    public static void main(String[] args) {
        // Runnable Traditional example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i <= 10; i++)
                    sum += i;
                System.out.println("Traditional way:   "+ sum);
            }
        };
        new Thread(runnable).start();

         // Implement using Lambda

        Runnable runnable1 = () -> {
          int sum = 0;
            for (int i = 0; i <= 10; i++)
                 sum += i;
            System.out.println("Runnable Lambda :  "+sum);
        };
        new Thread(runnable1).start();


    //     Implement using Thread with Lambda
        new Thread(() -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++)
                sum += i;
            System.out.println("Thread with Lambda " + sum);
         }).start();

       }
}
