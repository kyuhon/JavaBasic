package kr.co.kh.multi_chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	// 멤버변수, 클라이언트 이름, 클라이언트 소켓, 송신기, 수신기
	private String name;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Socket cs;

	public ServerThread(String name, DataInputStream dis, DataOutputStream dos, Socket cs) {
		super();
		this.name = name;
		this.dis = dis;
		this.dos = dos;
		this.cs = cs;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String message = dis.readUTF();
				System.out.println(message);
				if (message.equalsIgnoreCase("logout")) {
					cs.close();
					for(ServerThread st : Server.set) {
						if(st.name.equals(name)) {
							Server.set.remove(st);
							break;
						}
					}
					break;
				}
				// 상대방이 보낸 메세지를 모두에게 뿌려준다
				for (ServerThread st : Server.set) {
					st.dos.writeUTF(name+":"+message);
				}
			} catch (IOException e) {
				try {
					cs.close();
					for(ServerThread st : Server.set) {
						if(st.name.equals(name)) {
							Server.set.remove(st);
							break;
						}
					}
					break;
				} catch (IOException e1) {}
				break;
			}

		} // end of while
		
		if(dos != null) {
			try {
				dos.close();
			} catch (IOException e) {
			}
		}
		
		if(dis != null) {
			try {
				dis.close();
			} catch (IOException e) {
			}
		}
		
		if(cs != null) {
			try {
				cs.close();
			} catch (IOException e) {
			}
		}
	}
}
