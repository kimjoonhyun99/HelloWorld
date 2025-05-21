package com.yedam;
/*메소드 연습
 * 1.메소드선언
 * 2.매게변수
 * 3.반환유형
 */

public class Calculator {
	//필드
	//생성자
	//메소드
	String printStar(int times, String shape) { // 매개변수(times)
		String str = "";
		for(int i = 1; i <= times; i++) {
//			System.out.println(shape);	
			str += shape +"\n";
		}
		return str;
	}// end of printStar
	
	// 메소드 overload: 같은 메소드 이름이지만 매개값(갯수, 유형 등)이 달라야함.
	int add(int num1, int num2) { // num1 + num2 값
		return num1 + num2;
	}
	
	double add(int str1, int str2, int str3) {
		return str1 + str2 + str3;
	}
	
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	// 정수배열을 매개값으로 받는 add. 반환유형은 double
	
	double add(int[] numAry) {
		int sum = 0;
		for(int i = 0; i < numAry.length; i++) {
			sum += numAry[i];
		}return sum;
	}

}