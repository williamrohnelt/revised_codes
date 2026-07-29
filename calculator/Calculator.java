package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("1: Sum");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        System.out.print("Enter the option number: ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.printf("Sum = %.2f%n", number1 + number2);
        }

        if (option == 2) {
            System.out.printf("Subtraction = %.2f%n", number1 - number2);
        }

        if (option == 3) {
            System.out.printf("Multiplication = %.2f%n", number1 * number2);
        }

        if (option == 4) {
            if (number2 != 0) {
                System.out.printf("Division = %.2f%n", number1 / number2);
            } else {
                System.out.println("Error! Division by zero.");
            }
        }
        scanner.close();
    }
}