package java_homework_week3;

import java.util.Scanner;

public class PrintCityName8 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     * any other alphabet should be invalid entry
     */
    public static void cityName(String a) {

        if (a.equals("A")) {
            System.out.println("City: Ahmedabad");
        } else if (a.equals("B")) {
            System.out.println("City: Baroda");
        } else if (a.equals("C")) {
            System.out.println("City: Chennai");
        } else if (a.equals("D")) {
            System.out.println("City: Dehradun");
        } else if (a.equals("E")) {
            System.out.println("City: Ellara");
        } else if (a.equals("F")) {
            System.out.println("City: Faridabad");
        } else {
            System.out.println("Invalid Entry");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        String alphabet = scan.next().toUpperCase();
        cityName(alphabet);
        scan.close();
    }
}
