package java_homework_week3;

import java.util.Scanner;

public class PrintSalarySlip5 {
    /**
     * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
     * salary
     * HRA = basic salary 10%
     * DA = Basic salary 8%
     * TA = Basic salary 9%
     * PF= Basic salary 20%
     * Gross salary = basic salary + HRA + TA + DA –PF
     * Print in following format
     * _______________________________
     * |         Salary Slip          |
     * |______________________________|
     * | Employee Id   :         2564 |
     * | Employee Name :          Jay |
     * |______________________________|
     * | Basic Salary  :      25000.0 |
     * | HRA 10%       :       2500.0 |
     * | TA 9%         :       2250.0 |
     * | DA 8%         :       2000.0 |
     * | PF - 20&      :       5000.0 |
     * |______________________________|
     * | Gross Salary  :      26750.0 |
     * |==============================|
     */
    public static void findGrossSalary(int employeeID, String name, int salary) {
        int hra = salary * 10 / 100;
        int ta = salary * 9 / 100;
        int da = salary * 8 / 100;
        int pf = salary * 20 / 100;
        int grossSalary = salary + hra + ta + da - pf;
        System.out.println("_________________________________");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee Id      :      " + employeeID + "  |");
        System.out.println("| Employee Name    :       " + name + "  |");
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary     :     " + salary + "  |");
        System.out.println("| HRA 10%          :      " + hra + "  |");
        System.out.println("| TA 9%            :      " + ta + "  |");
        System.out.println("| DA 8%            :      " + da + "  |");
        System.out.println("| PF - 20&         :      " + pf + "  |");
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary     :     " + grossSalary + "  |");
        System.out.println("|===============================|");


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name ex: Jay");
        String name = scan.nextLine();
        System.out.println("Enter emlpoyee id ex:2564");
        int id = scan.nextInt();
        System.out.println("enter salary eg:25000");
        int salary = scan.nextInt();
        findGrossSalary(id, name, salary);
        scan.close();


    }
}

