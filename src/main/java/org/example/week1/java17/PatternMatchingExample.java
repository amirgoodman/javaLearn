package org.example.week1.java17;

public class PatternMatchingExample {

    public static void main(String[] args) {
        Object obj = "Hello, World!";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println("Not a string");
        }
    }
}
