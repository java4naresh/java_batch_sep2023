package org.naresh.corejava.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExamples {
	
	public static void main(String[] args) {
		genericArrayList();
		
	}
	
	public static void genericVector() {
		List<Character> characters = new Vector<>(); 
		characters.add('A');
		characters.add('E');
		characters.add('I');
		characters.add('O');
		characters.add('U');
		characters.add('a');
		characters.add('e');
		characters.add('i');
		characters.add('o');
		characters.add('u');
		List<Character> subList = characters.subList(5, characters.size());
		System.out.println(subList);
		Object[] array = characters.toArray();
		System.out.println(Arrays.toString(array));
		List<String> listArray = Arrays.asList(new String[]{"naresh", "nikita"});
		System.out.println(listArray);
		/*char check = 'A';
		if(characters.contains(check)) {
			System.out.println("Owel");
		} else {
			System.out.println("Consonent");
		}*/
	}
	
	public static void genericLinkedList() {
		LinkedList<String> names = new LinkedList<>();
		names.add("Rohit");
		names.add("Kohli");
		names.add("Gill");
		names.add("Rahul");
		names.add("Shreyas");
		names.add("Hardik");
		names.add("Jadeja");
		names.add("Shami");
		names.add("Bumra");
		names.add("Siraj");
		names.add("Kuldeep");
		System.out.println(names.get(0));
		names.remove("Hardik");
		names.add(5, "Surya");
		System.out.println(names);
		List<String> extraPlayers = new ArrayList<>();
		extraPlayers.add("Ishan");
		extraPlayers.add("Ashwin");
		extraPlayers.add("Shardul Takur");
		extraPlayers.add("Hardik");
		names.addAll(extraPlayers);
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println(names.size());
		System.out.println(names.indexOf("Naresh"));
	}
	
	public static void genericArrayList() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(7);
		al.add(2);
		System.out.println(al);
		/*Collections.sort(al);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(15));
		al.clear();*/
		//al.remove(1);
		al.add(1, 5);
		System.out.println(al);
		
		System.out.println(10 >> 1);
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
