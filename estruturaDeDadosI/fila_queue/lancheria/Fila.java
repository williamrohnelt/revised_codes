package estruturaDeDadosI.fila_queue.lancheria;

public class Fila {

    private int inicio;
    private int fim;
    private Aluno fila[];

    public Fila(int tamanho) {
        this.inicio = 0;
        this.fim = 0;
        this.fila = new Aluno[tamanho];
    }

    public Aluno[] getFila() {
        return this.fila;
    }

    public void setFila(Aluno[] fila) {
        this.fila = fila;
    }

    public int getInicio() {
        return this.inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return this.fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    // adicionar o novo Aluno no final da fila
    public boolean enfileirar(int matricula, String nome) {
        // verifica se a fila está cheia
        if (!this.filaCheia()) {
            Aluno novo = new Aluno(matricula, nome);
            this.fila[this.fim] = novo;
            this.fim++;
            return true;
        } else {
            return false;
        }
    }

    // remover o Aluno do início da fila
    public Aluno desenfileirar() {
        // verifica se a fila tem pelo menos um elemento, fim representa quantos alunos estão na fila
        // se for 0, está vazia e retorna null
        if (this.fim > 0) {
            // cria um novo objeto Aluno com os mesmos dados
            // usa o segundo construtor da classe Aluno
            Aluno alunoRemovido = new Aluno(this.fila[this.inicio]);
            // o fim-1 no limite do for garante que não tenta acessar fila[fim],
            // que está fora dos elementos válidos
            for (int i = 0; i < this.fim-1; i++) {
                this.fila[i] = this.fila[i+1];
            }
            this.fim--;
            return alunoRemovido;
        } else {
            return null;
        }
    }

    // verificar se a fila está vazia
    public boolean filaVazia() {
        if (this.inicio == 0 && this.fim == 0) {
            return true;
        } else {
            return false;
        }
    }

    // verificar se a fila está cheia
    public boolean filaCheia() {
        if (this.fim >= this.fila.length) {
            return true;
        } else {
            return false;
        }
    }

    // imprimir os dados de todos os Alunos
    public void imprimirFila() {
        for (int i = this.inicio; i < this.fim; i++) {
            System.out.print(this.fila[i].getMatricula() + ":" + this.fila[i].getNome() + " -> ");
        }
    }
}