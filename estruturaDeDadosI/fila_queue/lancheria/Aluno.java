package estruturaDeDadosI.fila_queue.lancheria;

public class Aluno {

    private int matricula;
    private String nome;

    public Aluno (int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno (Aluno aluno) {
        this.matricula = aluno.getMatricula();
        this.nome = aluno.getNome();
    }

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