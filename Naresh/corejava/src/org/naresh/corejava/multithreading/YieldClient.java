package org.naresh.corejava.multithreading;

public class YieldClient {

	public static void main(String[] args) throws InterruptedException {
		MyThread4 t = new MyThread4();
		t.setName("naresh");
		t.start();
		t.join();
		for(int i=11; i<=20; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}

	}

}
