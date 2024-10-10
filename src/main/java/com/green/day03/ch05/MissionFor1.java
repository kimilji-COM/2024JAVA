package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
        1부터 10까지의 곱의 결과를 출력하는 프로그램을 For 문을 이용해서 값을 구하라

         */
        int result = 1;  // 곱을 저장할 변수, 초기값은 1

        // for문을 사용하여 1부터 10까지의 곱을 계산
        for (int i = 1; i <= 10; i++) {
            result *= i;  // result에 현재 i 값을 곱함
        }

        // 결과 출력
        System.out.printf("1부터 10까지의 곱: " + result);

    }
}
