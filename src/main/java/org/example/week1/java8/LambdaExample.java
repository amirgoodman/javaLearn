package org.example.week1.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        Collections.sort(names, (String a, String b) -> a.compareTo(b));
//        Collections.sort(names, Comparator.naturalOrder());
//        Collections.sort(names, String::compareTo);

        names.forEach(System.out::println);
    }
}
