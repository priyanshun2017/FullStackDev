package Show;

import java.util.HashMap;
import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 5: Word Frequency Counter
        System.out.println("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        printWordFrequencies(str1);
    }
 // You'll likely need a HashMap and helper functions
    public static void printWordFrequencies(String text) {
    // Implementation
            HashMap<String, Integer> map = new HashMap<>();
            StringBuilder temp = new StringBuilder();
            int n = text.length();

            for (int i = 0; i < n; i++) {
                char currentChar = text.charAt(i);

                if (Character.isLetterOrDigit(currentChar)) {
                    temp.append(currentChar);
                } else if (temp.length() > 0) {
                    String word = temp.toString().toLowerCase(); // Ignore case
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    temp.setLength(0); // Clear the StringBuilder for the next word
                }
            }

            // Check for the last word in the text
            if (temp.length() > 0) {
                String lastWord = temp.toString().toLowerCase(); // Ignore case
                map.put(lastWord, map.getOrDefault(lastWord, 0) + 1);
            }

            // Print word frequencies
            for (String word : map.keySet()) {
                System.out.println(word + ": " + map.get(word));
            }
        }
 
}
