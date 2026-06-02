package estruturaDeDadosI.pilha;

public class Pilha {

    // atributes
    private int topo;
    private int pilha[];

    public Pilha() {
    }

    // constructor method
    public Pilha(int tamanho) {
        this.topo = 0;
        this.pilha = new int[tamanho];
    }

    // getters and setters
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
        this.topo = topo;
    }

    // Adicionar o novo nodo no topo da pilha.
    public boolean push(int numero) {
        // Verificar tamanho da pilha
        if (this.getTopo() < this.pilha.length) {
            int novo = numero;
            this.pilha[this.getTopo()] = novo;
            this.topo++;
            return true;
        } else {
            return false;
        }
    }

    // Remover o nodo do topo da pilha.
    public int pop() {
        // Verificar tamanho da pilha
        if (!this.pilhaVazia()) {
            int nodoTopo = this.pilha[this.topo-1];
            this.setTopo(this.getTopo()-1);
            return nodoTopo;
        } else {
            return -1;
        }
    }

    // Buscar o nodo do topo da pilha
    public int buscarTopo() {
        if (this.getTopo() > 0) {
            return this.pilha[this.getTopo()-1];
        } else {
            return -1;
        }
    }

    // Verificar se a pilha está vazia
    public boolean pilhaVazia() {
        if (this.getTopo() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Imprimir os dados de todos os nodos
    public void imprimirPilha() {
        for (int i = this.getTopo()-1; i >= 0; i--) {
            System.out.print(this.pilha[i] + " -> ");
        }
    }
}