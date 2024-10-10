package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
        while문을 활용하여
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
        그 수들의 합을 구해서 출력하는 프로그램 값을 구하라.
         */
        int i = 1;  // 1부터 1000까지의 자연수를 체크할 변수
        int sum = 0;  // 2의 배수이자 7의 배수인 수들의 합을 저장할 변수

        // while문을 사용하여 1000 이하의 자연수를 반복
        while (i <= 1000) {
            // 2의 배수이자 7의 배수인 경우

            if ((i % 2) == 0 && (i % 7) == 0) {
                System.out.println(i);  // 해당 수를 출력
                sum += i;  // 해당 수를 합계에 더함
            }
            i++; // i를 1씩 증가
        }

        // 최종 합 출력
        System.out.println("2의 배수이자 7의 배수인 수들의 합: " + sum);

    }
}
