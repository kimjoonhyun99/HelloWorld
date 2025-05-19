package com.yedam.ref;

import java.util.Scanner;

public class Exam06 {
	static Student[] scores = null;

	public static void main(String[] args) {
		init();

		boolean run = true;
		int studentNum = 0;

		Scanner snc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(snc.nextLine());
			if (scores == null) {
				if (selectNo == 2 || selectNo == 3 || selectNo == 4) {
					System.out.println("학생수를 지정하세요.");
					continue;
				}
			}
			if (selectNo == 1) {
				
				System.out.println("학생수>> ");
				studentNum = Integer.parseInt(snc.nextLine());
				scores = new Student[studentNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < scores.length; i++) {
					
					System.out.printf("\nscores[%d]> 이름>>", i);
					String name = snc.nextLine();// 이름저장
					System.out.printf("\nscores[%d]> 점수>>", i);
					int score = Integer.parseInt(snc.nextLine());
					System.out.printf("\nscores[%d]> 키>>", i);
					double height = Double.parseDouble(snc.nextLine());
					System.out.printf("\nscores[%d]> 성별>>", i);
					String gender = snc.nextLine();
					// 인스턴스 생성

					Student student = new Student();
					student.studentName = name;
					System.out.println(student.studentName);
					student.score = score;
					System.out.println(student.height);
					student.height = height;
					System.out.println(student.gen);
					if (gender.equals("남") || gender.equals("남자")) {
						Gender gen = Gender.MALE;
					} else if (gender.equals("여") || gender.equals("여자")) {
						Gender gen = Gender.FEMALE;
					}
					scores[i] = student; // 배열안에있는정보에 만들어둔 인스턴스를 안넣기 때문에 이후에서는 null 값으로 고정
					continue;
				}

			} else if (selectNo == 3) {
				// 배열의 합이 0이면 점수입력하세요 출력
				System.out.println("검색조건 ex) 남 또는 여");
				String keyword = snc.nextLine();
				Gender gen = Gender.MALE;
				if (keyword.equals("남") || keyword.equals("남자")) {
					gen = Gender.MALE;
				} else if (keyword.equals("여") || keyword.equals("여자")) {
					gen = Gender.FEMALE;
				}
				for (int i = 0; i < scores.length; i++) {
					if (keyword.equals("") || gen == scores[i].gen) {
						System.out.printf("학생번호[%d]> %s %d %.1f %s", i + 1, scores[i].studentName, scores[i].score,
								scores[i].height, scores[i].gen);
						continue;
					}
				}
			} else if (selectNo == 4) {
				Student maxStd = new Student();
				int max = 0, sum = 0; // 최댓값, 합계수 변수선언
				double avg = 0; // 평균 변수선언
				if (sum == 0) {
					System.out.println("점수를 입력하세요.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {

					sum += scores[i].score; // 변수를 누적시킴
					if (max < scores[i].score) {
						max = scores[i].score;
						maxStd.score = scores[i].score;
						maxStd.studentName = scores[i].studentName;
					}
					if (max < scores[i].height) {
						maxStd.height = scores[i].height;
					}
				}
				avg = 1.0 * sum / scores.length;
				System.out.printf("최고 학생: %s, 최고점수: %d, 가장 큰 키: %f,평균점수: %.2f", maxStd.studentName, max, maxStd.height,
						avg);
				System.out.println();

			} else if (selectNo == 5) {

				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}// end of main

	public static void init() {

		Student s1 = new Student(); // 인스턴스 생성, 값을 담을 수 있는 공간을 마련 해야함.
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gen = Gender.MALE;

		Student s2 = new Student();
		s2.studentName = "김민선";
		s2.score = 85;
		s2.height = 158.2;
		s2.gen = Gender.FEMALE;

		Student s3 = new Student();
		s3.studentName = "박철민";
		s3.score = 90;
		s3.height = 192.6;
		s3.gen = Gender.MALE;

		scores = new Student[] { s1, s2, s3 };
	}

}
