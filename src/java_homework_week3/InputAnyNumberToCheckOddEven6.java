package java_homework_week3;

import java.util.Scanner;

public class InputAnyNumberToCheckOddEven6 {
    /**
     * Write a java program to input any number and find out if it’s odd or even
     */
    public static String checkEvenOdd(int num) {
        String message;

        if (num % 2 == 0) {
            message = num + " number is even";
        } else {
            message = num + " number is odd";

        }
        return message;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num = scan.nextInt();
        String result = checkEvenOdd(num);
        System.out.println(result);
        scan.close();
    }
}
