package estruturaDeDadosI.ListaDuplamenteEncadeada;

public class App {
    public static void main(String[] args) {

        // criando uma lista duplamente encadeada
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // adicionando Alunos no início da lista
        lista.adicionarNoInicio(5, "John");
        lista.adicionarNoInicio(10, "Paul");
        lista.adicionarNoInicio(15, "George");

        // adicionando Alunos no final da lista
        lista.adicionarNoFinal(20, "Ringo");
        lista.adicionarNoFinal(25, "Pete");

        // imprimir a lista
        lista.imprimirListaInicioAoFim();
        //lista.imprimirListaFimAoInicio();

        // remover o primeiro Aluno da lista
        //lista.removerPrimeiroAluno();

        // imprimir a lista
        //lista.imprimirListaInicioAoFim();

        // buscar um Aluno específico
        Aluno Aluno = lista.buscarAluno(20);
        if (Aluno != null) {
            System.out.println("Aluno: " + Aluno.getMatricula() + ": " + Aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        // remover um Aluno específico
        lista.removerAluno(15);

        lista.imprimirListaInicioAoFim();

        // remover um Aluno específico
        lista.removerAluno(25);

        lista.imprimirListaInicioAoFim();

        // removendo todos os Alunos
        lista.removerTodosAlunos();

        lista.imprimirListaInicioAoFim();
    }
}