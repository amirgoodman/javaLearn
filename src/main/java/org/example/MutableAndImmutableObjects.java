package org.example;

import java.util.ArrayList;

public class MutableAndImmutableObjects {

    private void mutableObjectMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }

    private void immutableObjectMethod() {
        String str = "Hello";
        str = str.concat(" World");
        System.out.println(str);

        Integer number = 5;
        number = number + 1;
        System.out.println(number);
    }

    public static void main(String[] args) {
        MutableAndImmutableObjects test = new MutableAndImmutableObjects();
        test.mutableObjectMethod();
        System.out.println("\n====\n");
        test.immutableObjectMethod();
    }
}
