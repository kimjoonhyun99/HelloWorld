package com.yedam;

public class Member {
	String memberId;
	String memberName;
	String phone;
	int point;

	
	public Member() {
		
	}
	
	public Member(String memberId, String memberName, String phone, int point) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}

	void setMemberId(String id) {
		this.memberId = id;
	}
	
	void setMemberName(String name) {
		this.memberName = name;
	}
	
	void setPhone(String phone) {
		this.phone = phone;
	}
	
	 void setPoint(int point) {
		this.point = point;
	}
	
	String getMemberId() {
		return memberId;
	}
	
	String getMembeName() {
		return memberName;
	}
	
	String getPhone() {
		return phone;
	}
	
	int getPoint() {
		return point;
	}
	
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s, 포인트는 %d\n", Member., phone, point);
	}
}
