package java_homework_week3;

import java.util.Scanner;

public class PrintMarkSheet3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * |                               |
     * |          Mark Sheet           |
     * |_______________________________|
     * | Name         :         Jay    |
     * | Roll No      :         08     |
     * |_______________________________|
     * | Subjects     :        Marks   |
     * |_______________________________|
     * | Math         :         98     |
     * | Science      :         90     |
     * | English      :         85     |
     * |_______________________________|
     * | Total        :         273    |
     * |_______________________________|
     * | Percentage   :        91.0    |
     * | Result       :        Pass    |
     * | Grade        :        A+      |
     * |_______________________________|
     */

    public static void studentResult(String name, int rollNum, int math, int science, int eng) {
        int total = math + science + eng;
        float percentage = total * 100 / 300;
        String result;
        String grade;

        if (math<=100 && science<=100 && eng<=100) {
            if (marksCheck(math, science, eng)) {
                if ((percentage >= 80 && percentage <= 100)) {
                    result = "Distinction";
                    grade = "A+";

                } else if ((percentage >= 60 && percentage <= 100)) {
                    result = "First class";
                    grade = "A";

                } else if ((percentage >= 50 && percentage <= 100)) {
                    result = "Second class";
                    grade = "B";

                } else if ((percentage >= 35 && percentage <= 100)) {
                    result = "Pass";
                    grade = "C";

                } else {
                    result = "Fail";
                    grade = "Fail";
                }
            } else {
                result = "Fail";
                grade = "Fail";
            }
            System.out.println("---------------------------------");
            System.out.println("|                               |");
            System.out.println("|         Mark Sheet            |");
            System.out.println("|_______________________________|");
            System.out.println("| Name             :     " + name + "    |");
            System.out.println("| Roll No          :     " + rollNum + "      |");
            System.out.println("|_______________________________|");
            System.out.println("| Subjects         :     Marks  |");
            System.out.println("|_______________________________|");
            System.out.println("| Math             :     " + math + "     |");
            System.out.println("| Science          :     " + science + "     |");
            System.out.println("| English          :     " + eng + "     |");
            System.out.println("|_______________________________|");
            System.out.println("| Total            :     " + total + "    |");
            System.out.println("|_______________________________|");
            System.out.println("| Percentage       :     " + percentage + "   |");
            System.out.println("| Result           :     " + result + "   |");
            System.out.println("| Grade           :     " + grade + "   |");
            System.out.println("|_______________________________|");

        }else{
            System.out.println("Invalid input");
        }




    }

    public static boolean marksCheck(int math, int science, int eng) {

        if (math < 35 || science < 35 || eng < 35) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name ex:Jay");
        String name = scan.nextLine();
        System.out.println("Enter roll number ex:08");
        int rollNum = scan.nextInt();
        System.out.println("Enter Math, science and english marks");
        int mathMark = scan.nextInt();
        int scienceMark = scan.nextInt();
        int engMark = scan.nextInt();
        studentResult(name, rollNum, mathMark, scienceMark, engMark);
        scan.close();


    }
}
