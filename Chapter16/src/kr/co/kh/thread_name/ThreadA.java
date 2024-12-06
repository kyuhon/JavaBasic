package kr.co.kh.thread_name;

import java.awt.Toolkit;

//방법2
public class ThreadA extends Thread{
	
	public ThreadA(String name) {
		setName(name);
	}
	
	public ThreadA() {
	}

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i =1;i<=5;i++) {
			tk.beep();
			System.out.println(getName()+" = 땡");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
