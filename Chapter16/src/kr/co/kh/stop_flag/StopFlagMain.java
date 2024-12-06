package kr.co.kh.stop_flag;

public class StopFlagMain {
	//메인스레드영역 Run() == main()
	public static void main(String[] args) throws InterruptedException {
		Thread t = new StopFlagThread(); //부 = 자
		t.setDaemon(true); // 독립스레드에서 데몬스레드로 변경
		t.start();
		
		Thread.sleep(3000);
		
		//((StopFlagThread)t).interrupt(); // <- 다운캐스팅
		t.interrupt();
		System.out.println("main Thread end!");
	}

}
