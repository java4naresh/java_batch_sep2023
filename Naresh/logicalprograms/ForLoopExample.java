class ForLoopExample 
{
	public static void main(String[] args) 
	{
		// table
		/*for(int i = 1; i < 11; i++) {
		  //System.out.println("Naresh"+i);
		  System.out.println("6*"+i+"="+(6*i));
		}*/

		// print even numbers between 1 to 100
		for(int i=1; i<101; i++) {
		if(i%2 == 0) System.out.println(i+" is Even");
		else System.out.println(i+" is Odd");
		}

		//7 primenumber
		/*boolean flag = true;
		int number = 2;//1,2,3,6
		for(int i=2; i<number; i++) {
		  if(number%i==0) {//7%6 == 0
		    flag = false;
			break;
		  }
		}

		if(flag) System.out.println("Given number is prime");
		else System.out.println("Given number is not prime");*/

		/*for(int i = 5; i > 0; i--) {//0 > 0
		System.out.print("*");
		}*/

        /*for(int i = 101; i < 106; i++) {
		System.out.print("1");
		}*/

		/*for(int i=1;i<6;i++) {
		System.out.print(i);
		}*/

		/*for(int i=500; i > 400; i--) {
		 System.out.println(i);
		}*/
	}
}
