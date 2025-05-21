package com.yedam.inheritance;

/*
 * 부모: CellPhone
 * - 전원 켜고 끄기, 볼륨 up,down
 * - Model, Color, 
 * 자식: SamrtPhone
 * - TV 보기
 * 
 * 
 * 
 */
public class CellPhone /* extends Object */ {
	String Model;
	String Color;

	void powerOn() {
		System.out.println("전원을 켰습니다.");
	}

	void powerOff() {
		System.out.println("전원을 껏습니다.");
	}

	void 통화하기() {
		System.out.println("통화 합니다.");
	}

	// toString() 오버라이딩
	@Override
	public String toString() {
		return "CellPhone [Model=" + Model + ", Color=" + Color + "]";
	}
}
