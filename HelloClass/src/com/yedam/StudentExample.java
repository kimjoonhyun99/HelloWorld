package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		//클래스    변수       인스턴스 생성  =>  필드
		
		Student student = new Student(1001, "홍길동");
//		student.studentNo = 1001;
		student.setStudentNo(1001);
//		student.studentName = "홍길동";
		student.setStudentName("홍길동");
//		student.engScore = 80;
		student.setEngScore(80);
//		student.mathScore = 85;
		student.setMathScore(85); // 속성에 대입시킴 = 80; =>X
		student.study();
		student.introduce();
		
		Student student2 = new Student(1002, "김민규");
//		student2.studentNo = 1002;
		student2.setStudentNo(1002);
//		student2.studentName = "김민규";
		student2.setStudentName("김민규");
//		student2.engScore = -50;
		student2.setEngScore(-50);
//		student2.mathScore = -80;
		student.setMathScore(-80);
		student2.study();
		student2.introduce();
		
		System.out.println("이름: " + student.getStudentName() +
				           " 학번: " + student.getStudentNo() +
				           " 수학점수: " + student.getMathScore() +
				           " 영어점수: " + student.getEngScore());
		
		System.out.println("이름: " + student2.getStudentName() +
		           " 학번: " + student2.getStudentNo() +
		           " 수학점수: " + student2.getMathScore() +
		           " 영어점수: " + student2.getEngScore());
		
	}
}
