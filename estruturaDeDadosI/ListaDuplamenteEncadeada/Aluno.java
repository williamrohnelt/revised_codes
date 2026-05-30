package estruturaDeDadosI.ListaDuplamenteEncadeada;

public class Aluno {

    // atributes
    private int matricula;
    private String nome;
    private Aluno proximo;
    private Aluno anterior;

    // constructor methods
    public Aluno() {
    }

    public Aluno (int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.proximo = null;
        this.anterior = null;
    }

    // getters and setters
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

    public Aluno getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Aluno anterior) {
        this.anterior = anterior;
    }
}