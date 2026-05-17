package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("1: Soma");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");

        System.out.print("Informa o número da sua opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1)
            System.out.printf("Soma = %.2f%n", numero1 + numero2);

        if (opcao == 2)
            System.out.printf("Subtração = %.2f%n", numero1 - numero2);

        if (opcao == 3)
            System.out.printf("Multiplicação = %.2f%n", numero1 * numero2);

        if (opcao == 4) {
            if (numero2 != 0)
                System.out.printf("Divisão = %.2f%n", numero1 / numero2);
            else
                System.out.println("Erro! Divisão por zero.");
        }
        scanner.close();
    }
}