package kr.co.kh.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static final int EOF = -1;
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("d:\\data.txt");
		
		while(true) {
			int read = (int) fr.read();
			//모두읽으면 -1값을 준다. End_Of_File == EOF == -1
			if(read == -1) {
				break;
			}
			System.out.print(read);
		}
		if(fr != null) {
			fr.close();
		}
		
		System.out.println("the end");
	}

}
