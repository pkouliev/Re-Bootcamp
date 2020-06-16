package day6_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Task - 4
 * • Create a method that will accept a String and return a version that has only the unique characters.
 * Ex: unique("AAABCCCDDEFFS") ==> ”BES"
 */

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABCCCDDEFFS"));
    }

    public static String uniqueChar(String str) {

        String unique = "";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : list) {

            int count = Collections.frequency(list, each);

            if (count == 1) unique += each;
        }


        return unique;
    }
}
