package org.naresh.corejava.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		hashSetExamples();

	}
	
	public static void treeSetExample() {
		/*Set<String> names = new TreeSet<>();
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
		names.add("Rohit");
		System.out.println(names);*/
		/*Set<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(6);
		numbers.add(7);
		numbers.add(9);
		numbers.add(7);
		System.out.println(numbers);*/
		Set<Character> chars = new TreeSet<>();
		chars.add('g');
		chars.add('G');
		chars.add('a');
		chars.add('A');
		chars.add('h');
		chars.add('i');
		chars.add('K');
		System.out.println(chars);
	}
	
	public static void linkedHashSet() {
		Set<String> names = new LinkedHashSet<>();
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
		names.add("Rohit");
		System.out.println(names);
		//names.clear();
		//names.remove("Rohit");
		
		System.out.println(names);
	}
	
	public static void hashSetExamples() {
		Set<String> names = new HashSet<>();
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
		names.add("Rohit");
		System.out.println(names);
		//names.clear();
		//names.remove("Rohit");
		System.out.println(names);
	}

}
