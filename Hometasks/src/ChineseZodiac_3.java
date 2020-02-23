import java.util.Scanner;

public class ChineseZodiac_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		switch (year % 12) {
		case 0:
			System.out.println("A Monkey year for " + year);
			break;
		case 1:
			System.out.println("A Rooster year for " + year);
			break;
		case 2:
			System.out.println("A Dog year for " + year);
			break;
		case 3:
			System.out.println("A Pig year for " + year);
			break;
		case 4:
			System.out.println("A Rat year for " + year);
			break;
		case 5:
			System.out.println("An Ox year for " + year);
			break;
		case 6:
			System.out.println("A Tiger year for " + year);
			break;
		case 7:
			System.out.println("A Rabbit year for " + year);
			break;
		case 8:
			System.out.println("A Dragon year for " + year);
			break;
		case 9:
			System.out.println("A Snake year for " + year);
			break;
		case 10:
			System.out.println("A Horse year for " + year);
			break;
		case 11:
			System.out.println("A Goat year for " + year);
			break;
		}
	}

}


