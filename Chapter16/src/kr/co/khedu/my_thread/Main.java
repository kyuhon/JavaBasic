package kr.co.khedu.my_thread;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// 방법 1구현 1번
		Runnable r = new ThreadA();
		Thread thread = new Thread(r);

		// 방법 2구현 2번
		Thread thread2 = new ThreadB();

		// 방법 3구현 임시객체(Runnable)
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				// 작업스레드가 일을하는것인데 => 메인스레드에서 작업을진행한다. (1초마다 소리를 지른다)
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 1; i < 6; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}

		};
		
		Thread thread3 = new Thread(r2);
		
		// 방법 4구현 임시객체(Thread)
		Thread thread4 = new Thread() {
			@Override
			public void run() {
				// 작업스레드가 일을하는것인데 => 메인스레드에서 작업을진행한다. (1초마다 소리를 지른다)
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 1; i < 6; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		// 방법 5구현 5번을 가지고 람다식으로 표현
		
		Runnable r3 = () -> {
				// 작업스레드가 일을하는것인데 => 메인스레드에서 작업을진행한다. (1초마다 소리를 지른다)
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 1; i < 6; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

		};
		Thread thread5 = new Thread(r3);
		
		thread3.start();
		
		for(int i =1;i<6;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
