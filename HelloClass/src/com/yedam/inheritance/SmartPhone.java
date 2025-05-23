package com.yedam.inheritance;

public class SmartPhone extends CellPhone {

	int channel;
	public SmartPhone() {}
		public SmartPhone(String Model, String Color, int channel) {
			super();
			this.channel = channel;
		}

	void watch() {
		System.out.println(channel + " 을 시청합니다");
	}

	// 부모클레스이 기능 >> 자식클래스에서 다르게 만듦 >> overriding
	@Override
	void powerOn() {
		System.out.println("🎁 전원을 켭니다.🎁");
	}
	@Override
	void powerOff() {
		System.out.println("🎁 전원을 끕니다.🎁");
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone [channel=" + channel + "]";
	}

}
