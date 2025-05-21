package com.yedam;

public class Student {
// 필드(속성 담기)
	private int studentNo;
	private String studentName;
	private double height;
	private int engScore;
	private int mathScore;
	
	//생성자 추가(객체:instance의 초기화) => 반드시 있어야함
	public Student() {
//		//매개값이 없는 생성자: 기본 생성자.
//		//컴파일러가 생성. => 아무것도 없으면 기본적인 값을 가지고 생성됨.
	}
	
	public Student(int studentNo, String studentName) {
		this.studentNo = studentNo; // 1번 매개값은 학생번호 할당
		this.studentName = studentName;
	}
	public Student(int studentNo, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	//메소드 (기능)
	// static 이 붙지 않은 메소드 = 정적 메소드
	void study() {
		System.out.println("공부를 합니다.");
	}
	
	void introduce() {
		System.out.printf("학번은%d 이고 이름은 %s 입니다.\n", studentNo, studentName);
	}
	
	// 영어, 수학점수 저장 => 앞에 set 붙임 가져오기, 가져오는 값이 없을 때 = void
	void setEngScore(int engScore) {
		if(engScore < 0 || engScore > 100) {
			return;
		}
		this.engScore = engScore;
	}
	
	void setMathScore(int mathScore) {
		if(mathScore < 0 || mathScore > 100) {
			return;
		}
		this.mathScore = mathScore;
	}
	
	void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	void setStudentName(String studentName) {
		this.studentName =studentName;
	}
	
	// 리턴값이 있을 때 = get
	String getStudentName() {
		return studentName;
	}
	
	
	int getStudentNo() {
		return studentNo;
	}
	
	int getEngScore() {
		return engScore;
	}
	
	int getMathScore() {
		return mathScore;
	}
}
