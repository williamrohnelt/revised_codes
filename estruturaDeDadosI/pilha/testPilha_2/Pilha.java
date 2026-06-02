package estruturaDeDadosI.pilha.testPilha_2;

public class Pilha { // Classe Pilha

    // Atributos
    // Private significa que só podem ser utilizados dentro desta classe e não fora.

    // 1° atributo é denominado topo de valor inteiro responsável por armazenar a posição do topo atual da pilha, ou seja, a posição do topo no vetor pilha.
    private int topo;

    // 2° atributo, um vetor denominado pilha para armazenamento das informações a serem empilhadas, esse vetor armazena inteiros.
    private int pilha[];

    // O atributo topo indica a posição do vetor pilha que receberá a próxima informação. Se topo é igual a -1, a pilha está vazia. Se topo é igual a tamanho máximo da pilha, a pilha está cheia.

    // Método Construtor
    
    // Este método é chamado quando você cria um objeto da classe (ex: Pilha nomeDaPilha = new Pilha(5);). Ele inicializa o topo em -1 (pilha vazia). Ele define o tamanho máximo da pilha, criando o array com a capacidade passada por parâmetro.
    public Pilha(int tamanho) {
        this.topo = -1;
        this.pilha = new int[tamanho];
    }

    // Métodos de Comportamento

    // Verifica se a pilha está vazia.
    public boolean isEmpty() {
        return (this.topo == -1);
    }

    // Verifica se a pilha está cheia.
    public boolean isFull() {
        return (this.topo == this.pilha.length - 1);
    }

    // Insere um elemento no topo (Push).
    public void push(int elemento) {
        if (!isFull()) {
            this.topo++;
            this.pilha[this.topo] = elemento;
            // System.out.println("Inserido: " + elemento);
        } else {
            System.out.println("Erro: A pilha está cheia!");
        }
    }

    // Remove e retorna o elemento do topo (Pop).
    public int pop() {
        if (!isEmpty()) {
            int valorRetornado = this.pilha[this.topo];
            this.topo--;
            return valorRetornado;
        } else {
            System.out.println("Erro: A pilha está vazia!");
            return -1; // Valor de erro
        }
    }

    // Apenas olha o que está no topo sem remover (Peek).
    public int peek() {
        if (!isEmpty()) {
            return this.pilha[this.topo];
        }
        return -1;
    }

    // Getters e Setters

    public int[] getPilha() {
        return this.pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }

    public int getTopo() {
        return this.topo;
    }

    public void setTopo(int topo) {
        if (topo < -1 || topo >= this.pilha.length) {
            System.out.println("Erro: Posição de topo inválida!");
        } else {
            this.topo = topo;
        }
    }
}