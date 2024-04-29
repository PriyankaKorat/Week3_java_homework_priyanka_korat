package java_homework_week3;

import java.util.Arrays;
import java.util.Scanner;

public class NumericAndStringArray17 {
    /**
     * Write a Java program to sort a numeric array and a string array.
     */

    public static void main(String[] args) {
        NumericAndStringArray17 a = new NumericAndStringArray17();
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        String[] name = new String[5];

        System.out.println("Please enter first name");
        name[0] = input.nextLine();
        System.out.println("Please enter second name");
        name[1] = input.nextLine();
        System.out.println("Please enter third name");
        name[2] = input.nextLine();
        System.out.println("Please enter fourth name");
        name[3] = input.nextLine();
        System.out.println("Please enter fifth name");
        name[4] = input.nextLine();
        a.alphabet(name);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please enter first number");
        numbers[0] = input.nextDouble();
        System.out.println("Please enter second number");
        numbers[1] = input.nextDouble();
        System.out.println("Please enter third number");
        numbers[2] = input.nextDouble();
        System.out.println("Please enter fourth number");
        numbers[3] = input.nextDouble();
        System.out.println("Please enter fifth number");
        numbers[4] = input.nextDouble();
        a.numeric(numbers);
        input.close();

    }

    public String numeric(double num[]) {
        Arrays.sort(num, 0, 4);

        System.out.println("Modified numeric Array[]: " + Arrays.toString(num));
        return (Arrays.toString(num));
    }

    public String alphabet(String name[]) {
        Arrays.sort(name, 0, 4);

        System.out.println("Modified String Array[]: " + Arrays.toString(name));
        return (Arrays.toString(name));

    }
}



