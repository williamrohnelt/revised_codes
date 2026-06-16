// package serve para organizar e agrupar classes relacionadas em uma mesma estrutura de pastas
package estruturaDeDadosI.ordenacao_com_recursividade;

// importe da classe Random que pertence a um pacote nativo do Java chamado java.util
import java.util.Random;

public class Ordenacao_MergeSort {

    public static void main(String[] args) {

        // an array called array accepts int data and has a length of 10
        int array[] = new int[10];

        // call the createList method and pass the created array as a parameter
        createList(array);

        // call the printList method and pass the created array and a string as parameters
        printList(array, "DESORDENADO");

        // call the createList method and pass the created array as a parameter
        createList(array);

        // call the mergeSort method and pass 
        mergeSort(array, 0, array.length - 1);
        printList(array, "ORDENADO COM MERGE SORT");
    }

    public static void createList(int array[]) {
        Random random = new Random();
        // random.setSeed(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public static void printList(int array[], String msg) {
        int i;
        System.out.println("*********** %s ***********\n" + msg);
        for (i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    // parameters:
    // array[] is the created array
    // start is 0, that is the first array index
    // end is the last array index, in this case is 9

// array original
// [5, 3, 4, 8, 9, 0, 7, 2, 1, 6]
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9 <----array         0         9
//                                      |           |         |
    public static void mergeSort(int array[], int start, int end) { // mergeSort(array, 0, 9) <- método pai

        int half;
        // if start < end, start is 0 and end is 9, so start < end is true
        if (start < end) { // 0 < 9 true
            half = (start + end) / 2; // (0 + 9) / 2 | half = 4
            mergeSort(array, start, half);
                // mergeSort(array, 0, 4) <-- 1° método filho finalizado
                    // [5, 3, 4, 8, 9]
                    //  0, 1, 2, 3, 4
                    // if (0 < 4) true
                    // half = 2
                            // mergeSort(array, 0, 2) <-- 2° método filho finalizado
                                // [5, 3, 4]
                                //  0, 1, 2
                                // if (0 < 2) true
                                // half = 1
                                        // mergeSort(array, 0, 1) <-- 3° método filho finalizado
                                            // [5, 3]
                                            //  0, 1
                                            // if (0 < 1) true
                                            // half = 0
                                                    // mergeSort(array, 0, 0) <-- 4° método filho finalizado
                                                        // [5]
                                                        //  0
                                                        // if (0 < 0) false
                                                    // mergeSort(array, 1, 1) <-- finalizado
                                                        // [3]
                                                        //  1
                                                        // if (1 < 1) false
                                                    // merge(array, 0, 0, 1) <-- finalizado
                                                        // inverte os valores dos índices 0 e 1, antes 5 e 3, agora 3 e 5
                                                        // [3, 5, 4, 8, 9, 0, 7, 2, 1, 6]
                                                        //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                                        // mergeSort(array, 2, 2) <-- finalizado
                                            // [4]
                                            //  2
                                            // if (2 < 2) false
                                        // merge(array, 0, 1, 2) <-- finalizado
                                            // inverte os valores dos índices 1 e 2, antes 5 e 4, agora 4 e 5
                                            // [3, 4, 5, 8, 9, 0, 7, 2, 1, 6]
                                            //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                            // mergeSort(array, 3, 4) <-- finalizado
                                // [8, 9]
                                //  3, 4
                                // if (3 < 4) true
                                // half = 3
                                        // mergeSort(array, 3, 3) <-- finalizado
                                            // [8]
                                            //  3
                                            // if (3 < 3) false
                                        // mergeSort(array, 4, 4) <-- finalizado
                                            // [9]
                                            //  4
                                            // if (4 < 4) false
                                        // merge(array, 3, 3, 4) <-- finalizado
                                            // não inverte os valores dos índices 3 e 4, pois já estão ordenados
                                            // [3, 4, 5, 8, 9, 0, 7, 2, 1, 6]
                                            //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                            // merge(array, 0, 2, 4) <-- finalizado
                                // merge reescreve as posições de 0 a 4 na memória do computador, substituindo os
                                // valores que já estavam lá pelos mesmos valores
            mergeSort(array, half + 1, end);
                // mergeSort(array, 5, 9) <-- 1° método filho finalized
                    // [0, 7, 2, 1, 6]
                    //  5, 6, 7, 8, 9
                    // if (5 < 9) true
                    // half = 7
                            // mergeSort(array, 5, 7) <-- 2° método filho finalized
                                // [0, 7, 2]
                                //  5, 6, 7
                                // if (5 < 7) true
                                // half = 6
                                        // mergeSort(array, 5, 6) <-- 3° método filho finalized
                                            // [0, 7]
                                            //  5, 6
                                            // if (5 < 6) true
                                            // half = 5
                                                    // mergeSort(array, 5, 5) <-- 4° método filho finalizado
                                                        // [0]
                                                        //  5
                                                        // if (5 < 5) false
                                                    // mergeSort(array, 6, 6) <-- finalizado
                                                        // [7]
                                                        //  6
                                                        // if (6 < 6) false
                                                    // merge(array, 5, 5, 6) <-- finalized
                                                        // here the merge checks the 5 and 6 positions, but there is no changes, because this two position
                                                        // are already ordered
                                        // mergeSort(array, 7, 7) <-- finalized
                                            // [2]
                                            //  7
                                            // if (7 < 7) false
                                        // merge(array, 5, 6, 7) <-- finalized
                                            // the positions 5, 6 and 7 are orgnized and are ordered with the values 0, 2 and 7
                                            //  [3, 4, 5, 8, 9, 0, 2, 7, 1, 6]
                                            //   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                            // mergeSort(array, 8, 9) <-- finalized
                                // [1, 6]
                                //  8, 9
                                // if (8 < 9) true
                                // half = 8
                                        // mergeSort(array, 8, 8) <-- finalized
                                            // [1]
                                            //  8
                                            // if (8 < 8) false
                                        // mergeSort(array, 9, 9)  <-- finalized
                                            // [6]
                                            //  9
                                            // if (9 < 9) false
                                        // merge(array, 8, 8, 9)  <-- finalized
                                            // the positions 8 and 9 are already ordered, one less than six
                                            //  [3, 4, 5, 8, 9, 0, 2, 7, 1, 6]
                                            //   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                            // merge(array, 5, 7, 9) <-- finalized
                                // [0, 2, 7, 1, 6]
                                //  5, 6, 7, 8, 9
                                // all the values between position 5 and 9 are now ordered
                                // [ 0, 1, 2, 6, 7]
                                //   5, 6, 7, 8, 9
            merge(array, start, half, end);
                // merge(array, 0, 4, 9)
                    //  [3, 4, 5, 8, 9, 0, 1, 2, 6, 7]
                    //   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
                    // 
        }
    }
    // chegando no pedaço [5, 3] (half = 0), o primeiro método mergeSort dentro do
    // if do método principal mergeSort(int array[], int 0, int 1) dará false pois o half é 0 e o método
    // recebe start = 0 e half = 0 e caindo false no if de dentro. Isso acontece também dentro
    // do segundo método mergeSort, pois recebe half + 1 que é 1 e recebe também end, que é 1,
    // dando falso no if de dentro. Assim os dois métodos mergeSort dentro do
    // método principal mergeSort(int array[], int 0, int 1) são executados sem fazer nada, pois deu false no if,
    // dessa forma o terceiro método é chamado, o merge.


    // algoritmo que utiliza a estratégia do merge para ordenar o array
    // start: início do array
    // half: meio do array
    // end: fim do array
    public static void merge(int array[], int start, int half, int end) { // merge(array[], start = 0, half = 4, end = 9)
        // create the variables
        int i;
        int j;
        int k;
        int n1;
        int n2;

        // in the following two lines, the variables n1 and n2 receive values
        n1 = half - start + 1; // n1 = 7 - 5 + 1 | n1 = 3
        n2 = end - half; // n2 = 9 - 7 | n2 = 2

        // create two arrays, L and R, and define the size
        int L[] = new int[n1 + 1]; // int[4]
        int R[] = new int[n2 + 1]; // int[3]

        // L[0, 0, 0, 0]
        //   0, 1, 2, 3

        // R[0, 0, 0]
        //   0, 1, 2

        // loop for to insert values in the array L
        for (i = 0; i < n1; i++) { // i = 3 false
            L[i] = array[start + i]; // L[2] will receive the array[7], array[7] is 7
        // L[0, 2, 7, 0]
        //   0, 1, 2, 3
        }

        // loop for to insert values in the array R
        for (j = 0; j < n2; j++) { // j = 2 false
            R[j] = array[half + j + 1]; // R[1] will receive the array[9], array[9] is 6
        // R[1, 6, 0]
        //   0, 1, 2
        }

        // the Interger class has a constant called MAX_VALUE, which represents the largest possible integer that java can store in a variable of 32 bits, the exact value
        // is 2.147.483.647, Integer.MAX_VALUE is like the mathematical concept of infinity, there is no number in the array of this class that is greater than it
        // here is defining the MAX_VALUE to the last position of the arrays L and R
        L[n1] = Integer.MAX_VALUE; // L[n1], n1 is 3, so L[3], the index 3 of the array L will receive a max value that integer type support
        R[n2] = Integer.MAX_VALUE; // R[n2], n2 is 2, so R[2], the index 2 of the array R will receive a max value that integer type support

        // L[0, 2, 7, MAX_VALUE]
        //   0, 1, 2, 3

        // R[1, 6, MAX_VALUE]
        //   0, 1, 2

        // array alterado
        //  [3, 4, 5, 8, 9, 0, 1, 2, 6, 7]
        //   0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        i = 0; // i = 3
        j = 0; // j = 2
        for (k = start; k <= end; k++) { // k = 10; k <= 9; k++ FALSE
            if (L[i] <= R[j]) { // L[2] <= R[2] | 7 <= MAX_VALUE TRUE
                array[k] = L[i]; // array[9] = L[2] | array[9] = 7, here the original array is updated
                i++;
            } else {
                array[k] = R[j]; // array[8] = R[1] | array[8] = 6, here the original array is updated
                j++;
            }
        }
    }
}
// Ao contrário do Bubble Sort ou do Insertion Sort, que utilizam loops para comparar elementos adjacentes,
// o Merge Sort baseia-se no paradigma de Dividir para Conquistar, utilizando a recursividade como sua principal força.

// Ordenação com recursividade

// Estratégia recursiva, composta por duas funções:
//      - Merge
//      - Merge Sort

// Abordagem Dividir para Conquistar (Divide-and-Conquer)

// Dividir:
// Decompõe o problema em diversos subproblemas.

// Conquistar:
// Resolve os subproblemas recursivamente.
// Quando o subproblema é pequeno o suficiente, ele é resolvido diretamente.

// Combinar:
// As soluções dos subproblemas são integradas na solução do problema original.

// A operação chave é combinar as duas sequências ordenadas. Haverá uma função
// denominada MERGE(A, p, q, r) para isto, onde:
//      - A é um array
//      - p, q, r são índices numéricos do array, tal que p ≤q < r p indica
//        o índice onde inicia o array, q, o índice do meio do array e r o
//        índice que indica o fim do array.

// Esta função assume que os subarrays A[p..q] e A[q+1..r] estão ordenados.
// Ele combina os subarrays para formar um único array que substitui
// o array A corrente, A[p..r].