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

		System.out.println(" sun mon tue wed thu fri sat\n");
		System.out.println("=============================");
		Month();
	}

	void Month() {
		boolean run = true;
		while(run)
		// 월수를 적으면 해당하는 타입의 달력 불러오기?
		// 홀수 달은 31일 짝수달은 30일 2월은 28일
		System.out.println("보고싶은 월을 입력하세요 1 ~ 12");
		int Mon = Integer.parseInt(scn.nextLine());
		if (Mon > 12 || Mon < 1) {
			System.out.println("유효하지 않습니다.");
			return;
		} else {
			switch (Mon) {
			case 1: 
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: 
			case 7: 
			case 8: 
			case 9: 
			case 10:
			case 11:
			case 12:

			}
		}
		
	}

	void Date() {
		
	}
}
