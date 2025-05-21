package com.yedam.board;

/*
 * 게시판
 * BoardExe: 1.추가, 2.수정, 3.삭제, 4.목록
 * BoardApp: main, 실행
 */
public class BoardApp {
	public static void main(String[] args) {
		BoardExe exe = new BoardExe();
		exe.execute();
	}
}
