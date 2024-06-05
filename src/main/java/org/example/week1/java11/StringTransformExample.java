package org.example.week1.java11;

public class StringTransformExample {

    public static void main(String[] args) {
        String str = "java";
        String transformedStr = str.transform(s -> s + " is awesome!");
        System.out.println(transformedStr);
    }
}
