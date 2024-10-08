package com.green.day01.ch05;

public class MissionIf2 {

        public static void main(String[] args) {
            // 0 ~ 100 사이의 랜덤한 점수 생성
            int score = (int)(Math.random() * 101); // 0부터 100까지의 랜덤 값

            System.out.printf("score: %d\n", score);

            // 점수에 따른 등급 출력
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }

            System.out.println("--끝--");
        }

}

