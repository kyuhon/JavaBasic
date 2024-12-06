package kr.co.kh.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Socket ss = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			// 1. 서버소켓을 생성한다
			ss = new Socket("localhost",2500);
			// 2. 서버소켓에서 숨쉬기
			pw = new PrintWriter(ss.getOutputStream());
			br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			// 4. 대화를 나눈다(프로토콜) 서버: 읽는다(읽겠는데 quit 끝낸다), 화면보여준다, 입력한다(클라이언트 보낼메시지), 보낸다
			// 4. 대화를 나눈다(프로토콜) 서버: 입력한다(서버보낼메세지), 보낸다(끝내고싶으면 quit 보낸다), 읽는다, 화면보여준다
			while (true) {
				// 입력한다(서버보낼메세지)
				System.out.println("서버보낼메세지:");
				String sendData = scan.nextLine();
				// 보낸다(끝내고싶으면 quit 보낸다)
				pw.println(sendData);
				if(sendData.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트 종료요청");
					break;
				}
				String input = br.readLine();
				if(input == null) {
					System.out.println("서버 연결이 종료되었습니다");
					break;
				}
				System.out.println("서버에서 보낸 메세지:"+input);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서버가 닫혔습니다.");
		} finally {
			try {
				ss.close();
				pw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("클라이언트 종료");
	}

}
