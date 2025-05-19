package com.yedam.ref;
/* 2차원배열 intAyr [2][3] */

public class ArrayExe2 {
	public static void main(String[] args) {
		int[][] intAry = { { 17, 22, 31 }, { 28, 38, 12 } };
		// intAry[0] => { 17, 22, 31 }; 17 => intAry[0][0]
		// intAry[1] => { 28, 38, 12 }; 12 => intAry[1][2]
		intAry[0][2] = 44;
		for (int outer = 0; outer < intAry.length; outer++) {
			for (int inner = 0; inner < intAry[outer].length; inner++) {
				System.out.printf("intAry[%d][%d]=> %d\n", outer, inner, intAry[outer][inner]);
			}
		}

		// [][], new int[5]
		int[][] ary2 = new int[3][4];
		int sum = 0;
		// (int)(Math.random() * 100) + 1'
		for (int o = 0; o < ary2.length; o++) {
			for (int i = 0; i < ary2[o].length; i++) {
				ary2[o][i] = (int)(Math.random() * 100) + 1;
				// ary2[1] 인경우 합
				if (o == 1) {
					sum += ary2[o][i];
				}
			}
		}
		System.out.printf("ary2[1]의 모든 값의 합: %d", sum );
	}
}
