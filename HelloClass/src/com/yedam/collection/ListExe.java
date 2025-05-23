package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

import com.yedam.api.Member;

class Student {
	private int studentNo;
	private int score;
	
	public Student(int studentNo, int score) {
		this.studentNo = studentNo;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
}

/*
 *  인덱스를 사용해서 객체를 관리
 *  순서가 존재함. 중복된 값도 가능.(?)
 */
public class ListExe {
	public static void main(String[] args) {
// 10 ~ 100점 점수를 임의로 생성.
// List<??> numbers = new ???<>();
// 점수 10개 생성, numbers 에 담겨져있는 모든 점수를 더해 값과 평균을 구하기.
		List<Student> numbers = new ArrayList<>();
		for(int i =0; i <= 10; i++) {
			int score = (int) (Math.random() * 91) + 10;
			numbers.add(new Student(1000 + i, score));
		}
		
		int sum = 0;
		double avg = 0;
		for (int i =0; i < numbers.size(); i++) {
			sum += numbers.get(i).getScore(); // Student.score 반환
		}
		avg = 1.0 * sum / numbers.size(); // numbers.size = 10
		System.out.printf("모든 값의 합: %d, 값의 평균: %.2f", sum, avg);
	}

	public static void exe2() {
		List<Member> members = new ArrayList<>();
		Member member = new Member("김홍동", 10);
		members.add(new Member("홍길동", 10));
		members.add(new Member("김홍동", 20));
		members.add(new Member("김홍도", 30));

//		members.remover(member);
		String search = "김홍동";

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).memberName.equals(search))
				;
			{
				members.remove(i);
			}
		}
		// 목록출력
		for (int i = 0; i < members.size(); i++) {
			System.out.println();
		}

		// int[] ary = {10, 20, 30.4};
		// 인터페이스 -구현 클래스
		List<String> list = new ArrayList();
		list.add("10"); // 오브젝트의 하위이게 때문에 무엇이든 들어올수있음.
		list.add(new String("Hellow"));

		list.add(1, "20");// 위치 지정

		list.remove(0); // 삭제

		list.set(1, "World");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//		for(String item : list) {
//			String result = item;
//			System.out.println(result);
//		}
	}
}
