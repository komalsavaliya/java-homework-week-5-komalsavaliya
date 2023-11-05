package homework_week_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not
 */
public class Programme_7_ArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner object created
        //Create an ArrayList of string
        ArrayList<String>arrayList = new ArrayList();// Create an ArrayList of string
        //user add elements to the ArrayList
        System.out.println("Add elements to the ArrayList(type 'exit' to stop) :");
        while (true){
            System.out.println("Element: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")){
                break;//Exit the loop when 'exit' is entered
            }
            arrayList.add(input);//Add the Entered element to the ArrayList
        }
        // Check if ArrayList is empty
        if (arrayList.isEmpty()){
            System.out.println("The ArrayList is empty.");
        }else {
            System.out.println("The ArrayList is not empty.");
        }
        scanner.close();//Scanner close
    }
}
