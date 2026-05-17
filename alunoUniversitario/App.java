package alunoUniversitario;

public class App {
    public static void main(String args[]) {

        Aluno aluno1 = new Aluno("201002", "William", 33);
        Pessoa pessoa1 = new Pessoa("William Rohnelt", 33);
        AlunoUniversitario alunoUni1 = new AlunoUniversitario("tecnologo", "0135051", "Bruna", 31);

        System.out.println(aluno1.getNome());
        System.out.println(pessoa1.getNome());
        System.out.println(alunoUni1.getNome());
    }
}