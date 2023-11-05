package homework_week_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Programme_5_IterateAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList();
        System.out.println("Enter elements for the ArrayList(type 'exit' to stop): ");
        while (true) {
            System.out.println("Elements: ");
            String input = scanner.next();
            //Check if the user wants to exit the input loop
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            // Add the entered element to the ArrayList
            arrayList.add(input);
        }

        //Obtain an Iterator for the ArrayList
        Iterator<String> iterator = arrayList.iterator();
        //Use the Iterator to iterate through the elements
        System.out.println("Elements in the ArrayList: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        //Close the Scanner
        scanner.close();
    }
}


