package task.test6;

import task.ITest;
import java.util.*;

public class TestStatisticsInfo implements ITest
{

	public String run()
	{
		int[] data = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};

		String result = "Statistical Information: \n";
		result += testMean(data) + "\n";
		result += testMedian(data) + "\n";
		result += testModa(data) + "\n";
		result += testSTD(data) + "\n";

		return result;
	}

	private String testMean(int[] data)
	{
		return "Arithmetic mean: " + calculateMinValue(data);
	}

	private double calculateMinValue(int[] data)
	{
		float meanValue = 0;
		long sum = 0;
		for (int i = 0; i < data.length; i++)
		{
			sum += data[i];
		}
		return sum / data.length;
	}

	private String testMedian(int[] data)
	{
		int[] dataSort = data.clone();
		Arrays.sort(dataSort);

		double result = 0;
		if (data.length % 2 != 0)
		{
			result = data[data.length / 2];
		} else
		{
			int a = data[(data.length / 2) - 1];
			int b = data[data.length / 2];
			result = (a + b) / 2;
		}

		return "Median: " + result;
	}

	private String testModa(int[] data)
	{
		//calculate the mode
		int[][] mode = new int[data.length][2];
		//initialize 2D array storing numbers of occurences, and values
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < data.length; j++)
			{
				mode[j][i] = 0;
			}
		}

		mode[0][0] = 1;

		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data.length - 1; j++)
			{
				if (data[i] == data[j + 1])
				{
					++mode[i][0];
					mode[i][1] = data[i];
				}
			}
		}

		int max;
		int k = 0;
		max = mode[0][0];
		for (int j = 0; j < data.length; j++)
		{
			if (max < mode[j][0])
			{
				max = mode[j][0];
				k = j;
			}
		}

		if (mode[k][1] != 0)
			return "Mode: " + mode[k][1];


		return "Mode: no mode";
	}

	private String testSTD(int[] data)
	{
		float temp = 0.0f;

		for (int j = 0; j < data.length; j++)
		{
			temp = temp + (float) Math.pow(data[j] - calculateMinValue(data), 2);
		}

		float std = (float) Math.sqrt(temp / (data.length - 1));

		return "Standard deviation: " + std;
	}
}


