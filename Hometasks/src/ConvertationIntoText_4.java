import java.text.NumberFormat;

public class ConvertationIntoText_4 {

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(final int n) {

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		return convert(n / 1000) + " Thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
	}

	public static void main(final String[] args) {

		int from1 = 10;
		int to1 = 150;
		int from2 = 9980;
		int to2 = 10000;
		for (int n = from1; n <= to2; n++) {
			if ((n >= from1 && n <= to1) || (n >= from2 && n <= to2))

			{
				System.out.println(NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'");
			}
		}
	}
}
	