package hello;

import java.util.Scanner;

public class hello6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		String age = null;
		
		System.out.print("이름을 입력하시오:");
		name = scanner.nextLine();
		System.out.print("나이를 입력하시오:");
		age = scanner.nextLine();
				
		System.out.println(""+name+"님 안녕하세요! "+age+"살이시네요.");
		
		
		
	}

}
