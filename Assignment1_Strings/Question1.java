package Show;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 1: Remove the duplicate from a string
    	System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();
        removeDuplicates(input, n);
    }

    private static void removeDuplicates(String input, int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = input.charAt(i);
            if (output.indexOf(String.valueOf(currentChar)) == -1) {
                output.append(currentChar);
            }
        }
        System.out.println(output);
    }
}
