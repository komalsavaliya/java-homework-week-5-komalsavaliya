package homework_week_8;

import java.util.Scanner;

/**
 * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create scanner object
        System.out.println("\nEnter Student Name      \t \t:\t");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number \t\t:\t"); //Print the statement Enter the student Roll number
        int rollNumber = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid Input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter the Marks of Subject Science\t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid Input,Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter the Marks of Subject English\t;\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input,Marks should be between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }


        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNumber, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        scanner.close();
    }

    // Calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    //Print the MarkSheet
    public static void printTheMarkSheet(String name, int rollNumber, int mathMarks, int scienceMarks, int englishMarks, int total, int percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                            |");
        System.out.println("| Mark Sheet                 |");
        System.out.println("|____________________________|");
        System.out.println("| Name: " + name + "                  |");
        System.out.println("| Roll No: " + rollNumber + "                 |");
        System.out.println("|____________________________|");
        System.out.println("| Subjects: Marks            |");
        System.out.println("|____________________________|");
        System.out.println("| Math: " + mathMarks + "                   |");
        System.out.println("| Science: " + scienceMarks + "                |");
        System.out.println("| English: " + englishMarks + "                |");
        System.out.println("|____________________________|");
        System.out.println("| Total: " + total + "                 |");
        System.out.println("|____________________________|");
        System.out.println("| Percentage: " + percentage + "%            |");
        System.out.println("| Result: " + result + "               |");
        System.out.println("| Grade: " + grade + "                  |");
        System.out.println("|____________________________|");

    }
}




