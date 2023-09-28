class LogicalOrExample
{
	public static void main(String[] args) {
	int num1 = 5;
	int num2 = 3;
	boolean result = num1++%2 == 0 || ++num2%2 == 0;
	System.out.println(result);
    System.out.println(num1);
	System.out.println(num2);
	
	}
}