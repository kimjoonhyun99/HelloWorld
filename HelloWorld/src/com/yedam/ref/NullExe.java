package com.yedam.ref;

public class NullExe {
	
	public static void main(String[] args) {
		String str1 = "홍길동"; // new String("홍길동");
		String str2 = null;
		
//		System.out.println(str2.toString());
		
		int num1 = 10;
		int[] ary = {10, 20, 30}; // 변수선언 초기화
		int[] intAry;// 변수선언
		intAry = new int[] {40, 50, 60};// 변수 값 할당
//		System.out.printf("ary배열의 크기 %d", ary.length);
		// 첫번째 위치의 값을 400으로 변경
		intAry[0] = 400;
		
		//인덱스 3 => 4번째 위치.
//		intAry = new int[5];
//		intAry[0] =40;
//		intAry[1] =50;
//		intAry[2] =60;
//		intAry[3] =10;
//		
//		for (int i = 0; i < intAry.length; i++) {
//			System.out.printf("[%d]번째의 값: %d\n", i, intAry[i]);
		}
		
		// 배열선언 : double 값을 담은 dblAry
		// 10.2, 23.2, 34.5
		double[] dblAry = {10.2, 23.2, 34.5};
//		dblAry = new double[3];
		
		for (int i = 0; i < dblAry.length; i++) {
			System.out.printf("[%d]번째의 값: %.1f\n", i, dblAry[i]);
		}
		
		String[] strAry = new String[10];
		for (int i = 0; i < strAry.length; i++) {
			
		}

	}
	
	//배열은 선언되면 크기가 고정.
	//크기변경 하기 위해서는 새로 선언해야함.

}
