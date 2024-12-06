package kr.co.khedu;

public class Student {

		String name;
		int age;
		int number;
	
		
		public Student(String name,int age, int number) {
			this.name = name;
			this.age = age;
			this.number = number;
		}
		
		
		public void set이름(String name) {
			this.name = name;
		}
	
		public String get이름() {
			return this.name;
		}
		
		public void set나이(int age) {
			this.age = age;
		}
		
		public int get나이() {
			return this.age;
		}
		public void set번호(int number) {
			this.number = number;
		}
		
		public int get번호() {
			return this.number;
		}
		
		
		
		public Student() {
			
		}
}
