package kr.co.kh.student2;

public class Student2 implements Comparable<Student2>{

	private final double a = 3.0;
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avr;
	
	public Student2() {
		super();
	}

	public Student2(int num, String name, int kor, int eng, int math) {
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
		return "" + num + "," + name + "," + kor + "," + eng + "," + math + ","
				+ sum + "," + avr + "";
	}
	
	public int changeSum() {
		sum = kor + eng + math;
		return sum;
	}
	
	public double changeAvr() {
		avr = changeSum() / a;
		return avr;
	}
	
	
	@Override
	public int compareTo(Student2 stu) {
		return stu.getSum() - this.sum;
	}

}
