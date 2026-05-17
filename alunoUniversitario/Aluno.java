package alunoUniversitario;

// classe chamada Aluno, public (pode ser acessada através de outras classes)
// extends significa que Aluno herda tudo que a classe Pessoa tem, atributos e métodos
public class Aluno extends Pessoa {

    // atributos

    // atributo private (somente diretamente acessado nesta classe) tipo String, nome matricula
    private String matricula;

    // método construtor
    // recebe como argumento um valor String para matricula, um valor String para o nome e um valor int para idade
    public Aluno(String matricula, String nome, int idade) {

        // super(nome, idade), chamando o construtor da classe pai
        // como Aluno herda nome e idade de Pessoa, ele não pode inicializar esses atributos diretamente
        // eles são private em Pessoa. O super() delega essa inicialização para o construtor da classe pai
        super(nome, idade);

        // o valor String passado para matricula é definido na variável matricula desta classe
        this.matricula = matricula;
    }

    // métodos getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}