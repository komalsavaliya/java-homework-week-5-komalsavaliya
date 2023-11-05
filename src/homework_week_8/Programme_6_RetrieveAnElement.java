package homework_week_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);//Scanner object created
        //Create an ArrayList of Strings
        ArrayList<String> purseBrand = new ArrayList();
        //Add some elements to the ArrayList
        purseBrand.add("Dior");
        purseBrand.add("Gucci");
        purseBrand.add("Coach");
        purseBrand.add("Michale Kors");
        purseBrand.add("Parda");
        purseBrand.add("Louis Vuitton");
        purseBrand.add("Kate Spade");
        purseBrand.add("Burberry");
        //User enter the Index of the element to retrieve
        System.out.println("Enter the index of element to retrieve: ");
        int index = scanner.nextInt();
                // Check if the entered index is within the valid range
        if(index >= 0 && index < purseBrand.size()) {
            //Retrive the element at the specified index
            String element = purseBrand.get(index);
            System.out.println("Element at index " + index + " : " + element);
        }else {
            System.out.println("Invalid index. Please enter a valid index within the range.");
        }
        scanner.close();
    }
}
