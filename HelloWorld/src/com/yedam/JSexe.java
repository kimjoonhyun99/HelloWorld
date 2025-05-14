package com.yedam;

public class JSexe {
	public static void main(String[] args) {
		// 임의의 수를 생성, 1 ~ 10 사이의 임의의 값 생성11

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int result = (int) (Math.random() * 100) + 1;
			sum += result;
		}
		System.out.println("결과: " + sum);
		test();

		int num1 = 30;
		int num2 = 30;
		System.out.println(num1 == num2);

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2)); // 문자열을 비교 할 경우는 메소드를 추가 사용 -> equals

	} // end of main

	public static void test() {
		int sum = 0;
		// 1 ~ 10 까지의 누적.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과: " + sum);
	}// end of test
}
// end of class
