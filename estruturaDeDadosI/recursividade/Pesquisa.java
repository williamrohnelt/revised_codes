package estruturaDeDadosI.recursividade;

import java.util.Scanner;

public class Pesquisa {
    
    public static void main(String[] args) {

        int vetor[] = {1,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95};
        int num;
        int inicio = 0;
        int fim = vetor.length - 1;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja pesquisar no vetor? ");
        num = leitura.nextInt();

        // int retorno = pesquisaSequencial(vetor, num);
        // int retorno = pesquisaBinariaIterativa(vetor, num, inicio, fim);
        int retorno = pesquisaBinariaRecursiva(vetor, num, inicio, fim);

        if (retorno == -1)
            System.out.println("Número não encontrado.");
        else
            System.out.println("Número encontrado na posição: " + retorno);

        leitura.close();

    }

    // Pesquisa Sequencial
    public static int pesquisaSequencial (int vetor[], int num) {
        int i;
        for (i=0; i< vetor.length; i++) {
            if (vetor[i] == num)
               return i;
        }
        return -1;
    }

    // Pesquisa binária usando uma estrutura de repetição
    public static int pesquisaBinariaIterativa (int vetor[], int num, int inicio, int fim) {
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (num == vetor[meio])
                return meio;
            else
                if (num > vetor[meio])
                    inicio = meio + 1;
                else
                    fim = meio - 1;
        }
        return -1;
    }

    // Pesquisa binária usando recursividade
    public static int pesquisaBinariaRecursiva (int vetor[], int num, int inicio, int fim) {
        int meio;
        if (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (num == vetor[meio])
                return meio;
            else
                if (num > vetor[meio])
                    return pesquisaBinariaRecursiva(vetor, num, meio + 1, fim);
                else
                    return pesquisaBinariaRecursiva(vetor, num, inicio, meio - 1);
        }
        return -1;    
    }
}