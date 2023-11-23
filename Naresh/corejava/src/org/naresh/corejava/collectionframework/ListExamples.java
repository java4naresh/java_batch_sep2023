package org.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ListExamples {
	
	public static void main(String[] args) {
		genericArrayList();
		
	}
	
	public static void genericArrayList() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(7);
		al.add(2);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(15));
		al.clear();
		System.out.println(al);
	}
	
	public static void arrayListExample() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Naresh");
		al.add(25000.00);
		al.add(false);
		al.add('M');
		al.add(10);
		System.out.println(al);
		//al.remove(1);
		al.remove("Naresh");
		System.out.println(al);
		al.add("nikita");
		System.out.println(al);
		al.add(3, 5);
		System.out.println(al);
		System.out.println(al.get(0));
	}

}
