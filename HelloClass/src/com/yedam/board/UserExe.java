package com.yedam.board;

import java.util.Scanner;

/*
 * User: 아이디, 비밀번호, 이름
 * 
 */
class User {
	private String userId;
	private String passwd;
	private String userName;

	public User(String userId, String passwd, String userName) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUserName() {
		return userName;
	}

}

public class UserExe {
	static User[] users = { new User("holy", "1111", "김영광"), new User("cutie", "2222", "홍예쁨"),
			new User("quest", "3333", "밤손님") };

	static boolean login(String uname, String passwd) {
		for (int i = 0; i < users.length; i++) {
			if (uname != null && passwd != null) {
				if (uname.equals(users[i].getUserId()) && passwd.equals(users[i].getPasswd())) {
					return true;
				}
			}
		}
		System.out.println("올바른 정보를 입력하세요.");
		return false;
	}
}
