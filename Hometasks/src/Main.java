import task.ITest;
import task.test1.TestPrime;
import task.test2.TestQuadraticEquation;
import task.test3.TestChineseZodiac;
import task.test4.TestConvertationIntoText;
import task.test5.TestSequentialSearch;
import task.test6.TestStatisticsInfo;
import task.test7.TestBubbleSort;
import task.test8.TestCards;
import task.test9.TestAccounting;
import task.test10.TestEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ITest[] testList = createTests();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < testList.length; i++) {
            printTest(input, testList[i], i);
        }
    }

    private static void printTest(Scanner input, ITest test, int testNumber) {
        System.out.println("");
        System.out.println("press enter to continue ");
        input.nextLine();

        System.out.println(">>> Test number " + (testNumber + 1));
        String result = test.run();
        if (result != "")
            System.out.println("result = " + result);
    }

    private static ITest[] createTests() {
        ITest[] testList = new ITest[10];
        testList[0] = new TestPrime();
        testList[1] = new TestQuadraticEquation();
        testList[2] = new TestChineseZodiac();
        testList[3] = new TestConvertationIntoText();
        testList[4] = new TestSequentialSearch();
        testList[5] = new TestStatisticsInfo();
        testList[6] = new TestBubbleSort();
        testList[7] = new TestCards();
        testList[8] = new TestAccounting();
        testList[9] = new TestEmployee();

        return testList;
    }
}
