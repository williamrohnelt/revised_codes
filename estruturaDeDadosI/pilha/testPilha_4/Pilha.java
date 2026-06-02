package estruturaDeDadosI.pilha.testPilha_4;

public class Pilha {

    private int topo;
    private int pilha[];

    public Pilha(int tamanho) {
        this.topo = 0;
        this.pilha = new int[tamanho];
    }

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

    // Adiciona o novo nodo no topo da pilha.
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
        if (this.getTopo() > 0)
            return this.pilha[this.getTopo()-1];
        else
            return -1;
    }

    // Imprime os valores da pilha
    public void imprimirPilha() {
        for (int i = 0; i < topo; i++) {
            System.out.println(pilha[i]);
        }
    }

    // Verificar se a pilha está vazia
    public boolean pilhaVazia() {
        if (this.getTopo() == 0)
            return true;
        else
            return false;
    }
}