package codigos_revisados.codigosDiversos;

public class PassArray {

    public static void main(String[]args) {

        // cria um array de tamanho 5 
        int[] myArray = { 1, 2, 3, 4, 5 };
        // índices:     [ 0, 1, 2, 3, 4 ]

        System.out.printf("Effects of passing reference to entire array:%n" + "The values of the original array are:%n");

        // for-each, a cada loop, value recebe automaticamente o valor do próximo índice do array, sem precisar especificar o índice
        // gera saida de elementos do array original
        for (int value : myArray) {
            System.out.printf("%d", value);
        }

        // passa a referência do array
        modifyArray(myArray);
        System.out.printf("%n%nThe values of the modified array are:%n");

        // for-each, a cada loop, value recebe automaticamente o valor do próximo índice do array, sem precisar especificar o índice
        // gera saída de elementos do array modificado
        for (int value : myArray) {
        System.out.printf("%d", value);
        }

        System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n", myArray[3]);

        // tenta modificar o array[3]
        modifyElement(myArray[3]);
        System.out.printf("array[3] after modifyElement: %d%n", myArray[3]);
    }

    // multiplica cada elemento de um array por 2
    public static void modifyArray(int[] array) {

        // loop for, counter simboliza cada índice do array myArray
        for (int counter = 0; counter < array.length; counter++) {

            // é igual a: array2[counter] = array2[counter] * 2
            // multiplica o valor do índice counter por 2 e sobrescreve o valor no mesmo lugar
            array[counter] *= 2;
        }
    }

    // criação do método modifyElement que recebe um valor int como argumento
    // multiplica argumento por 2
    public static void modifyElement(int element) {

        // é igual a: element = element * 2
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }
}

// outputs

// Effects of passing reference to entire array:
// The values of the original array are:
// 12345
//
// The values of the modified array are:
// 246810
//
// Effects of passing array element value:
// array[3] before modifyElement: 8
// Value of element in modifyElement: 16
// array[3] after modifyElement: 8