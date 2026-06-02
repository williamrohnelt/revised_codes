package estruturaDeDadosI.ordenacao;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int vetor[] = new int[10];

        montar(vetor);
        imprimir(vetor, "DESORDENADO");
        montar(vetor);
        insertionsort(vetor);
        imprimir(vetor, "ORDENADO COM INSERTION SORT");
    }

    public static void insertionsort(int vetor[]) {
        int i, j, key;
        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            i = j - 1;
            while (i >= 0 && vetor[i] > key) {
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = key;
        }
    }

    public static void imprimir(int vetor[], String msg) {
        int i;
        System.out.println("*********** %s ***********\n" + msg);
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println();
    }

    public static void montar(int vetor[]) {
        Random aleatorio = new Random();
        // aleatorio.setSeed(0);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100);
        }
    }
}