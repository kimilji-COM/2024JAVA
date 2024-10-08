package com.green.day01.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");

        // 입력받은 숫자를 변수에 저장
        int input = scan.nextInt();
        System.out.printf("input: %d\n", input);

        char result = (input % 2 == 0 ? '짝':'홀');

        System.out.printf("%d는(은) %c수입니다.\n",
                input , (input % 2 == 0 ? '짝':'홀') );


        System.out.println("--끝--");
    }
}
