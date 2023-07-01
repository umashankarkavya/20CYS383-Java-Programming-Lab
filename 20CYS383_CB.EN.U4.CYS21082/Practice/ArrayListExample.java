package practise.gui;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> u21cys = new ArrayList<>();

        u21cys.add("CB.EN.U4CYS22078");
        u21cys.add("CB.EN.U4CYS22045");
        u21cys.add("CB.EN.U4CYS22032");
        u21cys.add("CB.EN.U4CYS22011");
        u21cys.add("CB.EN.U4CYS22018");

        // Print the elements using an Iterator
        Iterator<String> iterator = u21cys.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Call the new method
        processArrayList(u21cys);
    }

    /**
     * A new method to demonstrate processing of the ArrayList.
     *
     * @param list the ArrayList to process
     */
    public static void processArrayList(ArrayList<String> list) {
        // Perform some processing on the ArrayList
        // For example, let's remove the second element
        if (list.size() >= 2) {
            String removedElement = list.remove(1);
            System.out.println("Removed element: " + removedElement);
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + list);
    }
}