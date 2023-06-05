package com.ramaguru.amrita.cys.jpl.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayListExample class demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
 * It creates an ArrayList of student roll numbers, adds student roll numbers to it, and uses an Iterator to traverse and print the student roll numbers.
 * This class provides a basic example of working with ArrayList in Java.
 *
 * Usage:
 * - The program creates an ArrayList of strings to represent student roll numbers.
 * - It adds student roll numbers to the ArrayList.
 * - It retrieves an Iterator from the ArrayList to iterate over its elements.
 * - It uses the Iterator to print the student roll numbers one by one.
 *
 * Note: This example uses a simple ArrayList of strings and manually retrieves and prints the elements.
 *
 * Dependencies:
 * - None
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class ArrayListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of ArrayList to store and iterate over a collection of student roll numbers.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> u21cys = new ArrayList<String>();

        u21cys.add("CB.EN.U4CYS22026");
        u21cys.add("CB.EN.U4CYS22027");
        u21cys.add("CB.EN.U4CYS22028");
        u21cys.add("CB.EN.U4CYS22029");
        u21cys.add("CB.EN.U4CYS22030");
        // Get the iterator
        Iterator<String> it = u21cys.iterator();

        // Print the cars using the iterator
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
package com.ramaguru.amrita.cys.jpl.datastructures;

        import java.util.HashMap;

/**
 * The HashMapExample class demonstrates the usage of HashMap to store and retrieve roll numbers and names.
 * It creates a HashMap to associate roll numbers with corresponding names.
 * This class provides a basic example of working with HashMap in Java.
 *
 * Usage:
 * - The program creates a HashMap called rollName to store roll numbers and names.
 * - It adds key-value pairs (roll numbers and names) to the HashMap using the put() method.
 * - It retrieves the value (name) associated with a specific key (roll number) using the get() method.
 * - It prints the retrieved name.
 *
 * Note: This example uses a HashMap of strings to represent roll numbers and names.
 *
 * Dependencies:
 * - None
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class HashMapExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of HashMap to store and retrieve roll numbers and names.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a HashMap object called rollName
        HashMap<String, String> rollName = new HashMap<String, String>();

        // Add keys and values (roll numbers and names) to the HashMap
        rollName.put("CB.EN.U4CYS21001", "Abinesh G");
        rollName.put("CB.EN.U4CYS21011", "A S Deepan");
        rollName.put("CB.EN.U4CYS21021", "Gundala Kushal Bhavani Reddy");
        rollName.put("CB.EN.U4CYS21031", "Kishanth K");
        rollName.put("CB.EN.U4CYS21041", "Middivari Charan Kumar Reddy");
        rollName.put("CB.EN.U4CYS21051", "Nithin S");
        rollName.put("CB.EN.U4CYS21061", "Roshni V");
        rollName.put("CB.EN.U4CYS21071", "Sourabh Sasikanthan");
        rollName.put("CB.EN.U4CYS21081", "Koti Venkatadinesh Reddy");

        // Retrieve and print the name associated with a specific roll number
        System.out.println(rollName.get("CB.EN.U4CYS21011"));
    }
}
package com.ramaguru.amrita.cys.jpl.datastructures;

        import java.util.LinkedList;

/**
 * The LinkedListExample class demonstrates the usage of LinkedList to store and retrieve elements.
 * It creates a LinkedList to store car names.
 * This class provides a basic example of working with LinkedList in Java.
 *
 * Usage:
 * - The program creates a LinkedList called cars to store student roll numbers.
 * - It adds elements to the LinkedList using the add() method.
 * - It prints the contents of the LinkedList.
 *
 * Note: This example uses a LinkedList of strings to represent student roll numbers.
 *
 * Dependencies:
 * - None
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class LinkedListExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of LinkedList to store and retrieve elements.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> u21cys = new LinkedList<String>();

        u21cys.add("CB.EN.U4CYS22031");
        u21cys.add("CB.EN.U4CYS22032");
        u21cys.add("CB.EN.U4CYS22033");
        u21cys.add("CB.EN.U4CYS22034");
        u21cys.add("CB.EN.U4CYS22035");

        // Print the contents of the LinkedList
        System.out.println(u21cys);
    }
}
package com.ramaguru.amrita.cys.jpl.oops.inheritance;

/**
 * The Shape class represents a generic shape.
 * It provides methods for calculating the area and displaying the shape.
 * This class serves as the superclass for specific shape classes.
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
class Shape {

    /**
     * Calculates the area of the shape.
     * This method is meant to be overridden by subclasses.
     */
    public void area() { }

    /**
     * Displays information about the shape.
     * This method is meant to be overridden by subclasses.
     */
    public void display() {
        System.out.println("[Super] Calculating Area");
    }

}

/**
 * The Circle class represents a circle shape.
 * It extends the Shape class and provides its own implementation for area calculation.
 */
class Circle extends Shape {

    /**
     * Calculates the area of a circle.
     * Overrides the area() method in the superclass.
     */
    public void area() {
        System.out.println("[Circle] Area of Circle is PI*R*R");
    }

}

/**
 * The Rectangle class represents a rectangle shape.
 * It extends the Shape class and provides its own implementation for area calculation.
 */
class Rectangle extends Shape {

    /**
     * Calculates the area of a rectangle.
     * Overrides the area() method in the superclass.
     */
    public void area() {
        System.out.println("[Rectangle] Area of Rectangle is L*B");
    }

}

/**
 * The Inheritance class demonstrates inheritance in action.
 * It creates instances of Circle and Rectangle classes and invokes their methods.
 */
public class Inheritance {
    /**
     * The main method is the entry point of the program.
     * It creates objects of Circle and Rectangle and calls their display() and area() methods.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        System.out.println("[Main] Creating Objects Circle and Rectangle");

        Circle myCircle = new Circle(); // Create a Circle object
        myCircle.display();
        myCircle.area();

        Rectangle myRect = new Rectangle(); // Create a Rectangle object
        myRect.display();
        myRect.area();
    }

}
package practise.gui;

/**
 * The ArrayExample class demonstrates the usage of an array to store and display roll numbers.
 * It creates an array of roll numbers and prints each roll number using a for loop.
 * This class provides a basic example of working with arrays in Java.
 *
 * Usage:
 * - The program creates an array of roll numbers with a specified size.
 * - It assigns roll numbers to array elements.
 * - It uses a for loop to iterate through the array and print each roll number.
 *
 * Note: This example assumes a fixed size for the array and assigns values manually.
 *
 * Dependencies:
 * - None
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class ArrayExample {
    /**
     * The main method is the entry point of the program.
     * It creates an array of roll numbers and prints each roll number using a for loop.
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        String rollNumber[] = new String[5];

        rollNumber[0] = "CB.EN.U4CYS22021";
        rollNumber[1] = "CB.EN.U4CYS22022";
        rollNumber[2] = "CB.EN.U4CYS22023";
        rollNumber[3] = "CB.EN.U4CYS22024";
        rollNumber[4] = "CB.EN.U4CYS22025";

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.println(rollNumber[i]);
        }
    }
}
