package kr.co.kh.object;

public class ObjectMain {

	public static void main(String[] args) {

		//객체가 힙영역에 만들어짐
		Student stu = new Student(1,"홍길동");
		Student stu2 = new Student(1,"홍길도");
		
		//stu2 객체 참조값을 stu3에 줌
		Student stu3 = stu2;
		
		System.out.println(stu.toString());
		System.out.println(""+stu.equals(stu2));
		
		//hashCode는 객체주소값을 찍어준다
		System.out.println(stu.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu3.hashCode());
	}

}
