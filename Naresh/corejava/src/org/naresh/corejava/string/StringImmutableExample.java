package org.naresh.corejava.string;

public class StringImmutableExample {

	public static void main(String[] args) {
		String name = "Naresh N";
		String name2 = name.concat(" Kambala");
		System.out.println(name);//
		System.out.println(name2);//
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		String reverse = "";
		for(int i = name.length()-1; i >=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
        if(reverse.equals(name)) System.out.println("Polindrome");
        else System.out.println("Not Polindrome");
        
        String name3 = "Naresh Kambala";
        System.out.println(name3.contains("Naresh"));
        System.out.println(name.equals("amma"));
        System.out.println(name.equalsIgnoreCase("amma"));
        System.out.println(name3.toUpperCase());
        System.out.println(name3.toLowerCase());
        System.out.println(name3.endsWith("la"));
        System.out.println(name3.startsWith("Naresh"));
        System.out.println(name.indexOf('N'));
        System.out.println(name.lastIndexOf('N'));
	}

}
