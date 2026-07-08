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

    public static void montar (int array[]) {
        Random aleatorio = new Random();
        //aleatorio.setSeed(0);
        for (int i = 0; i < array.length; i++) {
            // método nextInt(100) retorna um valor aleatório de 0 a 99
            array[i] = aleatorio.nextInt(100); // 0 a 99
        }
    }

    public static void imprimir (int array[], String msg) {
        System.out.printf("*********** %s ***********\n", msg);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void bubblesort (int array[]) {
        //int flag;
        // i controla o último índice a ser verificado
        // no primeiro loop, i é 1 para limitar valor de j em 8, pois no último loop j tem que ser menor que 9
        // sendo possível verificar o valor de j com j + 1
        // no segundo loop i é 2, pulando assim o índice 9 nesse loop, pois no índice 9 já temos o maior número definido no primeiro loop
        for (int j = 1; j < array.length; j++) { // loop começa em 1 e vai até 9 (< array.length = 10)
           //flag = 0;
           for (int i = 0; i < array.length - i; i++) {
              if (array[i] > array[i+1]) {
                 int aux = array[i];
                 array[i] = array[i+1];
                 array[i+1] = aux;
                 //flag = 1;
              }
           }
           //if (!flag) return;
        }
    }
}

// a lógica é baseada em comparações e trocas adjacentes, percorre o array várias vezes,
// comparando dois elementos vizinhos por vez. Se o da esquerda for maior que o da direita, eles trocam de lugar

// Neste algoritmo de ordenação serão efetuadas comparações entre os dados armazenados em um vetor de tamanho n.
// Cada elemento de posição i será comparado com o elemento de posição i+1, e quando a ordenação procurada
// (crescente ou decrescente) é encontrada, uma troca de posições entre os elementos é feita.
// Assim, um laço com a quantidade de elementos do vetor será executado (for (j=l; j<=n; j ++)),
// e dentro deste, um outro laço que percorre da primeira à penúltima posição do vetor (for (i=O; i<n-1; i++)).