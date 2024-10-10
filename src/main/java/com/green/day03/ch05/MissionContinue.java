package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*

        continueBasic의 존재하는 while 문을 for 문으로 변경해보자.

          */

        int count = 0;

        // while 문을 for 문으로 변경
        for (int n = 1; n <= 100; n++) {
            if ((n % 5 != 0) || (n % 7 != 0)) {
                continue;  // 5의 배수이면서 7의 배수가 아닌 경우 다음 반복으로 넘어감
            }
            count++;
            System.out.println("n: " + n);  // 조건을 만족하는 n 출력
        }

        System.out.println("count: " + count);  // 조건을 만족하는 숫자의 개수 출력

    }
}
