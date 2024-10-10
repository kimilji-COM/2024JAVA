package com.green.day03.ch05;

public class MissionCotinueBreak {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나간다.
        그리고 그 합이 언제(몇을 더했을 때) 1,000을
        넘어서는지, 그리고 1,000을 넘어선 값은 얼마가 되는지
        계산하여 출력하는 프로그램을 작성해보자.
         */

        int n = 1; // 자연수를 저장할 변수
        int sum = 0; // 합을 저장할 변수
        int count = 0; // 더한 홀수의 개수를 저장할 변수

        while (true) {
            if (n % 2 != 0) {  // 홀수인지 체크
                sum += n;      // 홀수면 합에 더함
                count++;       // 홀수를 더했으므로 카운트 증가
            }

            if (sum > 1000) {  // 합이 1000을 넘으면 종료
                System.out.println("합이 1000을 넘은 시점: " + n);
                System.out.println("1000을 넘은 최종 합: " + sum);
                System.out.println("더한 홀수의 개수: " + count);
                break;  // while 문 종료
            }

            n++;  // 다음 자연수로 넘어감
        }


    }
}
