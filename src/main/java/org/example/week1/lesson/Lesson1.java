package org.example.week1.lesson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lesson1 {

    static Scanner scanner = new Scanner(System.in);

    public static double calc(double operand1, char operator, double operand2) {
        double result = 0;
        switch (operator) {
            case ('+'):
                result = operand1 + operand2;
                break;
            case ('-'):
                result = operand1 - operand2;
                break;
            case ('*'):
                result = operand1 * operand2;
                break;
            case ('/'):
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Цифра не делиться на 0");
                }
            default:
                System.err.println("Error");
        }
        return result;
    }

    public static void main(String[] args) {
        int i = 3;
        while (i-- > 0) {
            System.out.print("Введите первый операнд: ");
            double operand1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите оператор(+,-,*,/): ");
            char operator = scanner.nextLine().charAt(0);

            System.out.print("Введите второй операнд: ");
            double operand2 = Double.parseDouble(scanner.nextLine());

            double result = calc(operand1, operator, operand2);
            String value = String.format("%.3f", result);
            System.out.println(value);
            if(scanner.nextLine().equals("Выход")){
                break;
            }

        }

        // TODO: 3. FastScanner;
    }
}

