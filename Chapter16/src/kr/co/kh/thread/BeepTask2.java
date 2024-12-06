package kr.co.kh.thread;

import java.awt.Toolkit;

//방법2
public class BeepTask2 extends Thread {
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		// 작업스레드가 일을하는것인데 => 메인스레드에서 작업을 진행한다. (1초마다 소리를 지름다)
		for (int i = 1; i < 6; i++) {
			tk.beep();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}

}
