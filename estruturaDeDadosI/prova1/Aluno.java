package estruturaDeDadosI.prova1;

public class Aluno {

    // atributes
    private int matricula;
    private String nome;

    // variável chamada proximo, tipo Aluno, é do tipo dessa classe Aluno
    // aponta para um outro objeto do tipo Aluno
    private Aluno proximo;

    // constructor method
    public Aluno () {
    }

    public Aluno (int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.proximo = null;
    }

    // getters and setters methods
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Aluno getProximo() {
        return this.proximo;
    }
    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }
}