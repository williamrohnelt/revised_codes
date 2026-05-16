package codigos_revisados.codigosDiversos;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        // variável do tipo SecureRandom com o nome de randomNumbers
        // SecureRandom é uma classe da biblioteca java, possui o método .nextInt() para gerar números aleatórios inteiros
        SecureRandom randomNumbers = new SecureRandom();

        // criação de um array de inteiros de 7 posições
        // new aloca espaço na memória para o array
        // int[7] define que o array terá 7 posições, com índices de 0 a 6
        int[] frequency = new int [7];

        // O loop executa exatamente 6.000.000 de vezes, uma por lançamento do dado
        for (int roll = 1; roll <= 6000000; roll++) {

            // .nextInt(6) sorteia um inteiro no intervalo [0, 5], sempre 0 até 5, nunca 6
            // soma 1 ao resultado, deslocando o intervalo para [1, 6], as faces reais de um dado
            // acessa a posição do array correspondente à face sorteada, se saiu o número 4, acessa frequency[4]
            // ++ à esquerda de frequency soma 1 ao índice acessada, registrando que aquela face saiu mais uma vez
            // se o .nextInt() retorna 3, soma mais 1, fica 4, o ++ adiciona 1 no índice 4
            // após 6 milhões de lançamentos, cada posição acumula ~1.000.000
            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        // %s string (sem largura fixa), imprime "Face"
        // %10s string com largura mínima de 10 caracteres, alinhada à direita, imprime "Frequency"
        // %n quebra de linha (equivalente ao \n)
        System.out.printf("%s%10s%n", "Face", "Frequency");

        // gera saída do valor de cada elemento do array
        // face vai de 1 até 6 (frequency.length é 7, e face < 7 exclui o índice 0 que não usamos)
        // a cada iteração imprime uma linha da tabela
        // %4d inteiro com largura mínima de 4 caracteres, número da face alinhado
        // %10d inteiro com largura mínima de 10 caracteres, frequência alinhada
        // %n quebra de linha
        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}

// Simulando 3 lançamentos
// Suponha que o dado sorteie, nessa ordem: 3, 6, 3
// Início:        [0, 0, 0, 0, 0, 0, 0]
//                 0  1  2  3  4  5  6

// Primeiro loop (saiu 3): ++frequency[3]
//                         [0, 0, 0, 1, 0, 0, 0]

// Segundo lançamento (saiu 6): ++frequency[6]
//                              [0, 0, 0, 1, 0, 0, 1]

// Terceiro lançamento (saiu 3): ++frequency[3]
//                               [0, 0, 0, 2, 0, 0, 1]