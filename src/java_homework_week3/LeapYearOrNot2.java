package java_homework_week3;

import java.util.Scanner;

public class LeapYearOrNot2 {
    /**
     * Write a java program to input any year like (ex.2007) and find out if it is leap year or
     * not?
     */
    public static String checkLeapYear(int year) {
        int ans = year;
        String message;
        if (ans % 4 == 0) {
            message = "The year is leap year";
        } else {
            message = "The year is not leap year";
        }

        return message;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int ans = scan.nextInt();
        String message = checkLeapYear(ans);
        System.out.println(ans + " " + message);
        scan.close();


    }
}
