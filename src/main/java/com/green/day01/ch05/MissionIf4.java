package com.green.day01.ch05;

import com.green.day01.ch01.SystemOutPrintln;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101); // 0부터 100까지의 랜덤 값
        System.out.printf("score: %d\n", score);

        /*
         100점이면 A+
         98점이상이면 A+

         94점이상 97점 이하 A0
         90점이상 93점이하 A-

         83점이상 89점이하 B+
         84점이상 87점이하 B-

         78점이상 79점이하 C+
         74점이상 77점이하 C0
         70점이상 73점이하 C-

         나머지 점수는 모두 D라고 하자
         */

        char grade = 'D', opt ='0';

        // A 등급
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+'; // 98 이상은 A+
            } else if (score >= 94) {
                opt = '0'; // 94 이상 97 이하는 A0
            } else {
                opt = '-'; // 90 이상 93 이하는 A-
            }
        }
        // B 등급
        else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+'; // 88 이상 89 이하는 B+
            } else if (score >= 84) {
                opt = '0'; // 84 이상 87 이하는 B0
            } else {
                opt = '-'; // 80 이상 83 이하는 B-
            }
        }
        // C 등급
        else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+'; // 78 이상 79 이하는 C+
            } else if (score >= 74) {
                opt = '0'; // 74 이상 77 이하는 C0
            } else {
                opt = '-'; // 70 이상 73 이하는 C-
            }
        }
        // D는 이미 기본값으로 설정됨

        System.out.printf("학점: %c%c\n", grade, opt); // 학점 출력
        System.out.println("--끝--");



        // 점수에 따른 학점 평가
        if (score == 100 || score >= 98) {
            System.out.println("A+");
        } else if (score >= 94 && score <= 97) {
            System.out.println("A0");
        } else if (score >= 90 && score <= 93) {
            System.out.println("A-");
        } else if (score >= 88 && score <= 89) {
            System.out.println("B+");
        } else if (score >= 84 && score <= 87) {
            System.out.println("B0");
        } else if (score >= 80 && score <= 83) {
            System.out.println("B-");
        } else if (score >= 78 && score <= 79) {
            System.out.println("C+");
        } else if (score >= 74 && score <= 77) {
            System.out.println("C0");
        } else if (score >= 70 && score <= 73) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }

        System.out.println("--끝--");








    }
}
