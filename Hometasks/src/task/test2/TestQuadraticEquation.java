package task.test2;

import task.ITest;

public class TestQuadraticEquation implements ITest {

    public String run() {
        return testRun(1, 2, 1);
    }

    public String testRun(double a, double b, double c) {
        double x1;
        double x2;
        double d;

        d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "The roots are " + x1 + " and " + x2;
        } else if (d == 0) {
            x1 = -b / (2 * a);
            return "There is only one root " + x1;
        } else {
            return "There is no solution";
        }

    }
}

