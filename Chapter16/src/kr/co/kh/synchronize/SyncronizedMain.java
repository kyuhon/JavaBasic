package kr.co.kh.synchronize;

public class SyncronizedMain {

	public static void main(String[] args) {
		//공유객체생성한다
		Data data = new Data();
		
		
		//쓰레드를 작동시켜서 자리한다
		Thread t = new User1(data,100);
		
		//스레드 user2를 작동시켜서 처리한다.
		Thread t2 = new User2(data,50);
	
		t.start();
		t2.start();
	}

}
