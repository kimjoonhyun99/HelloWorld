package com.yedam.Interfaces;
/*
 * 클래스(Television) 은 RemoteControl 인터페이스를
 * 상속(X) 구현클래스
 */
public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
}
