package com.yedam.board;

// Board: 글번호, 제목, 내용, 작성자
// getter, setter 작성 : 매소드
//기본생성자, 전체매개값을 갖는 생성자

public class Board {

	private int boardNo; // 글 번호
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자

	// 생성자
	public Board() {
	}

	public Board(int boardNo, String title, String content, String writer) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	
	//글번호, 제목, 작성자 = 간략출력.
	public void showInfo() {
		System.out.printf("%3d %12s %4s\n", boardNo, title, writer);
	}
	
	public void showAllInfo() {
		System.out.printf("%3d\n %15s\n %30s\n %4s\n", boardNo, title, content, writer);
	}
}