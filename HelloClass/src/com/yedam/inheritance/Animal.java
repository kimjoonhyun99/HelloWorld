package com.yedam.inheritance;
/*
 *  추상클래스(Animal): 인스턴스를 생성하지 않습니다.
 *                   추상메소드 <> 추상클래스
 *  자식클래스: Bird, Fish.
 *                   
 */
public abstract class Animal {
	String kind;
	
	public void breathe() {
		System.out.println("끝내주게 숨쉬기");
	}
	
	// 추상 메소드: 자식클래스에서 반드시 재정의 필요
	public abstract void sound();
}
