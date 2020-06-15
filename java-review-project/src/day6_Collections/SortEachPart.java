package day6_Collections;

import java.util.Arrays;

/**
 * Task - 1
 * Create a method that will take any String of letters and numbers and sort each substring of numbers and
 * letters
 * Ex:
 * Input: "DC501GCCCA098911"
 * OutPut: "CD015ACCCG011899"
 */

public class SortEachPart {

    public static void main(String[] args) {
        System.out.println(sortEach("C501GCCCA098911"));
    }

    public static String sortEach(String str) {

        String sorted = "";
        String each = "";

        for (int i = 0; i < str.length(); i++) {

            each += str.charAt(i);

            if (Character.isLetter(str.charAt(i))) {

                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    sorted += sortSubstring(each);
                    each = "";
                }
            } else {

                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    sorted += sortSubstring(each);
                    each = "";
                }
            }
        }

        return sorted;
    }

    private static String sortSubstring(String str) {

        String[] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replace("[", "").replace("]", "").
                replace(", ", "");

    }
}
