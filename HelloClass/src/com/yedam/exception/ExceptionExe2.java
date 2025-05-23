package com.yedam.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * null 값 예외
 */
public class ExceptionExe2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.메뉴  2.종료");
			System.out.println("선택>> ");
			int menu = 0;

			while (true) { // 적절한 값을 선택할 때 까지 반복
				try {
					menu = Integer.parseInt(scn.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("1.메뉴  2.종료");
					System.out.println("메뉴를 다시 선택하세요.");
					continue;
				} catch (NoSuchElementException e) {
					System.out.println("no such");
					if(!scn.hasNext()) {
						System.out.println("if");
						scn.reset();
					}
					continue;
				}
				break; // 정상 실행
			}

			switch (menu) {
			case 1:
				백업();
				break;
			case 2:
				run = false;
				break;
			default:
				System.out.println("오류: 잘못된 선택.\n종료");
			}

		} // end of while
		System.out.println("end of prog");
		scn.close();
	}

	public static void 백업() {
		// NullPointerException
		// NumberFormatExeption
		// ClassCastException
		// ArrayIndexOutOfBoundsException
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		try {
			System.out.print(str.toString());
			int num = Integer.parseInt("a");

		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("Null 값을 참조");
//		} catch (NumberFormatException e) {
//			System.out.println("포멧이 비정상");
		} finally {
			// 정상실행, 예외발생 시에도 반드시 실행해야하는 코드
			
			// 리소스를 환원
		}
		System.out.println("end of prog");
	}
}
