package kr.co.kh.objectsort;

public class Student implements Comparable<Student>{
	private int no;
	private String name;
	private int score;
	
	
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//toString 오버라이딩
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}


	//오버라이딩
	@Override
	public int hashCode() {
		return no;
	}


	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		return (no-stu.no == 0)?(true):(false);
		
	}
	@Override
	public int compareTo(Student stu) {
		return score - stu.score;
	}
	
}
