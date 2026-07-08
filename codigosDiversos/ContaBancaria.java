package codigosDiversos;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public ContaBancaria(String titular) {
        this(titular, 0.0); 
    }
}