package com.yedam.board;

import java.util.Scanner;

// 작성, 수정, 조회, 삭제
// 현재번호에서 가장 큰 값에+1로 새로운 글 추가
// 글번호 -> 글반환 조회기능 => getBoard
// 수정 (modifyBoard) - 글번호 검색, 바꿀내용, 바뀔제목
// 삭제(removeBoard) - 글번호 있을때 null로 바꿔줌.
// 순번 부여(nextSequence)
public class BoardExe {
	private Board[] boards;
	private Scanner scn = new Scanner(System.in);
	private int bno = 10;

	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(1, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[1] = new Board(2, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
		boards[2] = new Board(3, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[3] = new Board(4, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
		boards[4] = new Board(5, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[5] = new Board(6, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
		boards[6] = new Board(7, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[7] = new Board(8, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
		boards[8] = new Board(9, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[9] = new Board(10, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
		boards[10] = new Board(11, "날씨가 좋습니다", "오늘기온이 30도가 넘습니다", "자바가 힘들어요");
		boards[11] = new Board(12, "그래요", "많이 덥습니다.", "자바는 힘들이 않아요");
	}

	void execute() {
		boolean access = loginCheck();
		boolean run = access;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.작성 2.수정 3.삭제 4.조회 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>> ");
			int selectNo = 0;

			try {
				selectNo = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("1~5번중에 선택");
				continue;
			}

			switch (selectNo) {
			case 1: // 추가
				addBoard();
				break;
			case 2: // 수정
				modifyBoard();
			case 3: // 삭제
				removeBoard();
			case 4: // 조회
				boardList();
				break;
			case 5: // 종료
				System.out.println("종료합니다.");
				run = false;
			}// end of switch
		} // end of while

	}// end of execute

	// 기능
	// "글번호를 입력하세요>> "
	// "제목을 입력하세요>> "
	// "내용을 입력하세요>> "
	// 작성자를 입력하세요 >> 홍길동
	// 추가성공/ 추가실패 메세지
	void addBoard() {
		int no = nextSequence(); // Integer.parseInt(userMessage("글번호를 입력하세요"));
		String title = userMessage("제목을 입력하세요 ");
		String content = userMessage("내용을 입력하세요 ");
		String writer = userMessage("작성자를 입력하세요 ");
		// board 인스턴스 선언하고 값을 지정
		Board board = new Board(no, title, content, writer);
		// 배열에 저장
		boards[bno++] = board;
		System.out.println("추가성공");
	}
	// 목록
	// 글번호 제목 작성자
	// ==========================
	// 1 날씨 홍길동
	// 2 qq 김민규
	// 3 ww 박석민
	// 4 ee 김민규

	// 등록된 글이 없습니다
	// 내용은 상세보기 만들기
	void boardList() {
//		sort();
		int page = 1; // while 반복문 써서 계속 조회하기
		while (true) {
			System.out.println(boards.length);
			int start = (page - 1) * 5;
			int end = (page) * 5;
			System.out.println(" 글번호   제목    작성자");
			System.out.println("====================================================");
			for (int i = start; i < end; i++) {
				if (boards[i] != null) {
					boards[i].showInfo();
				}
			}
			System.out.println("\n---------------------------------------------------");
			System.out.println("상세보기: 글번호입력, 이전(p), 다음:(n), 메뉴로 이동(q)");
			System.out.println("\n---------------------------------------------------");
			String str = scn.nextLine();
			// 메뉴, 상세
			if (str.equals("q")) {
				break;
			} else if (str.equals("n")) {
				page++;
			} else if (str.equals("p")) {
				page--;
			} else {
				int no = Integer.parseInt(str);
				// 배열에서 조회
				Board sboard = getBoard(no);
				if (sboard == null) {
					System.out.println("조회결과 없습니다.");
					break;
				}
				sboard.showAllInfo();
				System.out.println();
			}
		}
		return;
	}

	int nextSequence() {
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && max < boards[i].getBoardNo()) {
				max = boards[i].getBoardNo();
			}
		}
		return max + 1;
	}

	// 수정
	void modifyBoard() {
		int bno = userMenu("수정할 글 번호 입력");
		Board result = getBoard(bno);
		if (result == null) {
			System.out.println("조회결과가 없습니다");
			return;
		}

		String title = userMessage("수정할 제목 입력");
		String content = userMessage("수정할 내용 입력");

		result.setContent(content);
		result.setTitle(title);
		System.out.println("수정 완료");
	}

	void removeBoard() {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == bno) {
				boards[i] = new Board();
				return;
			}
		}
	}

	// 단건 조회
	// 글번호(bno)를 활용해서 배열에서 조회, Board 반환
	Board getBoard(int bno) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == bno) {
				return boards[i];
			}
		}
		return null; // 조건글 없으면 null 반환
	}

	// 사용자의 입력값을 반환
	String userMessage(String msg) {
		System.out.println(msg + ">> ");
		return scn.nextLine();
	}

	int userMenu(String msg) {
		System.out.println(msg + ">> ");
		return Integer.parseInt(scn.nextLine());
	}

	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				} else if (boards[i].getBoardNo() < boards[i + 1].getBoardNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	} // end of sort.

	boolean loginCheck() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("아이디를 입력하세요.");
			String uname = scn.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String passwd = scn.nextLine();
			UserExe.login(uname, passwd);
			if (UserExe.login(uname, passwd) == true) {
				System.out.println("환영합니다.");
				return true;
			} else {
				if (i == 3) {
					System.out.println("3번 실패하셨습니다. 프로그램을 종료합니다.");
					return false;
				}
				System.out.println("정보를 다시 입력하세요.");
				continue;
			}
		}return false;
	}
}
