package kr.co.kh.thread_state;

public class ThreadStateMain {

	public static void main(String[] args) {
		Thread t = new TargetThread();
		//t.start();
		Thread thread = new TraceStateThread((TargetThread)t);
		thread.start();
		
		System.out.println("메인스레드 종료");
	}

}
