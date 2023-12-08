package org.naresh.corejava.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		customTreeSet();

	}
	
	public static void customTreeSet() {
		/*Set<String> names = new TreeSet<>();
		names.add("Kohli");
		System.out.println(names);
		names.add("Rohit");
		System.out.println(names);
		names.add("Surya");
		System.out.println(names);*/
		//System.out.println("Nikita".compareTo("Naresh"));
		System.out.println(new Integer(2).compareTo(new Integer(1)));
		Set<Customer> customers = new TreeSet<>();
		customers.add(new Customer(2, "Naresh"));
		customers.add(new Customer(1, "Nikita"));
		customers.add(new Customer(5, "Naresh"));
		customers.add(new Customer(8, "Nikita"));
		customers.add(new Customer(0, "Naresh"));
		customers.add(new Customer(9, "Nikita"));
		System.out.println(customers);
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
	
	public static void customLinkedHashSet() {
		Set<Customer> customers = new LinkedHashSet<>();
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		System.out.println(customers);
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
	
	public static void customHashSet() {
		Set<Customer> customers = new HashSet<>();
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		customers.add(new Customer(1, "Naresh"));
		customers.add(new Customer(2, "Nikita"));
		System.out.println(customers);
	}
	
	public static void hashSetExamples() {
		Set<String> names = new HashSet<>();
		names.add(new String("Rohit"));
		names.add(new String("Kohli"));
		names.add(new String("Gill"));
		names.add(new String("Rahul"));
		names.add(new String("Shreyas"));
		names.add(new String("Hardik"));
		names.add(new String("Jadeja"));
		names.add(new String("Shami"));
		names.add(new String("Bumra"));
		names.add(new String("Siraj"));
		names.add(new String("Kuldeep"));
		names.add(new String("Rohit"));
		System.out.println(names);
		//names.clear();
		//names.remove("Rohit");
		System.out.println(names);
	}

}
