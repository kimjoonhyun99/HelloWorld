package com.yedam.Interfaces;
/*
 * 인터페이스: 필드선언 (상수)
 */

public interface RemoteControl {
	// 상수는 모두 대문자를 사용, 띄어쓰기는 언더바를 사용
	// 따로 선언 하지 않아도 final 이 기본으로 들어감
	public int MAX_VOLUME = 10;
	
	public abstract void turnOn();
	public void turnOff();
		

	
}
