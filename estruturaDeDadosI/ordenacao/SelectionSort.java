package estruturaDeDadosI.ordenacao;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int vetor[] = new int[10];

        montar(vetor);
        imprimir(vetor, "DESORDENADO");
        montar(vetor);
        selectionsort(vetor);
        imprimir(vetor, "ORDENADO COM SELECTION SORT");
    }

    public static void selectionsort(int vetor[]) {
        int i, j, menor, aux;
        for (i = 0; i < vetor.length; i++) {
            menor = i;
            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
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