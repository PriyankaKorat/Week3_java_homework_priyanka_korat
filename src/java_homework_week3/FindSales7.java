package java_homework_week3;

import java.util.Scanner;

public class FindSales7 {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales
     * Commission
     * Sales amount >= 50,000 35%
     * Sales amount >= 30,000 20%
     * >= 20,000 10%
     * >= 10,000 5%
     * < 10,000 2%
     */
    public static void findSalesCommission(int salesID, String sellerName, double salesAmount, double salaryBasic) {
        double commissionRate;
        double totalSalary = salesAmount + salaryBasic;


        if (salesAmount >= 50000) {
            commissionRate = (salesAmount * 0.35);
        } else if (salesAmount >= 30000) {
            commissionRate = (salesAmount * 0.25);
        } else if (salesAmount >= 20000) {
            commissionRate = (salesAmount * 0.10);
        } else if (salesAmount >= 10000) {
            commissionRate = (salesAmount * 0.05);
        } else {
            commissionRate = (salesAmount * 0.02);
        }
        System.out.println(commissionRate + " is commission");
        System.out.println("Total Salary is: " + (totalSalary + commissionRate));


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.println("Enter id, Sales amount, int sales basic");
        int id = scan.nextInt();
        double salesAmt = scan.nextDouble();
        double salaryBasic = scan.nextDouble();
        findSalesCommission(id, name, salesAmt, salaryBasic);
        scan.close();


    }
}


