package codigos_revisados.codigosDiversos;

// inicializando os elementos de um array como valores padrão de zero
public class InitArray {
    public static void main(String[] args) {

        // declara array variável do tipo int e o inicializa com um objeto array de tamanho 10
        int[] array = new int[10];

        // imprime Index e Value na tela
        System.out.printf("%s%8s%n", "Index", "Value");

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}

// Index   Value
//     0       0
//     1       0
//     2       0
//     3       0
//     4       0
//     5       0
//     6       0
//     7       0
//     8       0
//     9       0