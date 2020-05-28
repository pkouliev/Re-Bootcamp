package day1_StringsAndLoops;

/**
 * Task-4
 * Given any String print out how many times each character is found in the String Ex: java
 * j–1
 * a–2
 * v–1
 */
public class CountLetters {

    public static void main(String[] args) {

        String str = "java";
        String check = "";

        for (int i = 0; i < str.length(); i++) {

            if (check.contains(str.charAt(i) + "")) continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;

            }

            System.out.println(str.charAt(i) + " - " + count);
            check += str.charAt(i);
        }
    }
}
