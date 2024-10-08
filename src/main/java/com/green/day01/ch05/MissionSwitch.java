package com.green.day01.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        // 남성(m)은 키가 172cm, 여성(w)은 키가 159cm가 평균키라고 할 때

        final int AVERAGE_HEIGHT_MALE = 172;
        final int AVERAGE_HEIGHT_FEMALE = 159;

        Scanner scan = new Scanner(System.in);

        // 성별 입력 받기
        System.out.print("성별을 입력해 주세요.(w/m): ");
        String gender = scan.next();

        // 키 입력 받기
        System.out.print("키를 정수값으로 입력해 주세요.(cm): ");
        int height = scan.nextInt();

        // 성별에 따른 평균 키 비교
        switch (gender) {
            case "m": // 남성인 경우
                if (height > AVERAGE_HEIGHT_MALE) {
                    System.out.println("당신의 키는 평균보다 큽니다.");
                } else if (height < AVERAGE_HEIGHT_MALE) {
                    System.out.println("당신의 키는 평균보다 작습니다.");
                } else {
                    System.out.println("당신은 평균입니다.");
                }
                break;

            case "w": // 여성인 경우
                if (height > AVERAGE_HEIGHT_FEMALE) {
                    System.out.println("당신의 키는 평균보다 큽니다.");
                } else if (height < AVERAGE_HEIGHT_FEMALE) {
                    System.out.println("당신의 키는 평균보다 작습니다.");
                } else {
                    System.out.println("당신은 평균입니다.");
                }
                break;

            default: // 잘못된 성별 입력
                System.out.println("잘못된 성별을 입력하셨습니다.");
                break;
        }

        scan.close(); // Scanner 객체 닫기

        //당신은 평균입니다.
        //당신은 평균보다 큽니다.
        //당신은 평균보다 작습니다.

        //만약 성별:"남", 키:162cm 일 때 >> 당신의 키는 평균보다 작습니다.
        //만약 성별:"여", 키:160cm 일 때 >> 당신의 키는 평균보다 큽니다.

    }
}
