class ArithemeticOperators
{
	public static void main(String[] args) {
	
	int num1 = 10;
	int num2 = 20;
	//int sum = num1 + num2;
	int sum = 10 + 20;
	System.out.println(num1+"+"+num2+"="+sum);//10+20=30
	System.out.println(10+20);//30

	//substraction 
    num1 = 20;
	num2 = 10;
	int sub = num1 - num2;
    System.out.println(num1+"-"+num2+"="+sub);

	// multiplication
    num1 = 5;
	num2 = 12;
	int mul = num1 * num2;
    System.out.println(num1+"*"+num2+"="+mul);

	// division
	num1 = 14;
	num2 = 5;
	int div = num1 / num2;//2
    System.out.println(num1+"/"+num2+"="+div);

	int rem = num1 % num2;//4
    System.out.println(num1+"%"+num2+"="+rem);
	}
}