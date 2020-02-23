
public class QuadraticEquation_2 {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 1;
		double x1;
		double x2;
		double d;

		d = b * b - 4 * a * c;

		if (d > 0) {
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.println("The roots are " + x1 + " and " + x2);
		} else if (d == 0) {
			x1 = -b / (2 * a);
			System.out.println("There is only one root " + x1);
		} else {
			System.out.println("There is no solution");
		}

	}

}
