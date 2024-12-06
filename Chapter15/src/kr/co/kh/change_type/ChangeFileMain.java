package kr.co.kh.change_type;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeFileMain {

	public static void main(String[] args) throws IOException {
		//1. stream => Reader 변환 => BufferedReader
		//2. readline(),~~~~~~~~~~~
		
		
		FileInputStream fi = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fi,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String data = null;
		
		while((data = br.readLine())!=null) {
			System.out.println(data);
		}
		System.out.println("the end");
	}

}
