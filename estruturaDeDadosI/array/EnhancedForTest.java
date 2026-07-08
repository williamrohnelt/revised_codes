package estruturaDeDadosI.array;

// Utilizando a instrução for aprimorada para somar inteiros em um array
public class EnhancedForTest {
    public static void main(String[] args) {

        // cria um array de inteiros, com o nome de array, tamanho 10 e valores definidos 
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        //    índices:   0,  1,  2,   3,  4,  5,  6,  7,  8,  9

        // criação de uma variável int de nome total e valor 0
        int total = 0;

        // adiciona o valor de cada elemento ao total
        for (int number : array) {

            // total = total + number
            // primeiro loop: total = 0 + 87 (number recebe no primeiro loop o valor do primeiro índice do array)
            total += number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}

// Total of array elements: 849