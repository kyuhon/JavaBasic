package kr.co.kh.student;

public class Student {

	String name;
	int rollno;
	int age;
	
	public Student() {}
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void studentDepartment(String name, int rollno, int age) {
		System.out.println("이름:"+ name + " 학번:" + rollno + " 나이:" + age);
	}
	

}
