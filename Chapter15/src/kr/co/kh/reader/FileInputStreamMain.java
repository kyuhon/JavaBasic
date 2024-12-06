package kr.co.kh.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamMain {

	public static void main(String[] args) {
		//1. 상대파일을 읽어올것.(Inputstream) : FileInputStream
		//2. int -> 형변환, 배열 byte[]
		// reader와 int로 읽을것임
		int rValue = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
			byte [] byteArray = new byte[5];
			while((rValue = fis.read(byteArray)) != -1) {
				//System.out.println("rValue = "+(char)rValue+"");
				for(int i = 0;i<rValue;i++) {
					System.out.print((char)byteArray[i]+"");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("rValue = "+rValue+"");
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
