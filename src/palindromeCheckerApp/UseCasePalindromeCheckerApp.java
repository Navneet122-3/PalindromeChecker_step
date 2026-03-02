package palindromeCheckerApp;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {


        if (start >= end) {
            return true;
        }


        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }


        return check(s, start + 1, end - 1);
    }
    }