package com.javalec.treadEx;

public class MainClass {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest, "A");
        ThreadTest2 threadTest2 = new ThreadTest2();
        threadTest2.setName("B");

        thread.start();
        threadTest2.start();

        System.out.println("line 9: " + Thread.currentThread().getName());
    }
}
