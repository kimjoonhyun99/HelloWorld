package com.yedam;

import java.util.Scanner;

// sun mon tue wed thu fri sat
//=============================
//                   1   2   3
//   4   5   6   7   8   9  10
//  12  13  14  15  16  17  18

public class Calender {

	Scanner scn = new Scanner(System.in);

	static void showMonth() {
//		Month();
	}

	void Month() {
		boolean run = true;
		while (run)
			// 월수를 적으면 해당하는 타입의 달력 불러오기?
			// 홀수 달은 31일 짝수달은 30일 2월은 28일
			System.out.println("년도를 입력하세요.");
		int year = Integer.parseInt(scn.nextLine());
		try {
			year = Integer.parseInt(scn.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("년도를 다시 입력하세요.");
		}
		System.out.println("보고싶은 월을 입력하세요 1 ~ 12");
		int Mon = Integer.parseInt(scn.nextLine());
		try {
			Mon = Integer.parseInt(scn.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("월을 다시 입력하세요.");
		}
		System.out.printf("%8d년 %8d월", year, Mon);
		System.out.println(" sun mon tue wed thu fri sat\n");
		System.out.println("=============================\n");
		String space = "    ";

	}

	void Date() {

	}

	static boolean isLeapYear() {
		Scanner scn = new Scanner(System.in);
		System.out.println("년도를 입력하세요.   종료(0)");
		int year = Integer.parseInt(scn.nextLine());

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.printf("%4d년은 윤년 입니다\n", year);
			return true;
		} else if (year % 100 == 0 && year % 400 != 0) {
			System.out.printf("%4d년은 평년입니다.\n", year);
			return false;
		} else {
			System.out.printf("%4d년은 평년입니다.\n", year);
			return false;
		}
	}
}