package com.green.day01.ch02;

public class StudyVariableNaming {
    public static void main(String[] args) {
        /*
            my , name, is, hong

            1. Pascal Case >> MyNameIsHong

            2. Camel Case >>

            3. 스네이크 케이스 _ _ _

            4. 케밥 케이스 - - -

         */




        /*
            <변수 명명규칙>
            1.대소문자 구분, 길이 제한 없음

         */

        int abc, abC; //둘은 다른 변수이다.
        //2.예약어를 사용하면 안 된다. 파란색 문자들
        //예약어: 이미 기능의 약속이 되어 있는 단어(에디터에서 파란색으로 표시)
        //int class, void;

        // 3. 숫자로 시작 불가
        //int 1abc;

        //4. 특수기호는 달러나 언더바만 '$' , '_' 가능, 나머지는 불가
        int $abc, _abc;
        //int a#bc;

        //5. Camel Case 기법을 사용, hello, my name ,is, Kim
        int helloMyNameIsKim;

    }
}
