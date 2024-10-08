package com.green.day02;

public class Mission01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        //n1 /n2 나누어서 3.33333 나올 수 있도록

        // n1을 float으로 변환해서 나누기
        float result = (float) n1 / n2; //int/ int 실수값이 날아간다.

        // 소수점 포함된 결과 출력
        System.out.printf("%d / %d = %.5f\n", n1, n2, result);  //float/float >> 결과타입도 float이다. 실수값도 살아있다.




    }
}
