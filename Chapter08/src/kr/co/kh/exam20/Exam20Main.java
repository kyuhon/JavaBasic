package kr.co.kh.exam20;

public class Exam20Main {

	public static void main(String[] args) {
		Person[] array = {new Person("kk1",178.5),new Person("kk2",278.5),
new Person("kk3",108.5),new Person("kk4",179.5),new Person("kk5",278.5)};
		
	}

	public static Person getMaximum(Person[] array) {
		Person max = array[0];
		for(int i =0;i<array.length;i++) {
			if(max.compareTo(array[i])<0) {
				max = array[i];
			}
		}
		return null;
	}
}
