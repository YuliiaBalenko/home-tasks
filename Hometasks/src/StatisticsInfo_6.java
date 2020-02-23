public class StatisticsInfo_6 {

	public static void main(String[] args) {
		showStatistics();
	}

	static void showStatistics() {
		int[] data = { 206, 430, 73, 30, 293, 322, 42, 36, 447, 229 };
		float mean, median, std;

//calculate the mean
		int i = 0;
		int sum = 0;
		int j = 0;
		while (j < data.length) {
			sum = sum + data[j];
			j++;
		}

		mean = (float) sum / data.length;

//calculate median
		if (data.length % 2 != 0)
			median = data[data.length / 2];
		else
			median = (data[(data.length / 2) - 1] + data[data.length / 2]) / (float) 2;

//calculate the mode
		int[][] mode = new int[data.length][2];
//initialize 2D array storing numbers of occurences, and values
		for (i = 0; i < 2; i++)
			for (j = 0; j < data.length; j++)
				mode[j][i] = 0;
		mode[0][0] = 1;

		for (i = 0; i < data.length; i++)
			for (j = 0; j < data.length - 1; j++)
				if (data[i] == data[j + 1]) {
					++mode[i][0];
					mode[i][1] = data[i];
				}

		int max;
		int k = 0;
		max = mode[0][0];
		for (j = 0; j < data.length; j++)
			if (max < mode[j][0]) {
				max = mode[j][0];
				k = j;
			}

//calculate standard deviation,std
		float temp = 0.0f;

		for (j = 0; j < data.length; j++) {
			temp = temp + (float) Math.pow(data[j] - mean, 2);
		}

		std = (float) Math.sqrt(temp / (data.length - 1));

		System.out.println("Statistical Information:");
		System.out.println("Arithmetic mean: " + mean);
		System.out.println("Median: " + median);
		if (mode[k][1] != 0)
			System.out.println("Mode: " + mode[k][1]);
		else
			System.out.println("Mode: no mode");
		System.out.println("Standard deviation: " + std);

	}

}


