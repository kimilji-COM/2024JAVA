package com.green.day01.ch05;

public class MissionIf {
    public static void main(String[] args) {
        /*
        아래코드에서는 두 개의 if문을 사용하고 있다. 이를 하나의 if문으로만
        사용하도록 변경해보자.

         */

        int n = 120;

        // 하나의 if문으로 결합
        if(n > 0 && (n % 2) == 0) {
            System.out.printf("%d는 양수이면서 짝수이다.\n", n);
        }

        System.out.println("--끝--");
    }
}
