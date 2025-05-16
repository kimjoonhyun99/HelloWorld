package com.yedam.condition;

import java.util.Scanner;

public class IfExe {

	public static void main(String[] args) {
		test();
		test1();
	}

	public static void test() {
		int score = 80;
		if (score >= 90) {
			System.out.println("학점: A");
		} else if (score >= 80) {
			System.out.println("학점: B");
		} else if (score >= 70) {
			System.out.println("학점: C");
		} else {
			System.out.println("학점: F");
		}
	}

	public static void test1() {
		// 1 ~ 1000 사이의 임의의 값을 생성. << 1번만 이름: randomValue
		// 사용자가 임의의 값을 입력.
		// 입력값 과 생성값을 비교해서 크다/작다를 알려줌.
		// 예) 임의 값: 567 > 입력 값: 500 "입력값 보다 큽니다.", 입력값: 600 > "입력값 보다 작습니다."
		// 정확하게 입력하면 "정답입니다" 이후 종료
		// 정답 입력 횟수 입력
		Scanner scn = new Scanner(System.in);
		int randomValue = (int) (Math.random() * 1000) + 1; // 0 <= X < 1000 < >> 1<= X < 1001
		int count = 0;
		while (true) {
			System.out.println("1~1000 사이의 숫자를 입력하세요 >>");
			int num = Integer.parseInt(scn.nextLine());
			if (num <= 0) {
				System.out.println("입력값이 유효하지 않습니다.");
			}	else if (num > 1000) {
				System.out.println("입력값이 유효하지 않습니다.");
			} else if (num < randomValue) {
				System.out.println("입력값이 더 작습니다.");
				count++;
			} else if (num > randomValue) {
				System.out.println("입력값이 더 큽니다.");
				count++;
			} else {
				System.out.println("정답입니다.");
				System.out.println("정답입력 횟수: " + count);
				break;
			}
		}
	}
}