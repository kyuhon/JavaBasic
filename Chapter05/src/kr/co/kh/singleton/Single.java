package kr.co.kh.singleton;

public class Single {
		
	//멤버변수
	private static Single instance = new Single();
	private int name;
	private int age;
	private int no;
	//생성자(디생,매생)
	private Single() {}
	//캡슐화
	public static Single getInstance() {
		return Single.instance;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	//연산함수
	
	//출력함수
	@Override
	public String toString() {
		return "Single [name=" + name + ", age=" + age + ", no=" + no + "]";
	}
	
	
}
