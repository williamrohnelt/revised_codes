package estruturaDeDadosI.recursividade;

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {

        int num;
        long fat;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja calcular o fatorial? ");
        num = leitura.nextInt();

        fat = fatorialIterativo(num);
        fat = fatorialRecursivo(num);

        System.out.printf("O fatorial de %d é: %d", num, fat);

        leitura.close();

    }

    // Fatorial utilizando-se a estratégia iterativa
    public static long fatorialIterativo (int n) {
        int i;
        long fat = 1;
        for (i=n; i>1; i--)
            fat *= i;
        return fat;
    }

    // Fatorial utilizando-se a estratégia recursiva
    public static long fatorialRecursivo (int n) {
        if (n == 1)
            return 1;
        else
            return n * fatorialRecursivo(n-1);
    }

}