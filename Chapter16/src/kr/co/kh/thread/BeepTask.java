package kr.co.kh.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public static Toolkit tk = Toolkit.getDefaultToolkit();
	
	@Override
	public void run() {
		//소리를 나게한다. 1초마다 소리가 나도록한다. 5번 반복
		for(int i=1;i<=5;i++) {
			tk.beep(); //컴퓨터에서 소리가 나는 기능
			System.out.println("땡");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
