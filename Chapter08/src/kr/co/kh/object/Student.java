package kr.co.kh.object;

import java.util.Objects;


public class Student extends Object implements Cloneable{
	private int no;
	private String name;
	
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
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


	//@Override
	//public String toString() {
	//	return "Student [no=" + no + ", name=" + name + "]";
	//}

	//kr.co.kh.object.Student@48cf768c

	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if(!(obj instanceof Student)) {
			System.out.println("비교할수 없는 객체를 보냈습니다");
			return false;
		}
		stu = (Student)obj;
		if(no==stu.no && name.equals(stu.name)) {
			return true;
		}
		return false;
	}


	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}
}
