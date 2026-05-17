package contaPoupanca2;

public class Conta {

    // atributos
    private double saldo;
    private int codigo;

    // método construtor
    // em Java todo atributo double é automaticamente inicializado com 0.0 quando o objeto é criado
    //               argumento
    //                  /\
    //                  |
    public Conta(int codigo) {
        this.codigo = codigo;
    }

    // métodos getters
    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    // métodos
    void exibeTipo() {
        System.out.println("Conta: " + getCodigo());
    }
}