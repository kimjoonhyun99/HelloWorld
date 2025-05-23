package com.yedam.api;

public class SystemExe {
	public static void main(String[] args) {
		
		long now = System.currentTimeMillis(); // 현재시간을 1/1000 초 단위 //  60초 1분, 60초 X 60번 = 1시간 X24 = 1일
		System.out.println(now);               // 1000 => 1초, 6만 => 1분, 360만 =>1시간,*24 =>일
		//"초" => 며칠, 몇시, 몇분, 몇초

	}
	
	public static void exe() {
		
		long start = System.nanoTime(); //System.currentTimeMillis();
		int sum = 0;
		for(int i = 0; i<100000000; i++) {
			sum += i;
		}
		long end = System.nanoTime(); //System.currentTimeMillis();
		System.out.printf("합계 %d, 걸린시간 %d \n", sum, end-start);
	}
}
