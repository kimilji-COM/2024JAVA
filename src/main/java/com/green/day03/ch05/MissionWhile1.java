package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
        while문을 활용하여 1~99 까지의 합을 구하는 프로그램을 만들어라
         */

        int n = 1;   // 합계를 저장할 변수
        int sum = 0;     // 시작할 값

        // while문을 사용하여 1부터 99까지의 합을 구한다
        while (n < 100) {
            sum += n++;  // 현재 숫자를 sum에 더함
        }

        // 결과 출력
        System.out.println("result = " + sum);
        System.out.println("--끝--");



    }
}
