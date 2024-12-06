package kr.co.kh.nist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class NistSocketMain {

	public static void main(String[] args) {
		// new File("Nist.txt") == 외부에 디바이스(포트, 주소, 맥주)
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			socket = new Socket("time-c.nist.gov", 13);
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
		} finally {
			try {
				socket.close();
				br.close();
				isr.close();
				is.close();
				
			} catch (IOException e) {
			}
		}
		System.out.println("the end");

	}
}
