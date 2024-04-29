package java_homework_week3;

import java.util.Arrays;

public class CheckArrayContainSpecificValue20 {
    /**
     * Write a Java program to test if an array contains a specific value
     */
    public static void check(int[] a, int toCheckSpecific){
        boolean test = false;
        for (int element : a){
            if (element == toCheckSpecific){
                test = true;
                break;
            }
        }
        System.out.println("This " +toCheckSpecific+ " is present in the array: " + test);
    }

    public static void main(String[] args) {
        int a[] = {5, 12, 45, 10, 47, 10, 50};
        int toCheckSpecific = 10;
        System.out.println("Array: "+ Arrays.toString(a));
        check(a,toCheckSpecific);
    }
}

