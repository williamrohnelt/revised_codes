package estruturaDeDadosI.ordenacao;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        int array[] = new int[10];

        montar(array);
        imprimir(array, "DESORDENADO");
        montar(array);
        insertionsort(array);
        imprimir(array, "ORDENADO COM INSERTION SORT");
    }

    public static void montar(int array[]) {
        Random aleatorio = new Random();
        aleatorio.setSeed(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(100); // 0 a 99 = 100 numbers
        }
    }

    public static void imprimir(int array[], String msg) {
        System.out.printf("*********** %s ***********\n", msg);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void insertionsort(int array[]) {
        for (int i = 1; i < array.length; i++) { // 7° loop, j = 7
            int key = array[i]; // array[j] = array[6] = 7
            int j = i - 1; // i = 5
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // array[i + 1] => array[4 + 1] => array[5] = array[4]
                j = j - 1; // i = 3
            }
            array[j + 1] = key; // array[i + 1] => array[3 + 1] => array[4] = key
        }
    }
}

// [5, 3, 4, 8, 9, 0, 7, 2, 1, 6]
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9

// terceiro loop
// [0, 3, 4, 5, 7, 8, 9, 2, 1, 6]
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//           |        |
//           i        key = 7

// Neste algoritmo de ordenação será eleito (key) o segundo número do array para iniciar as comparações.
// Assim, os elementos à esquerda do número key estão sempre ordenados de forma crescente ou decrescente.
// Logo, um laço com as comparações será executado do segundo key ao último, ou seja, na quantidade de vezes igual ao
// número de elementos do array menos um (for (i = 1; i < array.length; i++)). Enquanto existirem elementos à esquerda do número
// key para comparações e a posição que atende a ordenação que se busca não for encontrada, o laço será executado.
// O número key está na posição i. Os números à esquerda do key estão nas posições de i - 1 à 0, logo,
// o laço a ser executado será (j = i - 1) e (while (j >= 0 && array[j] > key)).