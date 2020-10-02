package com.javalec.calex;

import java.util.Scanner;

public class CalculationEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = 3;
        int h = 5;

        System.out.println("덧셈: " + (i + j));
        i ++;
        System.out.println("증가: " + i);

        System.out.println("논리 연산자: " + (i > j && i > h));
        System.out.println("논리 연산자: " + (i > j && i < h));
        System.out.println("논리 연산자: " + (i > j || i < h));

        int result = h == 5 ? 1: 2;
        System.out.println("삼항 연산자: " + result);

    }
}