package org.naresh.corejava.classobject;

public class LogicalPrograms {
	
	public static void printPrimeNumbers(int start, int end) {
		for(int i = start; i<=end; i++) {
			int divisionCount = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					divisionCount++;
				}
			}
			if(divisionCount<=2) System.out.println(i);
		}
	}

}
