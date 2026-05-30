package estruturaDeDadosI.prova2.questao2;

public class Q2 {
    public static void main (String[] args) {

        // array do tipo Aluno chamado alunos
        // definido em código (hardcorded) tamanho 4, array vazio
        Aluno alunos[] = new Aluno[4];

        // adiciona 4 objetos Aluno dentro do array alunos, informando o índice
        alunos[0] = new Aluno(1, "Ana");
        alunos[1] = new Aluno(2, "Pedro");
        alunos[2] = new Aluno(3, "Maria");
        alunos[3] = new Aluno(4, "Joao");

        // variável int chamada i, recebe 1 como valor
        int i = 1;

        // loop for-each, cada objeto Aluno do array alunos é referenciado na variável alunoTemp e entra no if
        // alunoTemp é uma variável temporária que aponta para cada objeto
        // 1° loop alunoTemp aponta para [0] → Aluno(1, "Ana")...
        // os objetos permanecem no array, a variável aluno apenas aponta para cada um temporariamente a cada volta
        for (Aluno alunoTemp : alunos) {
            // pós-incremento, usa o valor atual de i, depois incrementa
            // compara com 1, depois i vira 2, e depois 3
            if (i++ > 2) {
                System.out.print(alunoTemp.getMatricula() + ": " + alunoTemp.getNome() + " - ");
            }
        }
    }
}