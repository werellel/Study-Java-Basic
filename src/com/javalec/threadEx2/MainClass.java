package com.javalec.threadEx2;

public class MainClass {
    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();
        Thread thread0 = new Thread(threadTest, "A");
        Thread thread1 = new Thread(threadTest, "B");

        thread0.start();
        thread1.start();

        System.out.println("line 16: " + Thread.currentThread().getName());
    }
}
