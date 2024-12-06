package kr.co.kh.objectsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
		Student[] array = {new Student(2,"aaa",90),new Student(1,"bbb",190),new Student(3,"ccc",70),new Student(4,"ddd",200),new Student(0,"fff",250)};
		
		List<Student> list = Arrays.asList(array);
		
		//printArray(array);
		printList(list);

		Collections.sort(list);
		System.out.println("=====");
		printList(list);
		//printArray(array);
		//Arrays.sort(array, Collections.reverseOrder());
		Collections.reverse(list);
		System.out.println("=====");
		//printArray(array);
		printList(list);
	
		//사용자 객체이름가져오기
		Student stu = new Student(100,"abc",200);
		System.out.println(stu.getClass().getName());
		System.out.println(stu.getClass().getSimpleName());
		System.out.println(stu.getClass().getPackageName());
	}
	
	private static void printList(List<Student> list) {
		for(Student data : list) {
			System.out.println(data.toString());
		}
	}


	private static void printArray(Student[] array) {
		for(Student data : array) {
			System.out.println(data.toString());
		}
	}
}
