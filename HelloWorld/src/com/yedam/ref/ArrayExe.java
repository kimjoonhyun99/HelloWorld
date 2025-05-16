package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe {
	public static void main(String[] args) {
//		strAry();
//		deleteAry();
		friendApp();
	}

	public static void strAry() {

		Scanner scn = new Scanner(System.in);
		String[] stringAry = new String[10];

		while (true) {
			System.out.println("이름을 입력>> ");
			String name = scn.nextLine();
			if (name.equals("quit")) {
				break;
			}

			for (int i = 0; i < stringAry.length; i++) {
				if (stringAry[i] == null) {
					stringAry[i] = name;
					System.out.println("입력성공");
					break;
				} // end of if
			} // end of for
		} // end of for// end of while
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null)
				System.out.printf("stringAry[%d]번째의 값: %s\n", i, stringAry[i]);
		}
		System.out.println("end of prog");

	}

	public static void deleteAry() {
		Scanner scn = new Scanner(System.in);
		String[] stringAry = new String[10];
		stringAry[0] = "홍길동";
		stringAry[1] = "김친구";
		stringAry[2] = "김태환";
		stringAry[3] = "김태희";

		System.out.println("삭제할 친구 이름>> ");
		String name = scn.nextLine();

		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null && stringAry[i].equals(name)) {
				stringAry[i] = null; // 삭제
			} // end of if
		} // end of for
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null)
				System.out.printf("stringAry[%d]번째의 값: %s\n", i, stringAry[i]);
		}
		System.out.println("end of prog");
	}

	public static void friendApp() {
		//

		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[10];

		boolean run = true;
		while (run) {
			System.out.println("1.추가 2.목록 3.삭제 4.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu > 4 || menu < 1) {
				System.out.println("유효한 값이 아닙니다.");
			} else {
				switch (menu) {
				case 1: {
					System.out.println("이름을 입력>> ");
					String name = scn.nextLine();
					System.out.println("추가 하시겠습니까? 1.예 2.아니오");
					int menu1 = Integer.parseInt(scn.nextLine());
					switch (menu1) {
					case 1: {
						for (int i = 0; i < friendAry.length; i++) {
							if (friendAry[i] == null) {
								friendAry[i] = name;
								System.out.println("추가 되었습니다.");
								break;
							} // end of if
							if (friendAry[i].equals(name)) {
								System.out.println("중복된 이름입니다. 그래도 추가 하시겠습니까? 1.예 2.아니오");
								int menu2 = Integer.parseInt(scn.nextLine());
								if (menu2 > 2 || menu2 < 0) {
									System.out.println("호환되지 않습니다.");
								} // end of if
								else {
									if (menu2 == 1) {
										friendAry[i + 1] = name;
										break;
									} // end of if
									else {
										System.out.println("취소되었습니다.");
										break;
									}
								} // end of else
							} // end of if
						} // end of for
					} // end of case1
						break;
					// end case 1
					case 2: {
						System.out.println("취소되었습니다.");
					}
						break;
					// end of case 2
					} // end of switch
				}
					break;
				// end of case 1
				case 2: {
					for (int i = 0; i < friendAry.length; i++) {
						if (friendAry[i] != null) {
							System.out.printf("%d 번째 친구: %s\n", i + 1, friendAry[i]);
						} // end of if
						else {
							System.out.println("목록이 비어있습니다.");
							break;
						} // end of else
					}
					// end of for
				}
					break;
				// end of case 2
				case 3: {
					System.out.println("이름을 입력>> ");
					String name = scn.nextLine();
					for (int i = 0; i < friendAry.length; i++) {
						if (friendAry[i] != null && friendAry[i].equals(name)) {
							friendAry[i] = null;
						} else {
							System.out.println("찾는 이름이 없습니다.");
							break;
						} // end of if
					}break; // end of for
				} // end of case 3
				case 4: {
					if (menu == 4) {
						run = !run;
					} // end of if
					break;
				} // end of case 4
				}// end of switch
			} // end of while
			System.out.println("end of prog");
		}
	}
}