package task.test3;

import task.ITest;

import java.util.Scanner;

public class TestChineseZodiac implements ITest {
    public static void main(String[] args) {
        TestChineseZodiac test = new TestChineseZodiac();
        test.run();
    }

    public String run() {
        return test();
    }

    public String test() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = 0;

        try {
            year = input.nextInt();
        } catch (Exception event) {
            return "the value is not valid";
        }

        switch (year % 12) {
            case 0:
                return "A Monkey year for " + year;
            case 1:
                return "A Rooster year for " + year;
            case 2:
                return "A Dog year for " + year;
            case 3:
                return "A Pig year for " + year;
            case 4:
                return "A Rat year for " + year;
            case 5:
                return "An Ox year for " + year;
            case 6:
                return "A Tiger year for " + year;
            case 7:
                return "A Rabbit year for " + year;
            case 8:
                return "A Dragon year for " + year;
            case 9:
                return "A Snake year for " + year;
            case 10:
                return "A Horse year for " + year;
            case 11:
                return "A Goat year for " + year;
        }

        return "";
    }

}


