package practise.gui;

import java.util.HashMap;


public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap object called rollName
        HashMap<String, String> rollName = new HashMap<>();

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
        String rollNumber = "CB.EN.U4CYS21011";
        String name = rollName.get(rollNumber);
        if (name != null) {
            System.out.println("Name for roll number " + rollNumber + ": " + name);
        } else {
            System.out.println("No name found for roll number " + rollNumber);
        }

        // Call the new method
        processHashMap(rollName);
    }


    public static void processHashMap(HashMap<String, String> map) {

        String rollNumberToRemove = "CB.EN.U4CYS21061";
        map.remove(rollNumberToRemove);
        System.out.println("Removed key-value pair for roll number " + rollNumberToRemove);

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + map);
    }
}