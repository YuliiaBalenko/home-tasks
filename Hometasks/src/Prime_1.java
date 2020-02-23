
public class Prime_1 {

	public static void main(String[] args) {

		long from = 0, to = 50000;
		long count = 0, i, j;
		for (i = from; i <= to; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 0;
					break;
				} else {
					count = 1;
				}
			}
			if (count == 1) {
				System.out.print(i + " ");
			}
		}
	}

}