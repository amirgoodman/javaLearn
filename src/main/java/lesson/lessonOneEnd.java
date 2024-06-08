package lesson;

import java.util.Scanner;

public class lessonOneEnd {

    static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите первый операнд:");
            double operand1 = scanner.nextDouble();

            System.out.print("Введите оператор(+,-,*,/):");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второй операнд:");
            double operand2 = scanner.nextDouble();

            int c = lesson1.calc(operand1,operator,operand2);
            System.out.println(c);

        }
    }

}
