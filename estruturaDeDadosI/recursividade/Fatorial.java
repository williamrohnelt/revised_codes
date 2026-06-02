package estruturaDeDadosI.recursividade;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        int num;
        long fat;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja calcular o fatorial? ");
        num = leitura.nextInt();

        //fat = fatorialIterativo(num);
        fat = fatorialRecursivo(num);

        System.out.printf("O fatorial de %d é: %d", num, fat);

        leitura.close();
    }

    // fatorial utilizando-se a estratégia iterativa (com loops)
    public static long fatorialIterativo (int num) { // num = 10
        int i;
        long fat = 1;
        for (i = num; i > 1; i--) { // i = 1; i > 1; i--
            fat *= i; // fat = fat * i = 1814400 * 2 = 3628800
        }
        return fat; // fat = 3628800
    }

    // fatorial utilizando-se a estratégia recursiva (função que chama a si mesma)
    public static long fatorialRecursivo (int num) { // num = 6
        if (num == 1) {
            return 1;
        } else {
            return num * fatorialRecursivo(num - 1);
        }
    }
}

// O fatorial de 6 é: 720

// 6 * fatorialRecursivo(6 - 1); // 6 * 120 = 720
// 5 * fatorialRecursivo(5 - 1); // 5 * 24 = 120
// 4 * fatorialRecursivo(4 - 1); // 4 * 6 = 24
// 3 * fatorialRecursivo(3 - 1); // 3 * 2 = 6
// 2 * fatorialRecursivo(2 - 1); // 2 * 1 = 2

// Na matemática, o fatorial de um número inteiro positivo $n$ (representado pelo símbolo de exclamação $n!$)
// é o produto de todos os números inteiros positivos menores ou iguais a $n$
// n! = n x (n - 1) x (n - 2) x ... x 1
// Exemplo com o número 5: 5! = 5 x 4 x 3 x 2 x 1 = 120