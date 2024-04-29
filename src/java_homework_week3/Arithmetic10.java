package java_homework_week3;

import java.util.Scanner;

public class Arithmetic10 {
    /**
     * .Write a java program to input any two number and ask user to enter their symbol (+, -,
     * /, *) find addition, Subtraction, multiplication and division according to their symbol
     * (using if else)
     */
    public static void arithmetic(double num1, double num2, char operation) {
        double result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            return;


        }
        System.out.println("Result is " + result);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number1");
        double num1 = scan.nextDouble();
        System.out.println("Enter Number2");
        double num2 = scan.nextDouble();
        System.out.println("Enter symbol");
        char operation = scan.next().charAt(0);
        arithmetic(num1, num2, operation);
        scan.close();
    }
}