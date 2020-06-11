package day5_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("z");
        set.add("y");
        set.add(null);
        set.add("z");
        set.add("80");
        set.add("/");
        set.add(null);
        set.add("z");
        set.add("a");

        System.out.println(set);
    }
}
