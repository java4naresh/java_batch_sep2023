package org.naresh.corejava.multithreading;

public class Task {
	
	public synchronized void doTask() {
		for(int i=1; i<=1000; i++) {
			System.out.println(i+ " "+Thread.currentThread().getName());
		}
	}

}
