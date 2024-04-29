package java_homework_week3;

import java.util.Scanner;

public class DivideBy3And5Separate11 {
    /**
     * Write a java program to print the numbers between 1 to 100 which can be divided by 3
     * and 5 separately.
     */
    public static void divideBy3(int num) {
        System.out.println("\nNumber divide by 3 is: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");

        }
        System.out.println("\n\nNumber divide by 5 is: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num = scan.nextInt();
        divideBy3(num);
        scan.close();
    }
}
