package kr.co.kh.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderResourcesMain {

	public static void main(String[] args) {
		//1. 상대파일을 읽어올것.(Inputstream) : FileInputStream
		//2. int -> 형변환, 배열 byte[]
		// reader와 int로 읽을것임
		int rValue = 0;
		try (FileReader fr = new FileReader("test.txt")){
			//byte [] byteArray = new byte[5];
			while((rValue = fr.read()) != -1) {
				System.out.println("rValue = "+(char)rValue+"");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("rValue = "+rValue+"");
			
			}
		}
		
	}


