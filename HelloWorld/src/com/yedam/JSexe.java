package com.yedam;

import java.util.Scanner;

public class JSexe {

	public static void main(String[] args) {

		// 임의의 수를 생성, 30 ~ 100 사이의 임의의 값 생성
		// 평균 : ***/5 =>
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int result = (int) (Math.random() * 70) + 30;
			sum += result;
		}

		System.out.println("결과: " + sum);

		int num1 = 30;
		int num2 = 30;
		System.out.println(num1 == num2);

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2)); // 문자열을 비교 할 경우는 메소드를 추가 사용 -> equals

		String str3 = "30";
		int num3 = 30;

		System.out.println(str3.equals("" + num3));
		System.out.println();

//		test();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
		test7();
	} // end of main

	// "30" vs 30 // Interger.parseInt = "숫자" >> 문자열숫자

	public static void test() {
		int sum = 0;
		// 1 ~ 10 까지의 누적.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과: " + sum);

	} // end of test

	// 임의의 수를 생성, 30 ~ 100 사이의 임의의 값 생성
	// 평균 : ***/5 =>
	public static void test2() {
		double sum = 0;
		for (int i = 1; i <= 6; i++) {
			sum += (int) (Math.random() * 70) + 30;
		}
		double a = sum / 6.00;
		a = Math.round(a * 100) / 100.0;

		System.out.println("결과의 합 " + sum);
		System.out.println("결과의 평균 " + a);
	} // end of test(2)

	// 임의의 수를 생성, 20 ~ 110 사이의 임의의 값 생성
	// 평균 : ***/10 =>

	public static void test3() {
		int sum = 0;
		for (int i = 1; i <= 11; i++) {
			int result = (int) (Math.random() * 90) + 20; // 계산 이휴 int 가 붙기 때문에 무조건 정수로 변수가 뽑힘
			sum += result;
		}
		double avg = sum / 11.0;
		avg = Math.round(avg * 100) / 100.0;

		System.out.println("결과의 합 " + sum);
		System.out.println("결과의 평균 " + avg);
	} // end of test(3)

	public static void test4() {
		// 사용자의 입력값을 읽어들이기.
		Scanner scn = new Scanner(System.in);
		System.out.println("친구의 이름을 입력>>");
		String value = scn.nextLine(); // 입력값을 문자열 형태로 반환
		System.out.println("입력값은 " + value);
	}// end of test4

	public static void test5() {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("학생의 점수를 입력>>");
			String value = scn.nextLine();
			int score = Integer.parseInt(value);
			sum += score;
		}
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("합계: " + sum + "평균: " + avg);
	}// end of test5

	public static void test6() {

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("메세지 입력. 종료하려면 quit>>");
			String msg = scn.nextLine();
			System.out.println("입력한 값은 " + msg);
			if (msg.equals("quit")) {
				break;
			}
		}
		System.out.println("end of prog");
	}// end of test6

	public static void test7() {
		Scanner scn = new Scanner(System.in);
		String str = "친구목록은 ";
		while (true) {
			System.out.println("친구를 입력하세요,종료 하려면 quit>>");
			String msg = scn.nextLine();
			if (msg.equals("quit")) {
				break;
			}
			System.out.println("입력한 값은 " + msg);
			str += msg + " , ";
		}System.out.println(str + " 입니다.");
	}
}// end of class
