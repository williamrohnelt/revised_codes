package estruturaDeDadosI.recursividade;

import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {

        int[] array = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95 };
        //              0, 1,  2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19

        int num;
        int inicio = 0;
        // fim recebe o tamanho do array menos 1, 20 - 1 = 19
        int fim = array.length - 1;

        // variável do tipo Scanner chamada leitura
        // Scanner é uma classe nativa do Java que fica dentro do pacote java.util
        // argumento System.in, .in significa Standard Input, que no caso de computadores pessoais é o teclado
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja pesquisar no array? ");
        num = leitura.nextInt();

        //int retorno = pesquisaSequencial(array, num);
        int retorno = pesquisaBinariaIterativa(array, num, inicio, fim);
        //int retorno = pesquisaBinariaRecursiva(array, num, inicio, fim);

        if (retorno == -1) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Número encontrado na posição: " + retorno);
        }
        leitura.close();
    }

    // Pesquisa Sequencial
    public static int pesquisaSequencial(int array[], int num) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // pesquisa binária usando uma estrutura de repetição
    public static int pesquisaBinariaIterativa(int array[], int num, int inicio, int fim) {
        //                                      array[20]     30          5         8
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2; // 5 + 8 / 2 = 6
            if (num == array[meio]) {
                return meio;
            } else if (num > array[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    // pesquisa binária usando recursividade
    // recebe como parâmetro o array criado, o número digitado no teclado, o valor início que é 0 e o valor 19 do fim
    public static int pesquisaBinariaRecursiva(int array[], int num, int inicio, int fim) {
        //                                      array[20]     50         10         10
        int meio;
        if (inicio <= fim) {
            meio = (inicio + fim) / 2; // 10 + 10 = 20 / 2 = 10
            if (num == array[meio]) {
                return meio;
            } else if (num > array[meio]) {
                return pesquisaBinariaRecursiva(array, num, meio + 1, fim);
            } else {
                return pesquisaBinariaRecursiva(array, num, inicio, meio - 1);
            }
        }
        return -1;
    }
}