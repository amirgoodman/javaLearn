package org.example.project;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        // TODO
        /*
        Greeting console (hello, options (1-search, 2-my bookings, 3-history, 4-bucket))
        Persons (Amir, ...)
        Book
        Author
        Search (filter-tags, filter-genre, filter-author, filter-year, filter-book-name)
         */

        int[] a = new int[4];  // {[],[],[],[]} stack
        int[][] b = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println(a[2]);

        ArrayList arr = new ArrayList();  // {} heap
        for (int i = 0; i < a.length; i++) {
            System.out.println(arr.get(i));
        }

        for (int i = 0; i < a.length; i++) {
            arr.add(i);
        }
        arr.get(2);
    }
}
