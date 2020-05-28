package day1_StringsAndLoops;

/**
 * Given any String if it is Palindrome. Print "Palindrome" if it is and "Not Palindrome" if it is not
 */
public class Palindrome {

    public static void main(String[] args) {


        String str = "abcdcba";
        boolean check = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
//        System.out.println(check ? "Palindrome" : "Not Palindrome"); // ternary
    }


}
