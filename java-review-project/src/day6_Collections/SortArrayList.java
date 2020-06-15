package day6_Collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Task - 2
 * Create a method that will accept an ArrayList and sort the ArrayList into ascending order (s -> l).
 * Do not sure any ready sort method.
 * -> How will you do the opposite direction (l -> s)?
 */

public class SortArrayList {

    public static void main(String[] args) {
        // 4, 1, 4, 5, 2, 3, 1
        // 1, 1, 2, 3, 4, 4, 5
        // temp = 4
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 4, 5, 2, 3, 1));
        System.out.println(sortList(list));
    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;

    }
}
