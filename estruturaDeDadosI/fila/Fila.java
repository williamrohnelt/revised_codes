package estruturaDeDadosI.fila;

public class Fila {

    private int inicio;
    private int fim;
    private int fila[];

    // construtor, inicializa a fila com o tamanho informado
    public Fila(int tamanho) {
        this.inicio = 0; // índice do primeiro elemento na fila
        this.fim = 0;  // índice do próximo espaço livre
        this.fila = new int[tamanho]; // cria o array com o tamanho definido
    }

    // métodos getters and setters
    public int[] getFila() {
        return this.fila;
    }

    public void setFila(int[] fila) {
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

    // adicionar o novo nodo no final da fila
    public boolean enfileirar(int valor) {
        // verificar o tamanho da fila
        if (this.inicio >= 0 && !this.filaCheia()) {
            int novo = valor;
            this.fila[this.fim] = novo;
            this.fim++;
            return true;
        } else {
            return false;
        }
    }

    // remover o nodo do início da fila, usando a estratégia mais simples
    public int desenfileirar() {
        // verificar o tamanho da fila
        if (this.fim > 0) {
            int valorRemovido = this.fila[this.inicio];
            for (int i = 0; i < this.fim - 1; i++) {
                this.fila[i] = this.fila[i+1];
            }
            this.fim--;
            return valorRemovido;
        } else {
            return -1;
        }
    }

    // verifica se a fila está vazia
    public boolean filaVazia() {
        if (this.inicio == 0 && this.fim == 0) {
            return true;
        } else {
            return false;
        }
    }

    // verificar sea fila está cheia
    public boolean filaCheia() {
        if (this.fim >= this.fila.length) {
            return true;
        } else {
            return false;
        }
    }

    // imprimir os dados de todos os nodos
    public void imprimirFila() {
        for (int i = this.inicio; i < this.fim; i++) {
            System.out.print(this.fila[i] + " -> ");
        }
    }
}