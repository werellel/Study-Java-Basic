package com.javalec.makeClass;

public class ManClass {

    private int age;
    private int height;
    private int weight;
    private String phoneNum;

    public ManClass (int age, int height, int weight, String phoneNum) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.phoneNum = phoneNum;
    }

    public double calculateBMI() {

        double result = weight * height;
        return result;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
