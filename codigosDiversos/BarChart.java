package codigos_revisados.codigosDiversos;

// criação da classe public de nome BarChart
public class BarChart {

    // método principal
    public static void main(String[] args) {

        // criação de um array [11] do tipo int, definindo valores em cada um dos 11 índices
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        //    índices: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        System.out.println("Grade distribution:");

        // para cada elemento de array, gera saída de uma barra do gráfico representada por *
        // enquanto counter for menor que array.length = 11, counter ++
        for (int counter = 0; counter < array.length; counter++) {

            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10)

                // %5d é o especificador de formato, cada símbolo significa:
                // % início de um especificador de formato
                // 5 largura mínima de 5 caracteres
                // d tipo inteiro decimal (decimal integer)
                // como o número 100 tem apenas 3 dígitos, é preenchido com espaços à esquerda para atingir a largura 5
                System.out.printf("%5d: ", 100);
            else

                // %02d 1º especificador de formato
                // - caractere literal (o traço entre os números)
                // %02d 2º especificador de formato
                // % início do especificador
                // 0 preenche com zeros à esquerda (em vez de espaços)
                // 2 largura mínima de 2 caracteres
                // d tipo inteiro decimal
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

            // imprime a barra de asteriscos
            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}