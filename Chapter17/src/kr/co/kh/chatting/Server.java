package kr.co.kh.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 1.서버소켓만든다
		ServerSocket ss = null;
		Socket clientSocket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			ss = new ServerSocket(2500);
			// 2. 클라이언트 접속을 기다린다(접속할때가 무한대기)
			System.out.println("서버가 클라이언트를 접속하기를 기다리고 있습니다.");
			clientSocket = ss.accept();
			// 3. 클라이언트와 접속을 기다린다
			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			pw = new PrintWriter(clientSocket.getOutputStream());
			System.out.println("클라이언트와 대화할 송수신기 완성함.");
			// 4. 대화를 나눈다. (프로토콜) 서버 : 읽는다(읽었는데 quit 끝낸다.), 화면보여준다, 입력한다(클라이언트보낼메세지),
			while (true) {
				// 1. 읽는다(읽었는데 quit끝낸다.)
				String data = br.readLine();
				if (data.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트 연결종료");
					break;
				}
				// 2. 화면보여준다
				System.out.println("client:" + data);
				// 3. 입력한다(클라이언트보낼메세지)
				System.out.println("클라이언트 보낼메세지 입력요망:");
				String sendData = scan.nextLine();
				// 4. 보낸다
				pw.println(sendData);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
				ss.close();
				br.close();
				pw.close();
			} catch (IOException e) {
			}
		}
		System.out.println("서버소켓종료");
	}

}
