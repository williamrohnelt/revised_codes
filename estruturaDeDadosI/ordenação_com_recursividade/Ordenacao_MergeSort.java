package estruturaDeDadosI.ordenação_com_recursividade;

import java.util.Random;

public class Ordenacao_MergeSort {

    public static void main(String[] args) {

        int vetor[] = new int[10];

        montar(vetor);
        imprimir(vetor, "DESORDENADO");
        montar(vetor);
        mergesort(vetor, 0, vetor.length - 1);
        imprimir(vetor, "ORDENADO COM MERGE SORT");
    }

    // algoritmo que utiliza a estratégia do merge para ordenar o vetor
    // p: início do vetor
    // q: meio do vetor
    // r: fim do vetor
    public static void merge(int A[], int p, int q, int r) {
        int i, j, k, n1, n2;
        n1 = q - p + 1;
        n2 = r - q;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for (i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }

        for (j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        i = 0;
        j = 0;
        for (k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    // função que faz as chamadas recursivas para a função merge_sort e aplica a
    // função merge quando necessário
    public static void mergesort(int A[], int p, int r) {
        int q;
        if (p < r) {
            q = (p + r) / 2;
            mergesort(A, p, q);
            mergesort(A, q + 1, r);
            merge(A, p, q, r);
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