package org.naresh.corejava.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		linkedHashMapExample();

	}
	
	public static void linkedHashMapExample() {
		Map<Integer, String> playerOrder = new LinkedHashMap<>();

		playerOrder.put(1, "Rohit");
		playerOrder.put(2, "Gill");
		playerOrder.put(3, "Kohli");
		playerOrder.put(4, "Shreyas");
		playerOrder.put(5, "Rahul");
		playerOrder.put(1, "Sehwag");
		playerOrder.put(2, "Sachin");
		playerOrder.put(null, "Dravid");
		playerOrder.put(null, "Ganguly");
		System.out.println(playerOrder);
		System.out.println(playerOrder.keySet());
		
	}
	
	public static void hashMapExample() {
		Map<String, Integer> battingOrder = new HashMap<>();

		battingOrder.put("Rohit", 1);
		battingOrder.put("Gill", 2);
		battingOrder.put("Kohli", 3);
		battingOrder.put("Shreyas", 4);
		battingOrder.put("Rahul", 5);
		battingOrder.put("Surya", 6);
		battingOrder.put("Rohit", 7);
		battingOrder.put(null, 8);
		battingOrder.put(null, 9);
		battingOrder.put("Rohit", 11);
		
		System.out.println(battingOrder);
		System.out.println(battingOrder.get("Rohit"));
		System.out.println(battingOrder.get("Shreyas"));
		System.out.println(battingOrder.get("Sachin"));
		
		System.out.println(battingOrder.keySet());
		
	}

}
