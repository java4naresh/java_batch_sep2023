package org.naresh.corejava.multithreading;

public class SynchronizationClient {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread3 mt = new MyThread3(task);
		mt.setName("naresh");
		mt.start();
		
		MyThread3 mt2 = new MyThread3(task);
		mt2.setName("nikita");
		mt2.start();

	}

}
