package kr.co.kh.synchronize;

public class User1 extends Thread {
	//공유데이타클래스 멤버변수로 갖는다
	private Data data; //공유객체 == 화장실
	private int value;
	
	
	public User1(Data data,int value) {
		super();
		setName("Thread_User1");
		this.data = data;
		this.value = value;
	}

	@Override
	public void run() {
		//공유객체에 100입력한후 => 계산처리 => 계산결과출력
		data.setMemory(value);
	}
	
	
	
}
