package codigos_revisados.contaBancaria;

public class ContaBancaria {

    // atributos
    private int numero;
    private double saldo;
    private Correntista correntista;

    // construtor
    public ContaBancaria() {
    }

    // métodos
    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public ContaBancaria(int numero, double saldo, Correntista correntista) {
        this.numero = numero;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente... ");
        } else {
            saldo = saldo - valor;
        }
    }

    public void transferir(double valor, ContaBancaria contaBancaria) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente...");
        } else {
                saldo = saldo - valor;
                contaBancaria.depositar(valor);
        }
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    // operação de extrato
    public void extrato() {
        // System.out.println(correntista.getNome() + " seu saldo é R$ " + saldo);
        System.out.printf("%s seu saldo é R$ %.2f%n", correntista.getNome(), saldo);
    }
}