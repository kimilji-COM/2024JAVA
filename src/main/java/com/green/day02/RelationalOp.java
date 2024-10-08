package com.green.day02;

public class RelationalOp {
    public static void main(String[] args) {
        /*
            관계연산자 >> 결과 타입은 boolean(true/false)
            boolean

         */
        int n1 = 3, n2 = 2, n3 = 7;
        float n4 = 7.0F; // 리터럴 실수는 double 타입** 이기 때문에 float 타입의 실수를 사용하고 싶으면 F를 끝에 적어줌!

        //아래 n4,n7은 같은 이유로 자동 형변환이 되지 않는다.
        //대신 명시적 형변환 (강제 형변환)은 가능하다.

        double n5 = 7.0;
        double n7 = n5;
        // 리터럴 실수 뒤에 d, D를 붙여도 상관없다. 7.0, 7.0d, 7.0D 전부 double 타입

        System.out.printf("%d >= %d : %b\n", n1,n2,(n1 >= n2));
        System.out.printf("%d >= %d : %b\n", n1,n2,(n1 <= n2));
        System.out.printf("%f == %d : %b\n", n5,n3,(n5 == n3));
        System.out.printf("%f != %d : %b\n", n5,n3,(n5 != n3));

    }
}
