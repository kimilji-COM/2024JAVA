package com.green.day01.ch02;

public class OverFlow {
    public static void main(String[] args) {
        /*
        5리터 컵에 5리터 이상의 물을 넣었을 때, 물이 넘치게 된다.
        이 현상을 오버플로우라고 한다.
        100까지 저장할 수 있는 곳에 101 이상을 저장하게 되면 오버플로우 현상
        단, 현실과 다르다.

        byte: -128~ 127
         */

        byte var1 = 127;
        System.out.printf("var1 : %d\n", var1);

        byte var2 = (byte)129;
        System.out.printf("var2 : %d\n", var2);
    }
}
