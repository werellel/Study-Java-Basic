package com.javalec.menu;

public class ChildMenu extends ParentMenu{
    public ChildMenu() {

    }
    public void beef() {
        System.out.println("child beef");
    }

    public void hotChicken() {
        System.out.println("hot chicken");
        super.chicken();
    }

    @Override
    public void bird() {
        System.out.println("bird");
    }

}
