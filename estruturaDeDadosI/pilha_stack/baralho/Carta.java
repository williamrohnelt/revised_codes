package estruturaDeDadosI.pilha_stack.baralho;

public class Carta {

    private int numero;
    private String naipe;

    public Carta (int numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public Carta (Carta nodo) {
        this.numero = nodo.getNumero();
        this.naipe = nodo.getNaipe();
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return this.naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}