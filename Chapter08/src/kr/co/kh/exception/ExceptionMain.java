package kr.co.kh.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionMain {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int result = 0;
		FileInputStream fio = null;
		
		try {
			fio = new FileInputStream("data.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			
		}
		
		System.out.println("1");
		System.out.println("2");
		try {
			result = 10 / 0;
		}catch(Exception e){
			result = -1;
		}finally {
			System.out.println("자원반납 무조건 실행");
			//문제가 발생하든 발생하지 않든 실행된다
			scan.close();
			//자원반납
			
			//자원반납할게 없으면 finally에 아무것도 쓰지않는다
		}
		
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("result = " + result);
		
		System.out.println("the end");
	
		
	}

}
