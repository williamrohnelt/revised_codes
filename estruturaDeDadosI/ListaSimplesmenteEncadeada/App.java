package estruturaDeDadosI.ListaSimplesmenteEncadeada;

public class App {

    public static void main(String[] args) {

        // Criando uma lista
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada(null);

        // Adicionando nodos no início da lista
        lista.adicionarNoInicio(5, "John");
        lista.adicionarNoInicio(10, "Paul");
        lista.adicionarNoInicio(15, "George");

        // Adicionando nodos no final da lista
        lista.adicionarNoFinal(20,"Ringo");
        lista.adicionarNoFinal(25, "Pete");

        // Imprimindo a lista
        lista.imprimirLista();

        // Removendo o primeiro nodo da lista
        lista.removerPrimeiroAluno();
        lista.imprimirLista();

        ListaSimplesmenteEncadeada lista_1 = new ListaSimplesmenteEncadeada(null);
        lista_1.adicionarNoInicio(15, "George");
        lista_1.adicionarNoInicio(25, "Pete");

        ListaSimplesmenteEncadeada lista_2 = new ListaSimplesmenteEncadeada(null);
        lista_2.adicionarNoInicio(15, "George");
        lista_2.adicionarNoInicio(25, "Pete");

        boolean ListasIguaisOuNao = lista_1.verificarListasIguais(lista_2);
        System.out.println(ListasIguaisOuNao);

        // Buscar um nodo específico
        Aluno nodoEncontrado = lista.buscarAluno(20);
        if (nodoEncontrado != null) {
            System.out.println("Nodo: " + nodoEncontrado.getMatricula() + ": " + nodoEncontrado.getNome());
        } else {
            System.out.println("Nodo não encontrado.");
        }

        // Remover um nodo específico
        lista.removerAluno(10);
        lista.imprimirLista();

        // Removendo todos os nodos
        lista.removerTodosAlunos();
        lista.imprimirLista();
    }
}