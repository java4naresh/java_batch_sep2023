class LogicalOperators
{
	public static void main(String[] args) {
	/*int num1 = 5;
    int num2 = 7;
    int num3 = 10;
    boolean result = num1 < num2;//true
    boolean result2 = num2 < num3;//false
    boolean result3 = result && result2;//false
	System.out.println("requirement1 status = "+result3);
    int num4 = 4;
    int num5 = 6;
    result = num4 % 2 == 0;
    result2 = num5 % 2 == 0;
    boolean evenStatus = result && result2;
	System.out.println("Even status = "+ evenStatus);
	boolean requirementsStatus = result3 && evenStatus;
    System.out.println("Final Result = "+ requirementsStatus);*/
	int num = 10;
    boolean result = num++ % 2 == 0 && ++num%2 != 0;//11
	System.out.println(result);
    System.out.println(num);
	}
}