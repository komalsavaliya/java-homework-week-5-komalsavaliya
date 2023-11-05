package homework_week_8;

import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Scanner object created

        System.out.println("Enter the number of elements in the array: ");// print the statement User enter the number odf element in the array
        int n = scanner.nextInt();

        //Create an array to store the entered elements
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");

        //Read and store the elements in the array
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        //Display the original array
        System.out.println("Original array: ");
        printArray(a);
        reverseArray(a);// Reverse the array

        System.out.println("Reversed array: ");//Display the reserved Array
        printArray(a);
        scanner.close();// scanner close
    }

    // Method to reverse the array
    public static void reverseArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++){
            int temp = a[i];
            a[i] = a[n -i -1];
            a[n - i -1] = temp;
        }
    }
//Method to print the elements of array
    public static void printArray(int[] a) {
        for (int value : a){
            System.out.println(value  + " ");
        }
        System.out.println();
    }
}