package estruturaDeDadosI.ordenacao;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        int array[] = new int[10];

        montar(array);
        imprimir(array, "DESORDENADO");
        montar(array);
        selectionSort(array);
        imprimir(array, "ORDENADO COM SELECTION SORT");
    }

    public static void montar(int array[]) {
        Random aleatorio = new Random();
        aleatorio.setSeed(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(10);
        }
    }

    public static void imprimir(int array[], String msg) {
        System.out.printf("*********** %s ***********\n", msg);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) { // i = 1
            int menorNumEncontrado = i; // menorNumEncontrado = 1
            for (int j = i + 1; j < array.length; j++) { // j = i + 1 | j = 1 + 1 | j = 5
                if (array[j] < array[menorNumEncontrado]) { // array[4] < array[3] | 9 < 1
                    menorNumEncontrado = j; // menorNumEncontrado = 5
                }
            }
            int aux = array[menorNumEncontrado]; // aux = array[5] | aux = 0
            array[menorNumEncontrado] = array[i]; // array[5] = array[0]
            array[i] = aux; // array[0] = aux
        }
    }
}
// original
// [5, 3, 4, 1, 9, 0, 7, 2, 8, 6]
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9

// 2° loop
// [0, 3, 4, 1, 9, 5, 7, 2, 8, 6]
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//                 |           |
//                 |           j
//               menor

// Neste algoritmo de ordenação cada número do array, a partir do primeiro, será eleito e comparado com o menor número dentre aqueles que
// estão à direita do eleito. Nessas comparações procura-se um número menor que o eleito.
// Quando um número satisfaz as condições da ordenação desejada, este trocará de posição com o eleito,
// assim, todos os números à esquerda do eleito ficam sempre ordenados. Nesse algoritmo, um laço com as comparações será executado do
// primeiro ao penúltimo elemento, ou seja, na quantidade de vezes igual ao número de elementos do
// array menos um (for (i = 0; i < n - 1; i++)), pois as comparações são realizadas com os elementos à direito do número eleito, e o número
// da última posição não tem elementos à direita. O número eleito está na posição i. Os números à direita do eleito estão nas posições
// de i + 1 à n - 1, sendo no número de elementos do array. Logo, o laço a ser execurado para encontrar o menor elemento à direita do
// eleito será (for (j = i + 2; j <= n - 1; j++)). Lembrando que o primeiro elemento à direita do número eleito começa sendo considerado o menor número.