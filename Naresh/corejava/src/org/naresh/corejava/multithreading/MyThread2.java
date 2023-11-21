package org.naresh.corejava.multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
		for(int i=1501; i<=2000;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
		
	}

}
