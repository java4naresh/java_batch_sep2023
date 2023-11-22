package org.naresh.corejava.multithreading;

public class MyThread4 extends Thread {
	
	public void run() {
		//Thread.yield();
		for(int i=1; i<=10; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

}
