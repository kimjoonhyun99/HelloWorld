package com.yedam.Interfaces;

public class InterfaceExe {
	public static void main(String[] args) {
		final int num = 10;
		// 인터페이스의 변수에 구현클래스 인스턴스 할당
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Radio();
		rc.turnOn();
		rc.turnOff();
	}
}
