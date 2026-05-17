package codigosDiversos;

public class Aluno {

    // atributos
    private String nome;
    private double media;

    //construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno() {
    }

    //exibir estado
    public void exibeEstado() {
        System.out.println("Média do aluno " + nome + " é " + media);
    }

    public static void main(String args[]) {

        Aluno a = new Aluno();
        a.exibeEstado();
        Aluno a1;
        a1 = new Aluno("William");
        a1.exibeEstado();
    }
}