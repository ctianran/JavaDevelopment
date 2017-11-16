package com.chentianran;

import static com.chentianran.ThreadColor.ANSI_GREEN;
import static com.chentianran.ThreadColor.ANSI_PURPLE;
import static com.chentianran.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from main");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous Thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the MyRunnable anonymous Thread");
                try{
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again.");
                } catch(InterruptedException e) {
                    System.out.printf(ANSI_RED + "I couldn't wait after all. I was interrupted.");
                }
            }
        });
        myRunnableThread.start();
       //anotherThread.interrupt();


        System.out.println(ANSI_PURPLE + "Hello again from main");
    }
}
