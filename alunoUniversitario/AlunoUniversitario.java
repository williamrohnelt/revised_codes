package codigos_revisados.alunoUniversitario;

// extends significa que a classe AlunoUniversitario herda tudo que a classe Aluno tem, atributos e métodos
public class AlunoUniversitario extends Aluno {

    // atributos
    // bacharel ou tecnologo
    private String tipo;

    // método construtor
    public AlunoUniversitario(String tipo, String matricula, String nome, int idade) {
        // super(matricula, nome, idade), chamando o construtor da classe pai (Aluno)
        // como AlunoUniversitario herda codigo da classe Aluno, ele não pode inicializar esses atributos diretamente
        // eles são private em Aluno. O super() delega essa inicialização para o construtor da classe pai
        super(matricula, nome, idade);
        this.tipo = tipo;
    }

    // métodos getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}