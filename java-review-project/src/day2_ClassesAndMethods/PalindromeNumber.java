package day2_ClassesAndMethods;

/**
 * Task - 3
 * • Create a method that will accept a number (long) and determine if the number of palindrome or not.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1203021));
    }

    public static boolean isPalindrome(long num) {

        long remain = num;  // 12321 -> 1232 -> 123 -> 12 -> 1 ->
        long rev = 0;  // 0 -> 1 -> 12 -> 123 -> 1232 -> 12321

        while (remain != 0) {

            long digit = remain % 10; // 1 -> 2 -> 3 -> 2 -> 1

            rev = rev * 10 + digit; // 0 * 10 -> 0 + 1 -> 10 + 2 -> 120 + 3 -> 1230 + 2 -> 12320 + 1

            remain /= 10;
        }

        return num == rev;
    }


}
