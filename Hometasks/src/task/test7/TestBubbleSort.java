package task.test7;

import task.ITest;

import java.util.Arrays;
import java.util.Scanner;

public class TestBubbleSort implements ITest
{

	public String run()
	{
		main();
		return "ok";
	}

	public void main()
	{
		int num, i, j, temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers to sort:");
		num = input.nextInt();

		int array[] = new int[num];

		System.out.println("Enter " + num + " integers: ");

		for (i = 0; i < num; i++)
		{
			array[i] = input.nextInt();
		}

		sort(array, true);
		System.out.println("Sorted list of integers in ascending:");
		System.out.println(Arrays.toString(array));

		sort(array, false);
		System.out.println("Sorted list of integers in descending:");
		System.out.println(Arrays.toString(array));
	}

	private void sort(int[] array, boolean ascending)
	{
		int temp;
		for (int i = 0; i < (array.length - 1); i++)
		{
			for (int j = 0; j < array.length - i - 1; j++)
			{
				if(ascending && array[j] > array[j + 1] ||
					!ascending && array[j] < array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
