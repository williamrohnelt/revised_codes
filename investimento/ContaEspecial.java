package investimento;

// extends significa que a classe ContaEspecial herda tudo que a classe Conta tem, atributos e métodos
public class ContaEspecial extends Conta {

    // atributos
    private double limite;

    // método construtor
    public ContaEspecial(int codigo, double limite) {
        super(codigo);
        this.limite = limite; 
    }

    public double getLimite() {
        return limite;
    }

    public void exibeLimite() {
        System.out.println("Seu limite é: " + getLimite());
    }

    public void exibeTipo() {
        System.out.println("Conta Especial: " + getCodigo());
    }
}