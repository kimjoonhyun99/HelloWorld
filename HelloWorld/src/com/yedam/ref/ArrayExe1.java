package com.yedam.ref;

public class ArrayExe1 { // 코드는 메소드 안에 넣어야 한다.

	public static void main(String[] args) {

		// int 배열 => intAry : 10, 17, 22, 31, 55, 24
		int[] intAry = { 10, 17, 22, 31, 55, 24 };
		// 최고값 구하기.
		int temp = 0;
		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length; i++) {
				if (intAry[i] < intAry[i+1]) {
					temp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = temp;
				}
			}
		} System.out.printf(" %d ", temp);
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
	}// end of main

	public static void test3() {
		boolean roll = true;
		while (roll) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.printf("\n%d, %d", dice1, dice2);
			if (dice1 + dice2 == 5) {
				System.out.println("종료합니다.");
				roll = !roll;
			}
		}
	}

	public static void test4() {
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("\n4x%d X 5x%d = 60", x, y);
				}
			}
		}
	}

	public static void test5() {
		for (int h = 1; h <= 4; h++) {
			for (int v = 1; v <= 4; v++) {
				if (h >= v) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void test6() {
		for (int h = 1; h <= 4; h++) {
			for (int v = 1; v <= 4; v++) {
				if (h <= v) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void test7() {
		for (int h = 1; h <= 4; h++) {
			for (int v = 1; v <= 4; v++) {
				if (h + v >= 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}// end of class