package kr.co.kh.thread_name;

public class ThreadMain {

	//main thread
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인스레드이름: "+mainThread.getName());
		
		
		//스레드 10번 만들어서 돌리자
		for(int i =1;i<=10;i++) {
			//방법2
			Thread thread = new ThreadA();
			//thread.setName("땡이름스레드");
			thread.start();
			
		}
		
		
		//방법1
		Runnable r = new ThreadB();
		Thread thread2 = new Thread(r,"방법1스레드");
		
		
		System.out.println("ThreadB 이름: "+thread2.getName());
	}

}
