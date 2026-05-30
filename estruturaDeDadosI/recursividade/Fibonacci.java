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

    // Fibonacci utilizando-se a estratégia iterativa
    public static long fibonacciIterativo (int n) {
        int i;
        long n_menos_1, n_menos_2, res;
        res = 0;
        if (n == 1 || n == 2)
            return 1;
        else {
            n_menos_1 = 1; n_menos_2 = 1;
            for (i=3; i<=n; i++) {
                res = n_menos_1 + n_menos_2;
                n_menos_1 = n_menos_2;
                n_menos_2 = res;
            }
            return res;
        }
    }

    // Fibonacci utilizando-se a estratégia recursiva
    public static long fibonacciRecursivo (int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }

}