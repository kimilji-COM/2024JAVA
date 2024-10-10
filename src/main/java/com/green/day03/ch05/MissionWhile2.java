package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1~100까지 출력,
        100~1까지 출력 할 것이다.

        do-while, while 각 1번씩 사용하여 결과값을 나타내라.
         */


        // 1~100까지 출력 (do-while문 사용)
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);

        System.out.println();  // 줄바꿈

        // 100~1까지 출력 (while문 사용)
        int j = 100;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
    }
}
