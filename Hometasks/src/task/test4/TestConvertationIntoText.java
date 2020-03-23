package task.test4;

import task.ITest;

import java.text.NumberFormat;

public class TestConvertationIntoText implements ITest {
    public String run() {
        String result = "range (10-150) " + test(10, 150) + "\n";
        result += "range (9980-10000) " + test(9980, 10000);
        return result;
    }

    public static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    public static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

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

    public String test(int from, int to) {
        String result = "";
        for (int n = from; n <= to; n++) {
            if ((n >= from && n <= to)) {
                result += "\n" + NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'";
            }
        }

        return result;
    }

}
	