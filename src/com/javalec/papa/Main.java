package com.javalec.papa;

public class Main {
    public static void main(String[] args) {
        Child first = new Child();
        Child second = new Child();
        Child third = new Child();

        System.out.println("papa money: " + PapaPouch.MONEY);

        first.takeMoney(50);
        second.takeMoney(50);
        third.takeMoney(50);

        System.out.println("papa money: " + PapaPouch.MONEY);
        third.takeMoney(50);

        System.out.println("papa money: " + PapaPouch.MONEY);
        third.takeMoney(50);

    }
}
