public class Instrutor {

    // atributes
    private String nomeInstrutor;
    private String email;
    private Curso curso; // atributo curso, que referencia a class Curso

    // método construtor default
    public Instrutor() {
    }

    public Instrutor(String nomeInstrutor, String email) {
        this.nomeInstrutor = nomeInstrutor;
        this.email = email;
    }

    // getters and setters
    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}