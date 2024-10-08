package com.green.day01.ch04;

public class ArithOp  {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;

        System.out.printf("%d + %d = %d\n", n1 ,n2,(n1 + n2));
        System.out.printf("%d - %d = %d\n", n1 ,n2,(n1 - n2));
        System.out.printf("%d * %d = %d\n", n1 ,n2,(n1 * n2));
        System.out.printf("%d / %d = %d\n", n1 ,n2,(n1 / n2));
        System.out.printf("%d %% %d = %d\n", n1 ,n2,(n1 % n2));

        /*
        % mod 모드는 1.홀짝 2.배수 3.나누기시
        나머지-나머지 값 0일 때 짝수 1일때 홀수
        3으로 나눴을 때 나머지 값이 0이면 3의 배수이다.

        6/3 나머지가 0이 6은 3의 배수이다.

         */


    }
}
