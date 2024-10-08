package com.green.day02;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때 사용

         */
        String name = "홍길동";
        int age = 22;
        float height = 172.5f;
        char bloodType = 'o';
        boolean isMan = true;

        //홍길동의 나이는 22살 키는 172.5cm 혈액형은 O형입니다. 그는 남자입니까? true

        System.out.println(name + "의 나이는 " + age +"살 키는"
                + height +"cm 혈액혈은" + bloodType
                + "형입니다. 그는 남자입니까?" +  isMan);

        System.out.printf("%s의 나이는 %d살 키는 %fcm 혈액형은 %c형입니다. 그는 남자입니까? %b",
                name, age , height , bloodType ,isMan);
        //%F 사이의 값을 주어서 기능을 활용할 수 있다. 12는 총 12 칸을 차지한다.
        //012는 12칸을 사용하는데 빈칸이 있으면 빈칸을 0으로 채운다.

        System.out.printf("키는 %.1f\n", 172.2843857);  // NICE !!
        System.out.printf("키는 %-12.1f\n", 172.2843857);
        System.out.printf("키는 %012.1f\n", 172.2843857);
       // System.out.printf("키는 %-012.1f\n", 172.2843857); // 이건 안된다.

        int won = 230000000;
        System.out.printf("won : %d원\n", won);
        System.out.printf("won : %,d원\n", won); // NICE !!
        System.out.printf("won : %12d원\n", won);
        System.out.printf("won : %-12d원\n", won);
        System.out.printf("won : %012d원\n", won);

        String result = String.format("%,d",won);
        System.out.println("result:" + result);


    }
}
