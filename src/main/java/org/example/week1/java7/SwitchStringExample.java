package org.example.week1.java7;

public class SwitchStringExample {

    public static void main(String[] args) {
        String day = "MONDAY";
        switch (day) {
            case "MONDAY":
                System.out.println("Start of the work week");
                break;
            case "FRIDAY":
                System.out.println("End of the work week");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Midweek days");
                break;
        }
    }
}
