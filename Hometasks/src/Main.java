import task.ITest;
import task.test1.TestPrime;
import task.test10.TestEmployee;
import task.test2.TestQuadraticEquation;
import task.test3.TestChineseZodiac;
import task.test4.TestConvertationIntoText;
import task.test5.TestSequentialSearch;
import task.test6.TestStatisticsInfo;
import task.test7.TestBubbleSort;
import task.test8.TestCards;
import task.test9.TestAccounting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
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

        //test commit
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < testList.length; i++)
        {
            System.out.println("");
            System.out.println("press enter to continue ");
            input.nextLine();

            System.out.println(">>> Test number " + (i + 1));
            String result = testList[i].run();
            if(result != "")
                System.out.println("result = " + result);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}