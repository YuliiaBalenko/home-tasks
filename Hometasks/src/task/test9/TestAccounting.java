package task.test9;

import task.ITest;

public class TestAccounting implements ITest
{
	private Accounting _accounting = new Accounting();

	public String run()
	{
		String result = "\n";
		result += testPay(10, 5) + "\n";
		result += testPay(2, 5) + "\n";
		result += testPay(14, 9) + "\n";

		return result;
	}

	private String testPay(float hours, float paymentPerHour)
	{
		String result = "hours:" + hours + " payment per hour:" + paymentPerHour +
				"$, payment = " + _accounting.pay(hours, paymentPerHour) + "$";
		return result;
	}
}
