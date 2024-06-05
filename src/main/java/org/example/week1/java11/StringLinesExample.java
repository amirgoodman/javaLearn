package org.example.week1.java11;

public class StringLinesExample {

    public static void main(String[] args) {
        String multilineString = "Hello\nWorld\nJava";
        multilineString.lines().forEach(System.out::println);
    }
}
