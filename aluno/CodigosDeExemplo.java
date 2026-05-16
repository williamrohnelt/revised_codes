package codigos_revisados.aluno;

public class CodigosDeExemplo {
    public static void main(String args[]) {

        int vetor[] = new int[20];      // declaração de um array de inteiros chamado vetor de tamanho 20 e alocação na memória
        System.out.println(vetor[0]);   // impressão na tela do primeiro elemento do vetor
        System.out.println(vetor[5]);   // impressão na tela do sexto elemento do vetor

        String personagens[] = new String[5];           // declaração de um array de strings chamado personagens de tamanho 5 e alocação na memória
        float medias[] = new float[15];                 // declaração de um array do tipo float chamado medias de tamanho 15 e alocação na memória
        boolean convitesComprados[] = new boolean[10];  // declaração de um array do tipo boolean chamado convitesComprados de tamanho 10
        System.out.println(personagens[2]);             // impressão do valor do índice 2 do array personagens
        System.out.println(medias[2]);                  // impressão do valor do índice 2 do array medias
        System.out.println(convitesComprados[2]);       // impressão do valor do índice 2 do array convitesComprados

        String beatles[] = new String[4];
        beatles[0] = "John";
        beatles[1] = "Paul";
        beatles[2] = "George";
        beatles[3] = "Ringo";
        System.out.println(beatles[1]);
        System.out.println(beatles[4]);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        // matriz[4][3]:

        //           col 0  col 1   col 2
        // linha 0:  [  0]  [  5]   [ 10]
        // linha 1:  [ 15]  [ 20]   [ 25]
        // linha 2:  [ 30]  [ 35]   [ 40]
        // linha 3:  [ 45]  [ 50]   [ 55]
        int matriz[][] = new int[4][3];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = 3 * l * 5 + 5 * c;
            }
        }

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++)
                System.out.print(matriz[l][c] + "\t");
            System.out.println();
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++)
                System.out.print(matriz[l][c] + "\t");
            System.out.println();
        }

        Aluno alunos[] = new Aluno[4];
        alunos[0] = new Aluno(1, "John");
        alunos[1] = new Aluno(2, "Paul");
        alunos[2] = new Aluno(3, "George");
        alunos[3] = new Aluno(4, "Ringo");

        for (int i=0; i<alunos.length; i++) {
            System.out.println(alunos[i].getMatricula() + ": " + alunos[i].getNome());
        }
    }
}