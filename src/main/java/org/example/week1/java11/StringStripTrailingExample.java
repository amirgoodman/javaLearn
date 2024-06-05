package org.example.week1.java11;

public class StringStripTrailingExample {

    public static void main(String[] args) {
        String str = "   Java   ";
        String strippedTrailingStr = str.stripTrailing();
        System.out.println("[" + strippedTrailingStr + "]");
    }
}
