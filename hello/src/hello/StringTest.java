package hello;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String name = null;
		String age = null;
		String bloodType = null;
		
		System.out.println("input name=");
		name = scanner.nextLine();
		System.out.print("input age=");
		age = scanner.nextLine();
		System.out.print("input bloodType=");
		bloodType = scanner.nextLine();
		
		System.out.println("내이름은 "+name+"입니다.");
		System.out.println("내나이는 "+age+"세입니다.");
		System.out.println("내혈액형은 "+bloodType+"입니다.");
	}

}
