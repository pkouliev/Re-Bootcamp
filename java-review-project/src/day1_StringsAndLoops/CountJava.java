package day1_StringsAndLoops;

/**
 * Task-2
 * Write a program that will count how many times “java” is found in any given String
 */
public class CountJava {

    public static void main(String[] args) {


        String str = "java is fun. java is the best";
        int java = 0;

        System.out.println("First Approach");

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.substring(i, i + 4).equalsIgnoreCase("java")) java++;
        }

        System.out.println("java was found " + java + " times on first approach\n");

        System.out.println("Second Approach");

        int java2 = 0;

        str = str.toLowerCase();

        while (str.contains("java")) {

            java2++;

            str = str.replaceFirst("java", "");
        }

        System.out.println("java was found " + java2 + " times on second approach");
    }
}
