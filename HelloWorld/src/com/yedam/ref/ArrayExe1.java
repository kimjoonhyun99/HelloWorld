package com.yedam.ref;

public class ArrayExe1 { // 코드는 메소드 안에 넣어야 한다.

	public static void main(String[] args) {
		
		//Math.random 사용 10~ 100점 사이의 점수 생성.
		//학생 10명의 점수를 생성하고 평균을 구하고 최고점수를 구한다.
		//변수명 scoreAry
		int[] scoreAry = new int[10];
		int max = 0;
		double avg = 0;
		int sum = 0;
		for(int i = 0; i < scoreAry.length-1; i++) {
			scoreAry[i] = (int)(Math.random()*91) + 10;
			if(max < scoreAry[i]) {
				max = scoreAry[i];
			}
			sum += scoreAry[i];
		}avg = 1.0*sum/10;
		System.out.printf("평균점수는 %.1f 점 이고 최고점은 %d 점 입니다.", avg, max);
		
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
//		test8();
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
	public static void test8() {
	
 	}
}// end of class