package estruturaDeDadosI.ListaSimplesmenteEncadeada;

public class ListaSimplesmenteEncadeada {

    // atributes
    private Aluno cabeca;

    // constructor method
    public ListaSimplesmenteEncadeada() {
    }

    public ListaSimplesmenteEncadeada(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    // methods
    public boolean verificarListasIguais(ListaSimplesmenteEncadeada lista) {
        // variables
        Aluno nodoListaExistente = this.getCabeca();
        Aluno nodoListaNova = lista.getCabeca();

        while (nodoListaExistente != null && nodoListaNova != null) {
            if (nodoListaExistente.getMatricula() != nodoListaNova.getMatricula()) {
                return false;
            }
            nodoListaExistente = nodoListaExistente.getProximo();
            nodoListaNova = nodoListaNova.getProximo();
        }
        return nodoListaExistente == null && nodoListaNova == null;
    }

    public Aluno getCabeca() {
        return this.cabeca;
    }

    public void setCabeca(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    // Adicionar o novo Aluno no início da lista.
    public void adicionarNoInicio(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        novo.setProximo(this.getCabeca());
        this.setCabeca(novo);
    }

    // Adicionar o novo Aluno no final da lista.
    public void adicionarNoFinal(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        if (this.getCabeca() == null)
            this.setCabeca(novo);
        else {
            Aluno AlunoAux = this.getCabeca();
            while (AlunoAux.getProximo() != null)
                AlunoAux = AlunoAux.getProximo();
            AlunoAux.setProximo(novo);
        }
    }

    // Remover o primeiro Aluno
    public void removerPrimeiroAluno() {
        if (this.getCabeca() != null) {
            Aluno AlunoAux = this.getCabeca();
            this.setCabeca(AlunoAux.getProximo());
        }
    }

    // Buscar um Aluno na lista pelo matricula e retornar o local do Aluno
    public Aluno buscarAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula)
            AlunoAux = AlunoAux.getProximo();
        return AlunoAux;
    }

    // Remover um Aluno na lista, buscando
    public void removerAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;
        /* Varredura para descobrir qual nodo deve ser excluído
           O objeto AlunoAux apontará para o nodo a ser avaliado, a cada iteração
           O objeto AlunoAuxAnterior sempre apontará para o nodo anterior ao AlunoAux
        */
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula) {
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }
        // Caso o nodo a ser excluído seja o primeiro da lista, é necessário ajustar o cabeça dela
        if (AlunoAuxAnterior == null) {
            this.setCabeca(AlunoAux.getProximo());
            return;
        }
        // Caso o nodo a ser excluído seja qualquer um diferente do primeiro da lista
        if (AlunoAux != null)
            AlunoAuxAnterior.setProximo(AlunoAux.getProximo());
    }

    // Remover todos os Alunos da lista
    public void removerTodosAlunos() {
        this.setCabeca(null);
    }

    // Imprimir os dados de todos os Alunos
    public void imprimirLista() {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null) {
            System.out.print(AlunoAux.getMatricula() + ": " + AlunoAux.getNome() + " -> ");
            AlunoAux = AlunoAux.getProximo();
        }
        System.out.print("NULL");
        System.out.println();
    }

}

// 1234: NomeAluno -> NULL