package kr.co.kh.thread;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		//메인스레드 숫자를 1부터 5까지 찍자(반복문을 사용)
		Runnable r = new BeepTask();
		Thread thread = new Thread(r);
		//이지점부터 작업스레드를 작동시키면되는장소(진입점)
		thread.start();
		for(int i=1;i<6;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		//1hz - 1초안에 cpu가 한번주기활동
		System.out.println("the end");
	}

}
