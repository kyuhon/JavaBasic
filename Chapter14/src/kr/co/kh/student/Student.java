package kr.co.kh.student;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable,Comparable<Student> {
	private int num;
	private String name;
	private int achievement;
	
	public Student() {
		super();
	}
	public Student(int num, String name, int achievement) {
		super();
		this.num = num;
		this.name = name;
		this.achievement = achievement;
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAchievement() {
		return achievement;
	}

	public void setAchievement(int achievement) {
		this.achievement = achievement;
	}
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", achievement=" + achievement + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(num, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student student))
			return false;
		return num == student.num && name == student.name;
	}
	
	@Override
	public int compareTo(Student student) {
		return achievement - student.achievement;
	}
	
	
	
}
