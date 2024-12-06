package kr.co.kh.multi_chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;

//다자간 클라이언트간에 데이터를 주고받는것
public class Server {
	// 1.공동클라이언소켓스레드 정보 컬렉션 프레임워크, 스레드 카운트체크
	//public static ArrayList<ServerThread> list = new ArrayList<ServerThread>();
	public static HashSet<ServerThread> set = new HashSet<ServerThread>();
	public static int clientCount = 0;

	public static void main(String[] args) throws IOException {
		// 2.서버소켓
		ServerSocket ss = new ServerSocket(5000);

		while (true) {
			// 3.클라이언트가 접속하도록 기다리고, 접속하면 클라이언소켓생성
			Socket cs = ss.accept();
			clientCount++;

			// 4.클라이언트 송수신기를 만든다
			DataInputStream dis = new DataInputStream(cs.getInputStream());
			DataOutputStream dos = new DataOutputStream(cs.getOutputStream());

			// 5.서버스레드를 만든다
			ServerThread st = new ServerThread("client" + clientCount, dis, dos, cs);

			// 6. .공동클라이언소켓스레드 정보 컬렉션 프레임워크 등록한다
			set.add(st);

			// 7. 스레드를 작동시킨다
			st.start();
		}
	}

}
