package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);// Scanner Open
        Calculator calculator = new Calculator();
        char moreCalculation;
        do{
            System.out.print("Enter the first number: ");//Print the statement User can Enter first number
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");// User can enter second number
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +, -, *, / : ");// User can enter symbol
            char symbol = scanner.next().charAt(0);
            calculator.calculateResult(num1, num2, symbol);
            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            moreCalculation = scanner.next().charAt(0);

        }while (moreCalculation == 'Y' || moreCalculation == 'y');
        System.out.println("Program terminated.");
        scanner.close();//Scanner close
    }
}
