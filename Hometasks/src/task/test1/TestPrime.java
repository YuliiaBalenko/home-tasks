package task.test1;

import task.ITest;

public class TestPrime implements ITest
{

	public String run()
	{
		return testRun(0, 5000);
	}

	public String testRun(long from, long to)
	{
		String outputString = "";
		long count = 0, i, j;

		for (i = from; i <= to; i++)
		{
			for (j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					count = 0;
					break;
				} else
				{
					count = 1;
				}
			}
			if (count == 1)
				outputString += i + " ";
		}

		if(outputString == "")
			return "prime numbers not found";

		return "prime numbers - " + outputString;
	}
}