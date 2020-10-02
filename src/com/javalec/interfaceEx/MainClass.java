package com.javalec.interfaceEx;

public class MainClass {
    public static void main(String[] args) {
        InterfaceClass interfaceClass = new InterfaceClass();
        interfaceClass.getStr();
        interfaceClass.calculate();

        InterfaceEx ife = new InterfaceClass();
        InterfaceEx2 ife2 = new InterfaceClass();
        ife.calculate();
        ife2.getStr();

    }
}
