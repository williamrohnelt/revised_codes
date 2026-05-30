package estruturaDeDadosI.prova2.questao8;

public class Nodo {

    // atributos
    private int valor;
    private Nodo proximo;

    // constructor method

    public Nodo () {
    }

    public Nodo (int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return this.proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}