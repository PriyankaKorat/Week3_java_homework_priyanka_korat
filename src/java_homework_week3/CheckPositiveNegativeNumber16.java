package java_homework_week3;

import java.util.Scanner;

public class CheckPositiveNegativeNumber16 {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
    public void checkNum(double num) {
        if (num > 0) {
            System.out.println("This is Positive Number");
        } else if (num < 0) {
            System.out.println("This is Negative number");
        } else {
            System.out.println("This number is Zero");
        }


    }

    public static void main(String[] args) {
        CheckPositiveNegativeNumber16 a = new CheckPositiveNegativeNumber16();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = scan.nextDouble();
        a.checkNum(num);
        scan.close();
    }
}
