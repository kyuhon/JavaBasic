package kr.co.kh.callnumber;

public class CallNumber {
	String name;
	int age;
	int callnum;
	
	public CallNumber() {
		super();
	}

	public CallNumber(String name, int age, int callnum) {
		super();
		this.name = name;
		this.age = age;
		this.callnum = callnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCallnum() {
		return callnum;
	}

	public void setCallnum(int callnum) {
		this.callnum = callnum;
	}

	@Override
	public String toString() {
		return "CallNumber [name=" + name + ", age=" + age + ", callnum=010" + callnum + "]";
	}
	
	
	
}
