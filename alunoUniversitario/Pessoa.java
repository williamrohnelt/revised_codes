package codigos_revisados.alunoUniversitario;

public class Pessoa {

    // atributos
    private String nome;
    private int idade;

    // método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade =  idade;
    }

    // métodos setters and getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}