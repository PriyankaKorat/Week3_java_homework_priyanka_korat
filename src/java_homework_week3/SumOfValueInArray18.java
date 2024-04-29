package java_homework_week3;

public class SumOfValueInArray18 {
    /**
     * Write a Java program to sum values of an array.
     */
    public static int sum(int a[]) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {2, 25, 47, 10, 20};
        int sum = sum(array);
        System.out.println(sum);
    }
}
