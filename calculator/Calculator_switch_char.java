package calculator;

import java.util.Scanner;

public class Calculator_switch_char {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println(" + : Sum");
        System.out.println(" - : Subtraction");
        System.out.println(" * : Multiplication");
        System.out.println(" / : Division");

        System.out.print("Enter the option number: ");
        String option = scanner.next();

        switch (option) {
            case "+":
                System.out.printf("Sum = %.2f%n", number1 + number2);
                break;
            case "-":
                System.out.printf("Subtraction = %.2f%n", number1 - number2);
                break;
            case "*":
                System.out.printf("Multiplication = %.2f%n", number1 * number2);
                break;
            case "/":
                if (number2 != 0)
                    System.out.printf("Division = %.2f%n", number1 /     number2);
                else
                    System.out.println("Error! Division by zero.");
                break;
            default:
                System.out.println("Invalid option!");
        }
        scanner.close();
    }
}