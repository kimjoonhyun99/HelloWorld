package com.yedam.operator;

import java.util.Scanner;

public class ScannerExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		int val = 0;
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			int menu = Integer.parseInt(scn.nextLine()); // Integer.parseInt("30");
			if (menu == 1) {
				System.out.print("입금액: ");
				balance = Integer.parseInt(scn.nextLine());
				if (balance <= 0) {
					System.out.println("올바르지 않은 형식입니다.");
				} else if (balance > 100000) {
					System.out.println("최대 예금액 초과");
				} else if (val + balance > 100000) {
					System.out.println("최대 입금액 초과");
				} else {
					val += balance;
					System.out.println("예금액:" + val);
				}
			} else if (menu == 2) {
				System.out.println("출금액: ");
				balance = Integer.parseInt(scn.nextLine());
				if (balance < 0) {
					System.out.println("올바르지 않은 형식입니다.");
				} else if (balance > val) {
					System.out.println("잔액이 부족합니다.");
				} else {
					val -= balance;
					System.out.println("잔액: " + val);
				}
				// 출금 기능
			} else if (menu == 3) {
				System.out.println("잔액: " + val);
			} else if (menu == 4) {
				break;
			} else {
				System.out.println("1~4번중에 선택하세요.");
			}
		} // end of while
		System.out.println("end of prog.");
	}
}
