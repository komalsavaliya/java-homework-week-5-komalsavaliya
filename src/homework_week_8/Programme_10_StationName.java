package homework_week_8;

import java.util.*;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class
Programme_10_StationName {
    public static void main(String[] args) {
        //Create a HashMpa to store Zone 1 Station
        Map<String, List<String>> stationLines = new HashMap();

        // Populate the map with station-line association( you can add more station and line)
        stationLines.put("Kings Cross St Pancreas", List.of("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"));
        stationLines.put("Green Park", List.of("Piccadilly", "Victoria", "Jubilee"));
        stationLines.put("West Minister", List.of("Jubilee", "Circle", "District line"));
        stationLines.put("Waterloo", List.of("Baker loo,Jubilee", "Jubilee", "Northern", "Waterloo & City"));

        Scanner scanner = new Scanner(System.in);//Scanner close

        System.out.println("Enter the name of the first Zone 1 station: ");
        String station1 = scanner.nextLine();
        System.out.println("Enter the name of the second Zone 1 station:");
        String station2 = scanner.nextLine();

        //Retrieve the lines for the first and second station from map
        List<String> lines1 = stationLines.get(station1);
        List<String> lines2 = stationLines.get(station2);

        if (lines1 != null && lines2 != null) {
            //Find the common lines that connect both station
            List<String> commonLines = new ArrayList<>(lines1);
            commonLines.retainAll(lines2);
            if (commonLines.isEmpty()) {
                System.out.println("No direct lines connect " + station1 + " and " + station2 + " in Zone 1.");
            } else {
                System.out.println("The following lines connect " + station1 + " and " + station2 + " in Zone 1.");
                for(String line : commonLines){
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("One or both of the station are not Zone 1 or are not found in the list.");
        }

        scanner.close();//Close the scanner

    }
}