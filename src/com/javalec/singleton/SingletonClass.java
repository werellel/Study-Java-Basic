package com.javalec.singleton;


public class SingletonClass {
    private  static  SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
    public  int i = 10;
    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {
        if(SINGLETON_CLASS_INSTANCE == null) {
            SINGLETON_CLASS_INSTANCE = new SingletonClass();
        }
        return SINGLETON_CLASS_INSTANCE;
    }

    public int get() {
        return i;
    }

    public void set(int i) {
        this.i = i;
    }
}
