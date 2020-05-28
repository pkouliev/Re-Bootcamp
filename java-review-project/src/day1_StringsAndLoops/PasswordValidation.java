package day1_StringsAndLoops;

/**
 * Task – 7 - Password Validation
 * 1. Password MUST be at least 8 characters
 * 2. Password should at least contain one upper case letter
 * 3. Password should at least contain one lowercase letter
 * 4. Password should at least contain one special characters
 * 5. Password should at least contain a digit
 * if all requirements above are met, the password is valid, if not all are met it is invalid
 */
public class PasswordValidation {

    public static void main(String[] args) {

        String password = "a?G6jdsaja";

        boolean length = password.length() >= 8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@.,#$?].*");

        boolean valid = length && lower && upper && number && special;

        if (valid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid password");
        }
    }
}
