package org.naresh.corejava.multithreading;

public class MyThread extends Thread {
	
	public void run() {
		//System.out.println(Thread.currentThread().getPriority());
		for(int i=501; i<=1500;i++) {
			System.out.println(i+Thread.currentThread().getName());
		}
	}

}
