package lesson;

import java.util.Scanner;

public class lesson1 {
    double operand1;
    char operator;
    double operand2;

    static Scanner scanner = new Scanner(System.in);

    public static int calc(double operand1, char operator, double operand2) {
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
            case('/'):
                if(operand2 != 0){
                    result = operand1 / operand2;
                }
                else {
                    System.out.println("Цифра не делиться на 0");
                }
        }

        System.out.println(result);
            return 0;
    }
}



