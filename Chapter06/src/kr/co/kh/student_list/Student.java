package kr.co.kh.student_list;

import java.util.Objects;

public class Student implements Comparable<Student> , Cloneable{
	public static final int NUM_SUB =3;
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avr;
	
	
	public Student() {
	this(0,null,0,0,0);
	}


	public Student(int num, String name, int kor, int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAvr() {
		return avr;
	}


	public void setAvr(double avr) {
		this.avr = avr;
	}


	@Override
	public String toString() {
		return "[" + num + "," + name + "," + kor + "," + eng + "," + math + ","+ sum + "," + avr + "]";
	}
	
	public int changeSum() {
		sum = kor + eng + math;
		return sum;
	}
	public void changeAverage() {
		avr = changeSum() / (double)NUM_SUB;
	}


	@Override
	public int compareTo(Student stu) {
		return stu.getSum() - this.sum;
	}


	@Override
	public int hashCode() {
		return Objects.hash(num,name);
	}


	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if(!(obj instanceof Student)) {
			System.out.println("객체비교불가");
			return false;
		}
		stu = (Student)obj;
		if(num==stu.num && name.equals(stu.name)) {
			return true;
		}
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}
		
	
	
	
}
