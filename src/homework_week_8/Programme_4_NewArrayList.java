package homework_week_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4_NewArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Create scanner object
        ArrayList<String> colors = new ArrayList();//create an ArrayList to store colors as strings
        System.out.println("Enter ths colors(type 'exit' to stop:");//user enter colors
        while (true){
            System.out.print("Color: ");
            String color = scanner.next();
            //Check if the user wants t"o exit the loop
            if (color.equalsIgnoreCase("exit")){
                break;//exit the loop with use break
            }
            colors.add(color);//Add the entered color to the ArrayList
        }
        //Print the colors in the Arraylist using a for-each loop
        System.out.println("Colors in the ArrayList: ");
        for (String color : colors){
            System.out.println(color);
        }
        scanner.close();//Close Scanner
    }
}
