package codigos_revisados.estruturaDeDadosI.prova1;

public class ListaSimplesmenteEncadeada {

    // atributes
    private Aluno cabeca;

    // constructor method
    public ListaSimplesmenteEncadeada() {
    }

    public ListaSimplesmenteEncadeada(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    // getters and setters methods
    public Aluno getCabeca() {
        return this.cabeca;
    }

    public void setCabeca(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    // método que adiciona novo objeto Aluno no início da lista
    public void adicionarNoInicio(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        novo.setProximo(this.getCabeca());
        this.setCabeca(novo);
    }

    // método que adiciona o novo Aluno no final da lista
    public void adicionarNoFinal(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        if (this.getCabeca() == null) {
            this.setCabeca(novo);
        } else {
            Aluno AlunoAux = this.getCabeca();
            while (AlunoAux.getProximo() != null)
                AlunoAux = AlunoAux.getProximo();
            AlunoAux.setProximo(novo);
        }
    }

    // remover o primeiro Aluno
    public void removerPrimeiroAluno() {
        if (this.getCabeca() != null) {
            Aluno AlunoAux = this.getCabeca();
            this.setCabeca(AlunoAux.getProximo());
        }
    }

    // buscar um Aluno na lista pelo matricula e retornar o objeto Aluno
    public Aluno buscarAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula)
            AlunoAux = AlunoAux.getProximo();
        return AlunoAux;
    }

    // remover um Aluno na lista, buscando
    public void removerAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;

        // varredura para descobrir qual nodo deve ser excluído
        // o objeto AlunoAux apontará para o nodo a ser avaliado, a cada iteração
        // o objeto AlunoAuxAnterior sempre apontará para o nodo anterior ao AlunoAux
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula) {
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }

        // caso o nodo a ser excluído seja o primeiro da lista, é necessário ajustar o cabeça dela
        if (AlunoAuxAnterior == null) {
            this.setCabeca(AlunoAux.getProximo());
            return;
        }

        // caso o nodo a ser excluído seja qualquer um diferente do primeiro da lista
        if (AlunoAux != null) {
            AlunoAuxAnterior.setProximo(AlunoAux.getProximo());
        }
    }

    // remover todos os Alunos da lista
    public void removerTodosAlunos() {
        this.setCabeca(null);
    }

    // imprimir os dados de todos os Alunos
    public void imprimirLista() {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null) {
            System.out.print(AlunoAux.getMatricula() + ": " + AlunoAux.getNome() + " -> ");
            AlunoAux = AlunoAux.getProximo();
        }
        System.out.print(" NULL ");
        System.out.println();
    }

    boolean verificarListasIguais(ListaSimplesmenteEncadeada lista) {
        Aluno AlunoAux1 = this.getCabeca();
        Aluno AlunoAux2 = lista.getCabeca();

        if ((AlunoAux1 == null && AlunoAux2 != null) || (AlunoAux1 != null && AlunoAux2 == null)) {
            return false;
        } else {
            while (AlunoAux1 != null) {
                if (AlunoAux1.getMatricula() != AlunoAux2.getMatricula())
                    return false;
                AlunoAux1 = AlunoAux1.getProximo();
                AlunoAux2 = AlunoAux2.getProximo();
            }
            if (AlunoAux1 == null && AlunoAux2 != null)
                return false;
        }
        return true;
    }
}