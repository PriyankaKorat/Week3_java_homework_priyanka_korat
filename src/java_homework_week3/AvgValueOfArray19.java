package java_homework_week3;

public class AvgValueOfArray19 {
    /**
     * Write a Java program to calculate the average value of array elements.
     */
    public static double avg(int a[]) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (double) sum / a.length;
    }

    public static void main(String[] args) {
        int[] array = {2, 25, 47, 10, 20};
        double avg = avg(array);
        System.out.println("The average of the array element is: " +avg);
    }
}
