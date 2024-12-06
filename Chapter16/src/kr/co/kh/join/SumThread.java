package kr.co.kh.join;

public class SumThread extends Thread {
	private int sum;
	private Thread mainThread;
	
	public SumThread() {
	}

	public SumThread(Thread mainThread) {
		this.sum = sum;
		this.mainThread = mainThread;
	}

	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		//1부터 10000까지 합계를 구하고 종료하는 스레드
		for(int i=1;i<=10000;i++) {
			sum +=i;
		}
		try {
			mainThread.join();
			System.out.println("메인스레드 끝났어요");
		} catch (InterruptedException e) {}
	}
}
