package kr.co.kh.thread;

import java.awt.Toolkit;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		// 방법1 클래스 implements Runnable(부 = 자)
		Runnable r = new BeepTask();
		Thread thread = new Thread(r);

		// 방법2 클래스 extend Thread(부 = 자)
		Thread thread2 = new BeepTask2();

		// 방법3 임시객체(Runnable 구현)
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				// 소리를 나게한다. 1초마다 소리가 나도록한다. 5번 반복
				for (int i = 1; i <= 5; i++) {
					tk.beep(); // 컴퓨터에서 소리가 나는 기능
					System.out.println("땡");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}

		};
		Thread thread3 = new Thread(r2);

		// 방법4 임시객체(Thread 임시객체)
		Thread thread4 = new Thread() {
			Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				// 소리를 나게한다. 1초마다 소리가 나도록한다. 5번 반복
				for (int i = 1; i <= 5; i++) {
					tk.beep(); // 컴퓨터에서 소리가 나는 기능
					System.out.println("땡");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};

		// 방법5 (방법3)(임시객체 -> 람다식표현한다)
		Runnable r5 = () -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				tk.beep(); // 컴퓨터에서 소리가 나는 기능
				System.out.println("땡");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		};
		Thread thread5 = new Thread(r5);

		// 1. 1~5 출력하는 프로그램작성과 비프음이 동시에 5번 반복하는 프로그램 작성
		// 스레드를 이용해라
		thread3.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

}
