package com.yedam.operator;

public class OperatorExe {

	public static void main(String[] args) {
		test();
		test1();
		test2();
		test3();
		test4();
		test5();
	}

	// 연습1
	public static void test() {
		// 증가, 감소 연산자 (++, --)
		byte num1 = -128; // 1바이트 = 8비트 8가지 연산 >> 1.음, 양의 값을 판단
		num1 = 127; // 2. 8비트 값 >> 2^8 > 256 = +- 128
		num1++;
		System.out.println(num1);

		char ch1 = 'A';
		for (int i = 1; i <= 25; i++) {
			System.out.println((int) ch1);
		}
	}

	public static void test1() {
		// byte, short, long, int, char >> 전부 정수타입
		byte num1 = 10;
		byte num2 = 20;
		byte sum = (byte) (num1 + num2); // 기본 정수타입으로 바꿔버림 >> int > byte 임으로 적용이 되지않음
		System.out.println(sum);

		long num3 = 10000000000L; // 정수 int 의 최댓값을 넘기는 수에는 L을 붙여서 롱형으로 만들어줌.
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE); // int 최댓값 = 2147483647
	}

	public static void test2() {
		int num1 = 10;
		int num2 = 20;

		int result = ++num1 + num2++;
		System.out.printf("num1 => %d, num2 => %d, result => %d ", num1, num2, result);

		boolean isTrue = true;
		if (!isTrue) {
			System.out.println("참입니다.");
		}
		// == 부정은 !=, >부정은 <=, >= 부정은 <
		result = 31;
		if (!(result != 30)) {
			System.out.println("\nresult 는 30");
		}

		if (!(--num1 >= 10 || num2 < 20)) {
			System.out.printf("\nnum1 => %d", num1);
		}
	}

	public static void test3() {
		boolean isTrue = true;
		for(int i = 1; i <= 10; i++) {
			if(isTrue) {
				System.out.printf("i의 값은 %d\n", i);
			}
			isTrue = !isTrue; //토글 (on => off, off => on)
		}
	}
	// "월" 정보를 입력하면 "공란" 반환하는 메소드. getSp()
	public static int getSp(int month) {
		int sp = 0;
		if(month == 3) {
			sp = 6;
		} else if (month == 4) {
			sp = 2;
		} else if (month == 5) {
			sp = 4;
		} else if (month == 7) {
			sp = 2;
		}
		return sp;
	} // end of getSp
	// 월 정보를 입력하면 말일을 알려주는 메소드 getLD(월)
	public static int getLD(int month) {
		int LD = 31;
		switch(month) {
		case 2 :
				LD = 28;
				break;
		case 4 :
		case 6 :
		case 8 :
		case 10 :
		case 12 :
			LD = 30;
			break;
		} 
		return LD;
	}
	
	public static void test4() {
		int mon = 2;
		System.out.printf(" Sun Mon Tue Wen Thu Fri Sat\n");
		//빈공간
		int sp = getSp(mon);
		int LD = getLD(mon);
		for (int s = 1; s <= sp; s++) {
			System.out.printf("%4s", " ");
		}
		for (int day =1; day <=LD; day++) {
			System.out.printf("%4d", day);
			if((day + sp)%7 == 0) {
				System.out.println();
			}
		}
	}
	public static void test5() {
		String pass = "";
		int score = (int) (Math.random() * 100);
		pass = (score >= 85) ? "우수" : (score > 60) ? "합격" : (score < 20) ? "불불합격" : "불합격" ;
		System.out.println(pass);
	}
}
