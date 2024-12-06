package kr.co.kh.book3;

public class Book3 {

	private int num;
	private String title;
	private int score;
	
	
	public Book3() {
		super();
	}

	public Book3(int num, String title, int score) {
		super();
		this.num = num;
		this.title = title;
		this.score = score;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "Book3 [num=" + num + ", title=" + title + ", score=" + score + "]";
	}
	
	
	
}
