package org.example.week1.java11;

public class StringStripExample {

    public static void main(String[] args) {
        String str = "   Java   ";
        String strippedStr = str.strip();
        System.out.println("[" + strippedStr + "]");
    }
}
