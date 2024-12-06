package kr.co.kh.multi_chatting;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//클라이언트 소켓을 작동
		//1. 화면객체를 만들어서 화면에 보여준다.
		//2. 서버소켓을 만들어서 셋팅하고, 스레드를 작동시켜서 서버가 보낸 메세지를 화면에 보여준다.
		Messenger messenger = new Messenger("정건일");
	}

}
