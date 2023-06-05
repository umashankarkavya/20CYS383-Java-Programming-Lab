package com.ramaguru.amrita.cys.jpl.datastructures;

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
     * It creates an array of roll numbers and prints each roll number using a for-each loop.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String[] rollNumber = {
                "CB.EN.U4CYS22081",
                "CB.EN.U4CYS22072",
                "CB.EN.U4CYS22023",
                "CB.EN.U4CYS22064",
                "CB.EN.U4CYS22065"
        };

        for (String number : rollNumber) {
            System.out.println(number);
        }

        // Call the new method
        processArray(rollNumber);
    }

    /**
     * A new method to demonstrate processing of the array.
     *
     * @param array the array to process
     */
    public static void processArray(String[] array) {
        // Perform some processing on the array
        // For example, let's update the second element
        if (array.length >= 2) {
            array[1] = "CB.EN.U4CYS22076";
        }

        // Print the updated array
        for (String number : array) {
            System.out.println(number);
        }
    }
}