package codigosDiversos;

// inicializando os elementos de um array com um inicializador de array
public class InitArray2 {
    public static void main(String[] args) {

        // a lista de inicializador especifica o valor inicial de cada elemento
        // tamanho 10
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}

// Index   Value
//     0      32
//     1      27
//     2      64
//     3      18
//     4      95
//     5      14
//     6      90
//     7      70
//     8      60
//     9      37