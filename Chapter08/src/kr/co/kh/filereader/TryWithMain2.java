package kr.co.kh.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMain2 {

	public static void main(String[] args) {
		FileReader fr = null;
		
		//파일을 연다 (데이터베이스 연다 = 일기장 연다)
		try {
			fr = new FileReader("d:\\data.txt");
			//일기장에 글을 읽는다
			for(;true;) {
				//25개를 한번에 읽는다.
				char[] char25Array = new char[25];
				int data = fr.read(char25Array);
				if(data == -1) {
					System.out.println("모두 읽었어요");
					break;
				}
				//문자배열을 문자열로 만들기 new String(char25Array)
				System.out.println(new String(char25Array));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

}
