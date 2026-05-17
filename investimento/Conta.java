package investimento;

public abstract class Conta {

    // atributos
    private double saldo;
    private int codigo;

    // método construtor
    public Conta(int codigo) {
        this.saldo = 0;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibeTipo() {
        System.out.println("Conta: " + getCodigo());
    }
}