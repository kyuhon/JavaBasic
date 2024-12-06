package kr.co.kh.pratice;

public class Student {
	
	private int number;
	public String name;
	
	
	
	public Student() {
		super();
	}


	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
