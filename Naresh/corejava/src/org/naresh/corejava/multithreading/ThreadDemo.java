package org.naresh.corejava.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();//creating new thread by extends Thread 
		mt.setName("Naresh Thread1");
		mt.setPriority(Thread.MAX_PRIORITY);
		mt.start();//start(It will register into thread scheduler)
		
		MyThread2 mt2 = new MyThread2();//creating new thread by implements Runnable
		Thread thread2 = new Thread(mt2);
		thread2.setName("Naresh Thread2");
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread2.sleep(5000);
		thread2.start();//start(It will register into thread scheduler)
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		//System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().sleep(10000);
		for(int i=1;i<=500;i++) {
			System.out.println(i+ Thread.currentThread().getName());
		}

	}

}
