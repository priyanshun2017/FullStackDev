package Show;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        // Question 2: Palindrome Checker
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            while (left < n && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            while (right >= 0 && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (left < right && Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
