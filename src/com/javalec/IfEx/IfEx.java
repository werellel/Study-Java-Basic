package com.javalec.IfEx;

public class IfEx {
    public static void main(String[] args) {
        int i = 30;
        int j = 20;
        int k = 10;

        if (i > k) {
            System.out.println("i가 j보다 " + (i-j) + "만큼 크다");
        }
        int result = i - j;

        switch (result) {
            case 10:
                System.out.println("10입니다.");
                break;
            case 11:
                System.out.println("11입니다.");
                break;

            default:
                System.out.println(result+ "입니다.");
                break;

        }
    }
}
