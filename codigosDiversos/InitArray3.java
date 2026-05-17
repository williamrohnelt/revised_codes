package codigosDiversos;

// calcula os valores a serem colocados nos elementos de um array
public class InitArray3 {
    public static void main(String[] args) {

        // criação de uma variável constante (final) do tipo int com valor de 10, o nome deve ser em caixa alta para constantes
        final int ARRAY_LENGTH = 10;

        int[] array = new int[ARRAY_LENGTH]; // cria o array de tamanho 10

        // calcula valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)

            // adiciona em cada índice do array o resultado da conta 2 + 2 * counter
            // array[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}

// Index   Value
//     0       2
//     1       4
//     2       6
//     3       8
//     4      10
//     5      12
//     6      14
//     7      16
//     8      18
//     9      20