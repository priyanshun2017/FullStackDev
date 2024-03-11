package Show;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 3: Anagram Detector
        System.out.println("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter String 1: ");
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str1, String str2) {
    	// Implementation here
    	int n = str1.length();
    	int m = str2.length();
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();
    	if(n != m)
    		return false;
    	int[] array = new int[26];
    	for(int i=0 ; i<n ; i++)
    	{
    		int temp1 = str1.charAt(i)-'a';   
    		int temp2 = str2.charAt(i) - 'a';
    		array[temp1] += 1;
    		array[temp2] += 1;
    	}
    	for(int i=0 ; i<26 ; i++)
    	{
    		if(array[i] == 1)
    			return false;
    	}
    	return true;
    }
}
