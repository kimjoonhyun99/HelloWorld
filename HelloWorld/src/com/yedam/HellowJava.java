package com.yedam;

// ctrl + shft + f
public class HellowJava {
	public static void main(String[] args) {
		// int(정수), double(실수), boolean(참, 거짓)
		int num1 = 10; // 변수 초기화
		double num2 = 20; // 자동형변환 (promotion)
		
		num1 = (int)num2; // 강제형변환 (casting)
		
		int num3 = 100;
		double num4 = 200;
		double result = (double)num3 + num4; // 자동형변환으로 int + double -> double + double 이 됨 but 결과 타입을  int로 바꾸면 오류가남
		System.out.println("결과는 " + result); // 같은 데이터타입만 연산이 가능하다. 결과도 문자열 + 숫자열 이면 앞에 있는 문자열을 따라간다
		
		// 20 + 30 => 50
		System.out.println("결과는 " + (20 + 30)); // 먼저 처리된 숫자 + 숫자, 다음 처리된 문자 + 숫자 -> 문자 + 문자
		
	}
}
