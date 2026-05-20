package estruturaDeDadosI.prova2.questao2;

public class Aluno {

    // atributes
    private int matricula;
    private String nome;

    // constructor method
    public Aluno () {
    }

    public Aluno (int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // getters and settes
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
}