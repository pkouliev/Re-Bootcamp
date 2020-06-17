package day6_Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Task - 5
 * • Create a method that will accept a String
 * and be print how many times each characters
 * is found in the String
 */

public class CountLetters {

    public static void main(String[] args) {
        countLetter("apples are good for you");
    }

    public static void countLetter(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char key = str.charAt(i);

            if (!map.containsKey(key)) {
                map.put(key, 0);
            }

            map.put(key, map.get(key) + 1);
        }

        // System.out.println(map);

        for (Character key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + map.get(key));
            System.out.println();
        }

    }

}
