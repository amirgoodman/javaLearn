package org.example.week1.java7;

import java.util.ArrayList;
import java.util.List;

public class DiamondSyntaxExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("7");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
