package hello;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
	
		/*
	long a = 0, b = 1, c;
	int i;
	int x;
	
	System.out.print("몇 번째 항까지 출력할것인가?");
	x = scan.nextInt();
	
	System.out.println("1항:1");
	for(i = 2; i<=x; i++) {
		
		c = a+b;
		System.out.println(""+i+"항:"+c+"");
		a=b;
		b=c;
	}	*/
		/*
		System.out.print("정수를 입력하세요:");
		int user = scan.nextInt();

		switch(user){
		case 1:
		System.out.println("ONE");
		break;
		case 2:
		System.out.println("TWO");
		break;
		case 3:
		System.out.println("THREE");
		break;
		case 4:
		System.out.println("FOUR");
		break;
		case 5:
		System.out.println("FIVE");
		break;
		case 6:
		System.out.println("SIX");
		break;
		case 7:
		System.out.println("SEVEN");
		break;
		case 8:
		System.out.println("EIGHT");
		break;
		case 9:
		System.out.println("NINE");
		break;
		default:
		System.out.println("OTHER");
		break;
		}
		*/
		
		Object x = null;
		giveMeAString(x);
		System.out.println(x);

	
	}

	static void giveMeAString(Object y) {
		y = "This is a string";
	}
}