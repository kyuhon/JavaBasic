package kr.co.kh.student_stream;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable{
	private int num;	//primary key (프라이머리 : 주키, 기본키, 슈퍼키)
	private String name;
	private int score;
	
	
	public Student() {
		super();
	}

	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student stu))
			return false;
		
		return this.num == stu.num;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		return 0;
	}

	
	
}
