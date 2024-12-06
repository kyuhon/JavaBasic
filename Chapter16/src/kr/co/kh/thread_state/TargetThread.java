package kr.co.kh.thread_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		long sum = 0;
		for (int i = 0; i < 1000000000; i++) {
				//1초동안일한다.(Runnable state)
			sum += i;
		}
		try {
			//1.5초동안 일시정지(Timed wating state)
			Thread.sleep(1500);
		} catch (InterruptedException e) {

		}

		for (int i = 0; i < 1000000000; i++) {
			sum += i;
		}
	}
}
