package estruturaDeDadosI.pilha_stack.baralho;

public class Pilha {

    private int topo;
    private Carta pilha[];

    public Pilha(int tamanho) {
        this.topo = 0;
        this.pilha = new Carta[tamanho];
    }

    public Carta[] getPilha() {
        return this.pilha;
    }

    public void setPilha(Carta[] pilha) {
        this.pilha = pilha;
    }

    public int getTopo() {
        return this.topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    // adicionar o novo nodo no topo da pilha
    public boolean push(int numero, String naipe) {
        // verifica se a pilha está cheia
        if (this.getTopo() < this.pilha.length) {
            Carta novo = new Carta(numero, naipe);
            this.pilha[this.getTopo()] = novo;
            this.topo++;
            return true;
        } else {
            return false;
        }
    }

    // remover o nodo do topo da pilha
    public Carta pop() {
        // verifica se a pilha tem objetos (se não está vazia)
        if (this.getTopo() != 0) {
            Carta nodo = new Carta(this.pilha[this.topo-1]);
            this.setTopo(this.getTopo()-1);
            return nodo;
        } else {
            return null;
        }
    }

    // imprimir os dados de todos os nodos
    public void imprimirPilha() {
        for (int i = this.getTopo()-1; i >= 0; i--) {
            System.out.print(this.pilha[i].getNumero() + ":" + this.pilha[i].getNaipe() + " -> ");
        }
    }
}