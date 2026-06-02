package estruturaDeDadosI.ordenacao;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int array[] = new int[10];

        montar(array);
        imprimir(array, "DESORDENADO");
        bubblesort(array);
        imprimir(array, "ORDENADO COM BUBBLE SORT");
    }

    public static void bubblesort (int array[]) {
        int i;
        int j;
        int aux;
        //int flag;
        // i controla o último índice a ser verificado
        // no primeiro loop, i é 1 para limitar valor de j em 8, pois no último loop j tem que ser menor que 9
        // sendo possível verificar o valor de j com j + 1
        // no segundo loop i é 2, pulando assim o índice 9 nesse loop, pois no índice 9 já temos o maior número definido no primeiro loop
        for (i = 1; i < array.length; i++) { // loop começa em 1 e vai até 9 (< array.length = 10)
           //flag = 0;
           for (j = 0; j < array.length - i; j++) {
              if (array[j] > array[j+1]) {
                 aux = array[j];
                 array[j] = array[j+1];
                 array[j+1] = aux;
                 //flag = 1;
              }
           }
           //if (!flag) return;
        }
    }

    public static void imprimir (int array[], String msg) {
        System.out.printf("*********** %s ***********\n", msg);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void montar (int array[]) {
        Random aleatorio = new Random();
        //aleatorio.setSeed(0);
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(100); // 0 a 99
        }
    }
}

// a lógica dele é baseada em comparações e trocas adjacentes. Ele percorre o array várias vezes,
// comparando dois elementos vizinhos por vez. Se o da esquerda for maior que o da direita, eles trocam de lugar