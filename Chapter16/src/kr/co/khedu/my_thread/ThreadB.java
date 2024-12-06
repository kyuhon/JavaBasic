package kr.co.khedu.my_thread;

import java.awt.Toolkit;

public class ThreadB extends Thread {
	@Override
	public void run() {
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
	        for (int i = 1; i < 6; i++) {
	        	System.out.println("땡");
	            toolkit.beep();
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	            }
	        }
	}
}
