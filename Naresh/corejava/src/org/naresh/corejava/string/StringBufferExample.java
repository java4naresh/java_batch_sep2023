package org.naresh.corejava.string;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Naresh");
		sb.append(" Kambala");
		System.out.println(sb);
		StringBuffer sb2 = new StringBuffer("AMMA2");
		//sb2.reverse();
		System.out.println(sb2);
		sb2.deleteCharAt(4);
		//sb2.delete(start, end);
		System.out.println(sb2);
		
		StringBuilder sd = new StringBuilder("");

	}

}
