package com.javalec.papa;

public class Child {
    public Child() {

    }

    public void takeMoney(int money) {
        if (PapaPouch.MONEY >= money) {
            PapaPouch.MONEY = PapaPouch.MONEY - money;
            System.out.println(PapaPouch.MONEY);

        } else {
            System.out.println("papa not enough money");

        }
    }
}
