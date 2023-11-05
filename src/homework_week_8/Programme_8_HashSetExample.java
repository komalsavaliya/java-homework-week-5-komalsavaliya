package homework_week_8;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSetExample {
    public static void main(String[] args) {
        //Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet();

        //Add number 4,7,and 8
        addNumbersToSet(numberSet, 4,7,8);

        //Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Print the statement user can enter a number between 1 to 10
        System.out.println("Enter a number between 1 to 10 : ");
        int userNumber = scanner.nextInt();

        //Check and print which number between 1 to 10 are in the set
        checkAndPrintNumbersInSet(numberSet);
        scanner.close();//Scanner close
    }
    public static void addNumbersToSet(HashSet<Integer>set, int... numbers){
        for (int num : numbers){
            set.add(num);
        }
    }
    public static void checkAndPrintNumbersInSet(HashSet<Integer> set){
        System.out.println("number in the set between 1 and 10: ");
        for (int i = 1; i <= 10; i++){
            if (set.contains(i)){
                System.out.println(i + "is in the set");
            }else{
                System.out.println(i + " is not in the set");
            }
        }
    }

}
