package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        /*

        구구단 5단을 출력하는 for문을 이용해서 값을 내라.

         */

        int dan = 5; // 매직넘버

        for (int i = 1; i <= 9; i++) {
            System.out.println("5 x " + i + " = " + (dan * i));
        }

    }
}
