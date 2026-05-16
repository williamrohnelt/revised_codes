package codigos_revisados.calculadora;

import java.util.Scanner;

public class Calculadora_switch_char {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println(" + : Soma");
        System.out.println(" - : Subtração");
        System.out.println(" * : Multiplicação");
        System.out.println(" / : Divisão");

        System.out.print("Informa o número da sua opção: ");
        String opcao = scanner.next();

        switch (opcao) {
            case "+":
                System.out.printf("Soma = %.2f%n", numero1 + numero2);
                break;
            case "-":
                System.out.printf("Subtração = %.2f%n", numero1 - numero2);
                break;
            case "*":
                System.out.printf("Multiplicação = %.2f%n", numero1 * numero2);
                break;
            case "/":
                if (numero2 != 0)
                    System.out.printf("Divisão = %.2f%n", numero1 /     numero2);
                else
                    System.out.println("Erro! Divisão por zero.");
                break;
            default:
                System.out.println("Opcao invalida!");
        }
        scanner.close();
    }
}