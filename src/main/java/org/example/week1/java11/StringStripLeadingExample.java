package org.example.week1.java11;

public class StringStripLeadingExample {

    public static void main(String[] args) {
        String str = "   Java   ";
        String strippedLeadingStr = str.stripLeading();
        System.out.println("[" + strippedLeadingStr + "]");
    }
}
