package kr.co.kh.Basketball;

import java.util.Objects;

public class Basketball implements Comparable <Basketball>{

	private String name;
	private int height;
	private int age;
	private int score;
	
	public Basketball() {
		super();
	}

	public Basketball(String name, int height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.score = 0;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void addScore(int point) {
		this.score += point;
	}
	
	@Override
	public String toString() {
		return "Basketball [name=" + name + ", height=" + height + ", age=" + age + " , score=" + score + "]";
	}

	public String intro() {
		return "name=" + name + ", height=" + height + ", age=" + age +"";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.getAge());
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Basketball)) {
			return false;
		}
		Basketball bb = (Basketball) obj;
		return this.getName().equals(bb.getName());
	}

	@Override
	public int compareTo(Basketball o) {
		return score - o.score;
	}

	
	
}
