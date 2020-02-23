import java.util.Scanner;

public class SequentialSearch_5 {
	public static void main(String args[]) {
		int counter, item;
		Scanner input = new Scanner(System.in);

		int[] arr = { 158, 207, 392, 62, 315, 434, 487, 268, 405, 241 };

		System.out.println("Enter the search value:");
		item = input.nextInt();

		for (counter = 0; counter < arr.length; counter++) {
			if (arr[counter] == item) {
				System.out.println(item + " found at index " + (counter));

				break;
			}
		}
		if (counter == arr.length)
			System.out.println(item + " doesn't exist in array");
	}
}
