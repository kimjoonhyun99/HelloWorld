package com.yedam.ref.app;

import java.util.Scanner;

//1.회원등록, 2.수정, 3.삭제, 4.조회(이름 and "" >전체), 5.종료 기능을 담는 class
//아이디,이름,전화번호,포인트 >> 총4개 입력.
//수정 아이디 (조회항목) 전화번호(수정 정보)
//삭제 아이디(조회항목) 일치하지않을시 경고창
//조회 이름(조회) >> 나머지 정보

public class app {

	static MemberExe[] info = null;

	public static void main(String[] args) {
		inf();
		boolean run = true;
		Scanner snc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("1.회원등록 | 2.수정 | 3.삭제 | 4.조회 | 5.종료");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(snc.nextLine());
			if (selectNo > 5 || selectNo < 1) {
				System.out.println("올바르지 않은 형식 입니다.");
				continue;
			}
			if (info == null) {
				if (selectNo == 2 || selectNo == 3 || selectNo == 4) {
					System.out.println("정보를 입력하세요.");
					continue;
				}
			}
			if (selectNo == 1) {
				System.out.println("회원가입 하시겠습니까 1)예 2)아니오");
				int sel = 0;
				sel = Integer.parseInt(snc.nextLine());
				if (sel > 2 || sel < 1) {
					System.out.println("유효하지 않습니다.");
					continue;
				} else if (sel == 2) {
					System.out.println("종료합니다");
					break;
				}

				for (int i = 0; i < 10; i++) {
					System.out.printf("\ninfo[%d]아이디>> ", i);
					String ID = snc.nextLine(); // 아이디
					System.out.printf("\ninfo[%d]전화번호>> ", i);
					String PhNum = snc.nextLine(); // 전화번호
					System.out.printf("\ninfo[%d]이름>> ", i);
					String Name = snc.nextLine(); // 이름

					MemberExe infor = new MemberExe();
					infor.id = ID;
					System.out.println(infor.id);
					infor.phnum = PhNum;
					System.out.println(infor.phnum);
					infor.name = Name;
					System.out.println(infor.name);
					info[i] = infor;
					break;
				}
			} else if (selectNo == 2) {
				int re = 0;
				re = Integer.parseInt(snc.nextLine());
				System.out.println("수정하시겠습니까? 1)예 2)아니오");
				if (re > 2 || re < 1) {
					System.out.println("유효하지 않습니다.");
					continue;
				} else if (re == 2) {
					System.out.println("종료합니다");
					break;
				} else if (re == 1) {
					for (int i = 0; i < re; i++) {
						System.out.printf("\ninfo[%d]아이디>> ", i);
						String ID = snc.nextLine(); // 아이디
						System.out.printf("\ninfo[%d]전화번호>> ", i);
						String PhNum = snc.nextLine(); // 전화번호
						System.out.printf("\ninfo[%d]이름>> ", i);
						String Name = snc.nextLine(); // 이름
						System.out.printf("\ninfo[%d]포인트>> ", i);
						int Point = Integer.parseInt(snc.nextLine());
						MemberExe infor = new MemberExe();
						infor.id = ID;
						System.out.println(infor.id);
						infor.phnum = PhNum;
						System.out.println(infor.phnum);
						infor.name = Name;
						System.out.println(infor.name);
						infor.point = Point;
						info[i] = infor;
						
					}continue;
				}
			}

		}
	}

	public static void inf() {

	}

}
