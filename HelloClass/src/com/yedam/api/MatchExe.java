package com.yedam.api;

public class MatchExe {
	public static void main(String[] args) {
		//절댓값
		System.out.println(Math.abs(-100));
		
		// 올림, 버림
		System.out.println(Math.floor(12.3));
		System.out.println(Math.ceil(12.3));
		System.out.println(Math.round(12.3));
		
		//크기 비교
		System.out.println(Math.max(Math.ceil(12.3), Math.floor(12.3)));
	}
}
