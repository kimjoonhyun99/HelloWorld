package com.yedam.Interfaces;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("라디오를 끕니다.");
		
	}
	
	
}
