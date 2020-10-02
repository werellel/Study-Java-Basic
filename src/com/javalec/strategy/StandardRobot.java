package com.javalec.strategy;

public class StandardRobot extends LowRobot {

    public  StandardRobot() {

    }
    @Override
    public void actionWalk() {
        System.out.println("Walk");
    }

    @Override
    public void actionRun() {
        System.out.println("actionRun");
    }

    @Override
    public void actionFly() {
        System.out.println("actionFly");

    }

    @Override
    public void actionKnife() {
        System.out.println("actionKnife");

    }

    @Override
    public void actionMisail() {
        System.out.println("actionMisail");

    }

    @Override
    public void shape() {
        System.out.println("shape");
    }

}
