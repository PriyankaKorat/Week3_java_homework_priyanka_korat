package java_homework_week3;

import java.util.Scanner;

public class InputOddEven1 {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator(? , :).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any digit and enter check msg accordingly");
        int a = scan.nextInt();
        oddEvenMethod(a);
        scan.close();
    }

    public static void oddEvenMethod(int a) {
        int num = a;
        String msg = (num % 2 == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(msg);


    }
}
