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
        for (int j = 1; j < array.length; j++) { // 7° loop, j = 7
            int key = array[j]; // array[j] = array[6] = 7
            int i = j - 1; // i = 5
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i]; // array[i + 1] => array[4 + 1] => array[5] = array[4]
                i = i - 1; // i = 3
            }
            array[i + 1] = key; // array[i + 1] => array[3 + 1] => array[4] = key
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