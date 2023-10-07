package org.naresh.corejava.inheritence;

public class Governament {

	public static void main(String[] args) {
		Parent p = new Parent("Kambala", "no issues", "5 acres farm land", 1);
		p.behaviours("early morning wakeup");
		p.eatingHabits("healthy food");
		p.snorring(false);
		
		Child c = new Child("Kambala", "no issues", "5 acres farm land", 2, "Teaching", "MTech");
		c.behaviours("early morning wakeup");
		c.eatingHabits("50% healthy food");
		c.cellPhoneUsage(6);
		c.lateNightSpending(2);
		c.snorring(true);

	}

}
