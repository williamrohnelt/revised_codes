package estruturaDeDadosI.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {

    // atributes
    private Aluno cabeca;
    private Aluno cauda;
    private int tamanho;

    // constructor method
    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda  = null;
        this.tamanho = 0;
    }

    // getters and setters
    public Aluno getCabeca() {
        return this.cabeca;
    }

    public void setCabeca(Aluno cabeca) {
        this.cabeca = cabeca;
    }

    public Aluno getCauda() {
        return this.cauda;
    }

    public void setCauda(Aluno cauda) {
        this.cauda = cauda;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // adicionar o novo Aluno no início da lista
    public void adicionarNoInicio(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        // se getCabeca é null, lista está vazia
        if (this.getCabeca() == null) {
            // o objeto Aluno criado é a cauda da lista
            this.setCauda(novo);
        } else {
            // pega o cabeça e adiciona o seu anteria o novo Aluno criado
            this.getCabeca().setAnterior(novo);
        }
        // proximo do novo Aluno aponta para o que era a cabeça (ou null se lista vazia)
        novo.setProximo(this.getCabeca());
        // anterior do novo é null, afinal, ele será o primeiro, não tem ninguém antes
        novo.setAnterior(null);
        // atualiza a cabeça, a referência cabeca da lista agora aponta para o novo Aluno
        // se é o primeiro objeto, o novo Aluno é o único elemento, ele é tanto cabeca quanto cauda
        this.setCabeca(novo);
        this.setTamanho(this.getTamanho() + 1);
    }

    // adicionar o novo Aluno no final da lista.
    public void adicionarNoFinal(int matricula, String nome) {
        Aluno novo = new Aluno(matricula, nome);
        // se getCauda é null, lista está vazia
        if (this.getCauda() == null) {
            this.setCabeca(novo);
        } else {
            this.getCauda().setProximo(novo);
        }
        novo.setAnterior(this.getCauda());
        novo.setProximo(null);
        this.setCauda(novo);
        this.setTamanho(this.getTamanho() + 1);
    }

    // remover o primeiro Aluno
    public void removerPrimeiroAluno() {
        if (this.getCabeca() != null) {
            Aluno AlunoAux = this.getCabeca();
            this.setCabeca(AlunoAux.getProximo());
            this.getCabeca().setAnterior(null);
            this.setTamanho(this.getTamanho() - 1);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    // remover o Aluno do final
    public void removerUltimoAluno() {
        if (this.getCauda() != null) {
            Aluno AlunoAux = this.getCauda();
            this.setCauda(AlunoAux.getAnterior());
            this.getCauda().setProximo(null);
            this.setTamanho(this.getTamanho() - 1);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    // buscar um Aluno na lista pela matricula
    public Aluno buscarAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula) {
            AlunoAux = AlunoAux.getProximo();
        }
        return AlunoAux;
    }

    // remover um Aluno na lista, buscando pelo matricula
    public void removerAluno(int matricula) {
        Aluno AlunoAux = this.getCabeca();
        Aluno AlunoAuxAnterior = null;
        while (AlunoAux != null && AlunoAux.getMatricula() != matricula) {
            AlunoAuxAnterior = AlunoAux;
            AlunoAux = AlunoAux.getProximo();
        }
        // AlunoAuxAnterior == null, significa que o Aluno a ser removido é o primeiro da lista
        if (AlunoAuxAnterior == null) {
            this.setCabeca(AlunoAux.getProximo());
            this.getCabeca().setAnterior(null);
            AlunoAux.setProximo(null);
            this.setTamanho(this.getTamanho() - 1);
            return;
        }
        // verifica se o aluno foi encontrado no meio ou final da lista, se o while chegou ao fim
        // sem achar a matrícula, AlunoAux será null e o bloco é ignorado, evitando um NullPointerException
        if (AlunoAux != null) {
            AlunoAuxAnterior.setProximo(AlunoAux.getProximo());
            if (AlunoAux.getProximo() != null)
                AlunoAux.getProximo().setAnterior(AlunoAuxAnterior);
            AlunoAux.setAnterior(null);
            AlunoAux.setProximo(null);
            this.setTamanho(this.getTamanho() - 1);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    // Remover todos os Alunos da lista
    public void removerTodosAlunos() {
        this.setCabeca(null);
        this.setCauda(null);
        this.setTamanho(0);
    }

    // imprimir as matriculas e nomes de todos os Alunos do início para o fim
    public void imprimirListaInicioAoFim() {
        Aluno AlunoAux = this.getCabeca();
        System.out.print(" NULL ");
        while (AlunoAux != null) {
            System.out.print(" <- " + AlunoAux.getMatricula() + ": " + AlunoAux.getNome() + " -> ");
            AlunoAux = AlunoAux.getProximo();
        }
        System.out.print(" NULL ");
        System.out.println();
    }

    // imprimir as matriculas e nomes de todos os Alunos do fim para o início
    public void imprimirListaFimAoInicio() {
        Aluno AlunoAux = this.getCauda();
        System.out.print(" NULL ");
        while (AlunoAux != null) {
            System.out.print(" <- " + AlunoAux.getMatricula() + ": " + AlunoAux.getNome() + " -> ");
            AlunoAux = AlunoAux.getAnterior();
        }
        System.out.print(" NULL ");
        System.out.println();
    }
}