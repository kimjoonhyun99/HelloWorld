package com.yedam.ref;
// 실행 클래스
public class CalculatorExe {
	public static void main(String[] args) {
		int a = 20, b = 30;
		
		//sum 기능 활용하기.
		Calculator c1 = new Calculator();
		c1.sum(a, b); // 인스턴스 메소드 사용 방식
		
		Calculator.sum(a, b); // 정적 메소드 사용 방식
		
		CalculatorExe.ce = new CalculatorExe();
		ce.printStar();
	}
	
	void printStar() {
		System.out.println("⭐");
	}
}
