package java_homework_week3;

import java.util.Scanner;

public class InputNumberOrAlphabet12 {
    /**
     * Write a program that tells us input value is number or an alphabet or symbol
     */
    public static void inputValueNumOrCha(char a) {
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            System.out.println("This is alphabet");
        } else if (a >= '0' && a <= '9') {
            System.out.println("This is number");
        } else {
            System.out.println("This is Symbol");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number1");
        char a = scan.next().charAt(0);
        inputValueNumOrCha(a);
        scan.close();
    }
}
