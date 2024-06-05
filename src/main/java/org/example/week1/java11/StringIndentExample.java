package org.example.week1.java11;

public class StringIndentExample {

    public static void main(String[] args) {
        String str = "Java\nis\nawesome!";
        String indentedStr = str.indent(4);
        System.out.println(indentedStr);
    }
}
