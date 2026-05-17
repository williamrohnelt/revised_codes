package contaPoupanca2;

// extends significa que a classe ContaEspecial herda tudo que a classe Conta tem, atributos e métodos
public class ContaEspecial extends Conta {

    // atributos
    private double limite;

    // método construtor
    //                       argumento      argumento
    //                          /\             /\
    //                          |              |
    public ContaEspecial(int codigo, double limite) {
        // super(codigo), chamando o construtor da classe pai (Conta)
        // como ContaEspecial herda codigo da classe Conta, ele não pode inicializar esses atributos diretamente
        // eles são private em Conta. O super() delega essa inicialização para o construtor da classe pai
        super(codigo);
        this.limite = limite;
    }

    // método get
    public double getLimite() {
        return limite;
    }

    // método
    public void exibeTipo() {
        System.out.println("Conta Especial: " + getCodigo());
    }
}