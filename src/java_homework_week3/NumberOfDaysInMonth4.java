package java_homework_week3;

import java.util.Scanner;

public class NumberOfDaysInMonth4 {
    /**
     * 1) Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * If the parameter is not in that range return false.
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
     * otherwise return false.
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     * a) Example of input/Output:
     * isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
     * isLeapYear(1600); should return true since 1600 is a leap year
     * isLeapYear(2017); should return false since 2017 is not a leap year
     * isLeapYear(2000);should return true because 2000 is a leap year
     * 2) Write another method getDaysInMonth with two parameter month and year. Both of type int.
     * If parameter month is < 1 or >12 return -1.
     * If parameter year is <1 or >9999 than return -1.
     * This method needs to return the number of days in the month. Be careful about leap years
     * they have 29 days in month 2 (February).
     * You should check if the year is a leap year using the method isLeapYear describe above.
     * b) Example of input/Output:
     * getDaysInMonth(1, 2020); should return 31 since January has 31 days.
     * getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap year.
     * getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and 2018 is not a leap year.
     * getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
     * getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to 9999
     * HINT: Use the switch statement.
     * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
     */

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean leap = true;
        boolean result = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if ((year % 100) != 0 || (year % 400) == 0) {
                result = true;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int a = scan.nextInt();
        boolean statement = isLeapYear(a);
        System.out.println(statement);
        System.out.println("enter month and year");
        int month = scan.nextInt();
        int year = scan.nextInt();
        int result = getDaysInMonth(month, year);
        System.out.println(result);
        scan.close();

    }

}
