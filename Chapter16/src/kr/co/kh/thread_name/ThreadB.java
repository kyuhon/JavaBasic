package kr.co.kh.thread_name;

import java.awt.Toolkit;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i =1;i<=5;i++) {
			tk.beep();
			System.out.println("땡");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}

}
