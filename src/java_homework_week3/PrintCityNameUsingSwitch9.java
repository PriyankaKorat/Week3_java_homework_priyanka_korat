package java_homework_week3;

import java.util.Scanner;

public class PrintCityNameUsingSwitch9 {
    /**
     * Input any alphabet from “A" to “F” and print their city name accordingly (use switch) if
     * any other alphabet should be invalid entry
     */
    public static void cityName(char a) {

        switch (a) {
            case 'A':
                System.out.println("City: Ahmedabad");
                break;
            case 'B':
                System.out.println("City: Baroda");
                break;
            case 'C':
                System.out.println("City: Chennai");
                break;
            case 'D':
                System.out.println("City: Dehradun");
                break;
            case 'E':
                System.out.println("City: Ellara");
                break;
            case 'F':
                System.out.println("City: Faridabad");
                break;
            default:
                System.out.println("Invalid entry");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char alphabet = scan.next().toUpperCase().charAt(0);
        cityName(alphabet);
        scan.close();
    }
}

