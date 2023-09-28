class NestedIfElseExample 
{
	public static void main(String[] args) 
	{
		int num1 = 15;
        int num2 = 15;
        if(num1==10) {
        if(num2==20) {
        System.out.println("both numbers are satisfied");
        } else {
        System.out.println("num1 is satisifed but num2 is not satisfied");
        }
        } else {
        System.out.println("both numbers not satisfied");
        }
	}
}
