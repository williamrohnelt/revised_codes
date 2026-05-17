package aluno;

public class Aluno {

    // duas variáveis, matricula int e nome String
    private int matricula;
    private String nome;

    // método Aluno que recebe os argumentos matricula e nome
    public Aluno (int matricula, String nome) {

        // o valor passado para o argumento matricula é definido na variável matricula da classe Aluno
        this.matricula = matricula;

        // o valor passado para o argumento nome é definido na variável nome da classe Aluno
        this.nome = nome;
    }

    // métodos getters and setters

    // ao chamar o método getMatricula, temos o retorno do valor da variável matricula
    public int getMatricula() {
        return this.matricula;
    }

    // ao chamar o método setMatricula, passamos um valor int como argumento, esse valor é definido na variável matricula
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // ao chamar o método getNome, temos o retorno do valor da variável nome
    public String getNome() {
        return this.nome;
    }

    // ao chamar o método setNome, passamos um valor String como argumento, esse valor é definido na variável nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}