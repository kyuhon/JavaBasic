package kr.co.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		//1. 상대파일을 읽어올것.(Inputstream, Reader) : FileReader
		//2. int -> 형변환, 배열 char[]
		// reader와 int로 읽을것임
		int rValue = 0;
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\javaTest\\Chapter15\\src\\kr\\co\\kh\\reader\\test.txt");
			char [] dataArray = new char[5];
			while((rValue = fr.read(dataArray)) != -1) {
				System.out.println(rValue + " = "+String.valueOf(dataArray)+"");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("rValue = "+rValue+"");
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
