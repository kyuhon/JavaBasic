package kr.co.kh.book;

public class Book {

	//멤버변수
	private int no;
	private String title;
	private int score;
	
	//생성자
	public Book(int no, String title, int score) {
		super();
		this.no = no;
		this.title = title;
		this.score = score;
	}
	//캡슐화

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//출력함수
	@Override
	public String toString() {
		return "Book [no=" + no + ", title=" + title + ", score=" + score + "]";
	}

	//연산함수(인스턴스 멤버 함수, 공동멤버함수)
	
	
	
	
	
	
}
