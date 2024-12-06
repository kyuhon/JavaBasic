package kr.co.kh.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMain {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("d:\\data.txt");
			char [] a = new char [50];
			fr.read(a);
			for(char data : a) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("data.txt 찾을수 없습니다");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("exception 발생");
		} finally {
			try {
				if(fr!=null) {
					fr.close();
					System.out.println("자원반납완료");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
