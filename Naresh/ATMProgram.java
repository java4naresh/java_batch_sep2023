class ATMProgram 
{
	public static void main(String[] args) 
	{
		int actualPin = 2525;
		int enteredPin = 2525;
		double availableBalance = 10500.25;
		double enteredAmount = 1550.00;
		if(actualPin == enteredPin) {
		System.out.println("Your entered pin is correct!");
		System.out.println("Welcome HDFC ATM");
		System.out.println("Enter with draw amount");
        if(enteredAmount <= availableBalance) {
		if(enteredAmount % 100 == 0) {
		System.out.println("Please take your amount");
		System.out.println("your available balance is "+(availableBalance - enteredAmount));
		} else {
		System.out.println("invalid amount, please enter 100's only");
		}
		} else {
		System.out.println("your available balance is "+availableBalance);
		System.out.println("your entered amount is "+enteredAmount);
        System.out.println("insufficient funds!");
		}
		} else {
		System.out.println("Your entered pin is wrong please try again with correct pin number");
		}
	}
}
