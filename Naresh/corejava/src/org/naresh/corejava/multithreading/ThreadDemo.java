package org.naresh.corejava.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread mt = new MyThread();//creating new thread by extends Thread 
		mt.setName("Naresh Thread1");
		mt.start();//start
		
		MyThread2 mt2 = new MyThread2();//creating new thread by implements Runnable
		Thread thread2 = new Thread(mt2);
		thread2.setName("Naresh Thread2");
		thread2.start();//start
		
		for(int i=1;i<=500;i++) {
			System.out.println(i+ Thread.currentThread().getName());
		}

	}

}
