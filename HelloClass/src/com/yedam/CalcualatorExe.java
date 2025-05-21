package com.yedam;


public class CalcualatorExe {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1 = 10;
		String str = "😊";
		String result = cal.printStar(num1, str); //매개변수 >> 값 지정
//		System.out.println(result);
		
		
//		double sum = cal.add(num1, 10.5);
		
		int[] numAry = { 10, 20, 30, 40 };
		double sum = cal.add(numAry);
		
		Member[] members = {new Member("user01","홍길동","1111",1000)
				,new Member("user02","김민규","2222",2200)
				,new Member("user03","황선홍","3333",2700)
				,new Member("user04","홍명보","4444",1900)
		};
		// 반환유형(Member), 매개변수(Member[])
		
		
		
		
//		System.out.println(sum);
//		System.out.println("10");
//		System.out.println(10);
//		System.out.println(true);
		
	}
}
