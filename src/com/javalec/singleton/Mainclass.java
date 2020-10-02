package com.javalec.singleton;

public class Mainclass {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        SingletonClass singletonClass2 = SingletonClass.getSingletonClass();

        System.out.println(singletonClass.get());
        System.out.println(singletonClass2.get());

        singletonClass.set(100);

        System.out.println(singletonClass.get());
        System.out.println(singletonClass2.get());

    }
}
