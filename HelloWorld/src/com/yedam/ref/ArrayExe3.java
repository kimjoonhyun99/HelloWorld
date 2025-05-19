package com.yedam.ref;

// 배열 + 기본타입: 정수, 실수
// 배열 + 참조타입(클래스): 학생이름, 점수
public class ArrayExe3 {
// double.parseDouble >> 문자를 실수타입으로 바꿔줌.
	static Student[] stdAry;

	public static void main(String[] args) {
		// 배열의 값을 출력
		// 최고점을 받은 사람 이름
		init();
		int sum = 0;
		double avg = 0;
		double max = 0;
		String maxName = "";
		Student maxStd = new Student(); // 인스턴스 생성
		for (int i = 0; i < stdAry.length; i++) {
			if (max < stdAry[i].height) {
				max = stdAry[i].height;
				if(max < stdAry[i].height) {
					maxStd.studentName = stdAry[i].studentName;
					maxStd.height = stdAry[i].height;
					maxStd.gender = stdAry[i].gender;
					maxStd.score = stdAry[i].score;
				}
			}
		System.out.printf("이름:%s 점수:%d \n", stdAry[i].studentName, stdAry[i].score);
		sum += stdAry[i].score;
		avg = 1.0 * sum / stdAry.length;
		}
		String strFmt = "최고점수: %s, 이름: %s,키큰 학생: %.1f, 평균: %.2f";
		System.out.printf(strFmt, maxStd.studentName,maxStd.score, maxStd.height, avg);
	}


	public static void init() {

		Student s1 = new Student(); // 인스턴스 생성, 값을 담을 수 있는 공간을 마련 해야함.
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gender = "Men";

		Student s2 = new Student();
		s2.studentName = "김민선";
		s2.score = 85;
		s2.height = 158.2;
		s2.gender = "Women";
		
		Student s3 = new Student();
		s3.studentName = "박철민";
		s3.score = 90;
		s3.height = 192.6;
		s3.gender = "Men";

		stdAry = new Student[] { s1, s2, s3 }; // Student[]에 값을 할당
	}

	public static void test() {

		Student s1 = new Student(); // 인스턴스 생성, 값을 담을 수 있는 공간을 마련 해야함.
		s1.studentName = "홍길동";
		s1.score = 80;

		Student s2 = new Student();
		s2.studentName = "김민규";
		s2.score = 85;

		Student s3 = new Student();
		s3.studentName = "박철민";
		s3.score = 90;
		s1.score = 90;

		// 학생정보를 배열에 저장
		Student[] students = { s1, s2 };
		students[0].studentName = "홍길도";

		System.out.println(s1.studentName);

		System.out.printf("이름: %s, 점수: %d\n", s1.studentName, s1.score);
	}
}
