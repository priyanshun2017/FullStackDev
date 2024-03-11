package Show;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 4: Reversing a String (Level 2 - No built-in reversal)
        System.out.println("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(reverseString(str1));
    }
    public static String reverseString(String str) {
    	// Implementation without using built-in reversal functions
    	int n = str.length();
    	StringBuilder sb = new StringBuilder();
    	for(int i=0 ; i<n ; i++)
    	{
    		char c = str.charAt(n-i-1);
    		sb.append(c);
    	}
    	return sb.toString();
    }
 
}
