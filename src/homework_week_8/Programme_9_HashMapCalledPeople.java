package homework_week_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme_9_HashMapCalledPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Object created for scanner

        //Create HashMap with String keys and Integer values
        Map<String, Integer> people = new HashMap<>();

        //Populate the map with user input
        populateMap(people,scanner);

        //Use a for-each loop to iterate over the values in the map
        System.out.println("Values in the HasMap: ");
        iterateMapValues(people);
        scanner.close();// Scanner close
    }
    public static void populateMap(Map<String, Integer> map, Scanner scanner){
        System.out.println("Enter names and age(type 'exit' to stope: ");// User wants to exit the input loop
        while (true){
            System.out.println("Name: ");
            String name = scanner.next();
            //Check if the user wants to exit the input loop
            if(name.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("Age: ");
            int age = scanner.nextInt();
            map.put(name,age);// Add the name and age to the map
        }
    }
    public static void iterateMapValues(Map<String, Integer> map){
        for (Integer age : map.values()){
            System.out.println(age);
        }
    }
}
