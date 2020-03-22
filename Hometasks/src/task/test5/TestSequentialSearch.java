package task.test5;

import task.ITest;

import java.util.Arrays;
import java.util.Scanner;

public class TestSequentialSearch implements ITest
{
	private int[] _arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};

	public String run()
	{
		System.out.println("choose any number from array = " + Arrays.toString(_arr));
		return test();
	}

	private String test()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the search value:");
		try
		{
			int value = input.nextInt();
			int index = getIndex(_arr, value);

			if (index == -1)
				return value + " doesn't exist in array";

			return value + " found at index " + (index);
		} catch (Exception event)
		{
			return "the value is not valid";
		}
	}

	private int getIndex(int[] arr, int value)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] == value)
				return i;
		}
		return -1;
	}
}
