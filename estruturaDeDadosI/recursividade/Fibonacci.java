package estruturaDeDadosI.recursividade;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int num;
        long fib;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o termo do fibonacci a ser calculado: ");
        num = leitura.nextInt();

        fib = fibonacciIterativo(num);
        //fib = fibonacciRecursivo(num);

        System.out.printf("O fibonacci de %d é: %d", num, fib);

        leitura.close();
    }

    // Sequência: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
    //            0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10...

    // Fibonacci utilizando-se a estratégia iterativa
    public static long fibonacciIterativo(int num) {
        int i;
        long n_menos_1;
        long n_menos_2;
        long res = 0;

        if (num == 1 || num == 2) {
            return 1;
        } else {
            n_menos_1 = 1; n_menos_2 = 1;
            for (i = 3; i <= num; i++) { // num = 4
                res = n_menos_1 + n_menos_2; // res = 1 + 2 = 3
                n_menos_1 = n_menos_2; // n_menos_1 = 2
                n_menos_2 = res; // n_menos_2 = 3
            }
            return res;
        }
    }

    // Fibonacci utilizando-se a estratégia recursiva
    public static long fibonacciRecursivo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }
}