package contaBancaria;

public class Correntista {

    private String nome;
    private String endereco;
    private ContaBancaria cBancaria;

    public Correntista() {
    }

    public Correntista (String nome, String endereco) {
        this.nome = nome;
        this.endereco =  endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ContaBancaria getNumero() {
        return cBancaria;
    }

    public void setNumero(ContaBancaria cBancaria) {
        this.cBancaria = cBancaria;
    }
}