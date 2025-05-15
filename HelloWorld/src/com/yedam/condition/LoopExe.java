package com.yedam.condition;

import java.util.Scanner;

public class LoopExe {

	public static void main(String[] args) {

//		test();
		test1();
	}

	public static void test() {
		// while vs. do.. while
		boolean run = false;

		while (run) {
			System.out.println("while문");
		}
		do {
			System.out.println("while문");
			run = !run;
		} while (run);

		System.out.println("end of prog.");
	}

	public static void test1() {
		// 가위(1) 바위(2) 보(3) >> math.random*3+1
		// 1,2,3입력하기.
		// 비긴다 > 다시
		// 누가 이겼는지 확인, break;
		Scanner scn = new Scanner(System.in);
		int count = 0;
		int win = 0;
		do {
			System.out.println("1.가위 2.바위 3.보 4.종료");
			int random = (int) (Math.random() * 3) + 1;
			int hand = Integer.parseInt(scn.nextLine());
			if (random == hand) {
				System.out.println("비겼습니다.");
			} else if (hand > 4 || hand < 1) {
				System.out.println("유효하지 않습니다.");
			} else if (hand == 4) {
				System.out.println("종료합니다.");
				System.out.println("이긴 횟수: " + win);
				System.out.println("승률: " + (1.0*win/count)*100 + "%");
				break;
			} else if (random != hand) {
				if (random == 1 && hand == 2) {
					System.out.println("이겼습니다.");
					win++;
					count++;
					System.out.println(win);
				} else if (random == 2 && hand == 3) {
					System.out.println("이겼습니다.");
					win++;
					count++;
					System.out.println(win);
				} else if (random == 3 && hand == 1) {
					System.out.println("이겼습니다.");
					win++;
					count++;
					System.out.println(win);
				} else if (random == 1 && hand == 3) {
					System.out.println("졌습니다..");
					count++;
				} else if (random == 2 && hand == 1) {
					System.out.println("졌습니다..");
					count++;
				} else if (random == 3 && hand == 2) {
					System.out.println("졌습니다..");
					count++;
				}
			}
		} while (true);
	}
}