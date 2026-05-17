package contaPoupanca2;

// extends significa que a classe ContaPoupanca herda tudo que a classe Conta tem, atributos e métodos
public class ContaPoupanca extends Conta {

    // atributo
    private int diaAbertura;

    // método construtor
    //                       argumento     argumento
    //                          /\            /\
    //                          |             |
    public ContaPoupanca(int codigo, int diaAbertura) {
        // super(codigo), chamando o construtor da classe pai (Conta)
        // como ContaPoupanca herda codigo da classe Conta, ele não pode inicializar esses atributos diretamente
        // eles são private em Conta. O super() delega essa inicialização para o construtor da classe pai
        super(codigo);
        this.diaAbertura = diaAbertura;
    }

    // métodos
    public int getDiaAbertura() {
        return diaAbertura;
    }

    // método getCodigo() está sendo herdado da classe Conta
    public void exibeTipo() {
        System.out.println("Conta Poupança: " + getCodigo());
    }
}