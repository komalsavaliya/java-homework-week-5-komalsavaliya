package homework_week_8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11_TwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //Compare the two ArrayLists
        if (compareArrayLists(c1, c2)) {
            System.out.println("The ArrayList are the same.");
        } else {
            System.out.println("The ArrayLists are different.");
        }
    }

    public static boolean compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        //Check if the size of two ArrayList is the same
        if (list1.size() != list2.size()) {
            return false;
        }
        //Sort the ArrayLists to ensure order does not matter
        Collections.sort(list1);
        Collections.sort(list2);
        // check if the elements in both ArrayLists are the same
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
