package com.yedam.inheritance;

public class phoneExe {
	
	public static void main(String[] args) {
		
		
		// 부모 클래스
		CellPhone phone1 = new CellPhone();
		phone1.Model = "IT203";
		phone1.Color = "red";
		phone1.powerOn();
		phone1.powerOff();
		
		// 자식 클래스
		CellPhone phone2 = new SmartPhone();
		phone2.Model = "S21";
		phone2.Color = "white";
		phone2.powerOn();
		phone2.powerOff();
		
		
		
		
		// instanceOf 메소드 변환가능 체크
		if(phone1 instanceof SmartPhone) {
			SmartPhone phone3 = (SmartPhone) phone2;
			phone3.channel = 3;
			phone3.watch();
		}System.out.println(phone1 instanceof SmartPhone);
		
//		if(phone2 instanceof SmartPhone) {
//			phone3 = (SmartPhone) phone2;
//			phone3.channel = 3;
//			phone3.watch();
//		}
	}
	
	
}
