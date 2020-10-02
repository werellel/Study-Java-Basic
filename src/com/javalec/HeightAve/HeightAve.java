package com.javalec.HeightAve;

import java.util.Scanner;

public class HeightAve {
    public static void main(String[] args) {

        String[] iArrName = {"영희", "영희1", "영희2", "영희1", "영희5"};
        int[] iArr = new int[5];
        int totalHeight = 0;
        int maxH = 0;
        int maxHIndex = 0;
        int minH = 0;
        int minHIndex = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArrName[i] + "키를 입력하세요.: ");
            iArr[i] = scanner.nextInt();
            totalHeight = totalHeight + iArr[i];
        }

        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] > maxH) {
                maxH = iArr[i];
                maxHIndex = i;
            }
        }
        System.out.println("가장 큰 학생은 " + iArrName[maxHIndex] + "입니다.");
    }

}
