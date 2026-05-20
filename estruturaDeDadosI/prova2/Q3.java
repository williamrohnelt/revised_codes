package estruturaDeDadosI.prova2;

public class Q3 {
    public static void main(String[] args) {

        // variável i
        int i;

        // array de float de tamanho 5 chamado numbers
        // f indica que o número é do tipo float, o Java interpreta qualquer número decimal como double por padrão
        float numbers[] = {8.0f, 8.2f, 7.8f, 9.2f, 9.6f};
        //                  0     1     2     3     4

        for (i = 0; i < numbers.length; i++) {
            // numbers[i] = numbers[i] / 2.0;
            numbers[i] /= 2.0;
        }

        for (i = 2; i < numbers.length; i++) {
            System.out.printf("%.2f\t", numbers[i]);
        }
    }
}

// 4.0f  4.1f  3.8f  4.6f  4.8f
//  0     1     2     3     4
// 3.9    4.6    4.8