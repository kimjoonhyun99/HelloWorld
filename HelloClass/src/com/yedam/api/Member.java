package com.yedam.api;

public class Member extends Object{
	public String memberName;
	public int age;
	
	public Member() {}
	public Member(String memberName, int age) {
		this.memberName = memberName;
		this.age = age;
	}
	// 이름, 점수 => 같으면 논리적 동등한지 확인
	
	
	@Override
	public int hashCode() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 매개값의 유형이 Member 가 아니면 false
			Member members = (Member) obj;
			this.memberName = members.memberName;
			this.age = members.age;
		} 
		return false;
	}
	
	@Override
	public String toString() {
		return "이름: " + memberName + "나이: " + age;
	}
}
