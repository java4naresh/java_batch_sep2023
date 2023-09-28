class WhileLoopExample 
{
	public static void main(String[] args) 
	{
		/*int num = 1;
		while(num<=5) {
		System.out.println(num);
		num++;
		}*/
		int number = 963;//789%10 789/10 -> 78%10 -> 7%10
		int temp = number;
		System.out.println("actual number = "+number);
		int rem = number%10;//9
		number = number/10;//78
		int reverseNumber = 0;
        reverseNumber = (reverseNumber*10) + rem;//0+9
        while(number!=0) {
		rem = number%10;//7
		number = number/10;//0
        reverseNumber = (reverseNumber*10) + rem;//987
		}
		System.out.println("Reverse number = "+reverseNumber);
		if(temp==reverseNumber) System.out.println("Polindrome");
		else System.out.println("Not Polindrome");

	}
}
