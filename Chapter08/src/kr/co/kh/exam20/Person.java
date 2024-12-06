package kr.co.kh.exam20;

import java.util.Objects;

public class Person implements Comparable<Person>{
	//필드
	private String name;
	private double height;
	//매생
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	//겟터,셋터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//오버라이딩(출력)
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	//오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(name, height);
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return (height == p.height && name.equals(p.name))?(true):(false);
	}
	@Override
	public int compareTo(Person o) {
	/*	if(height-o.height == 0.0) {
			return 0;
		} else if(height>o.height) {
			return 1;
		} else {
			return -1;
		}	*/
		return (height - o.height == 0.0)?(0):((height>o.height)?(1):(-1));
	}
	
	
	
}
