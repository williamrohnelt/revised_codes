package programacao1.projetoFinal;

import java.util.ArrayList;

public class Curso {

    private String nomeCurso;
    private int numeroAulas;
    private String publicoAlvo;
    private int anoLancamento;
    private Instrutor instrutor;
    private ArrayList<Aula> listaAulas = new ArrayList<>();

    public Curso() {
    }

    public Curso(String nomeCurso, int numeroAulas, String publicoAlvo, int anoLancamento) {
        this.nomeCurso = nomeCurso;
        this.numeroAulas = numeroAulas;
        this.publicoAlvo = publicoAlvo;
        this.anoLancamento = anoLancamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        if (numeroAulas <= 0) {
            System.out.println("Erro");
        } else {
            this.numeroAulas = numeroAulas;
        }
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        // se publicoAlvo chegar como null, o .equals() lança um NullPointerException, a forma mais segura é colocar a String literal na frente
        // mesmo que publicoAlvo seja null, o código não quebra, esse padrão é chamado de Yoda Condition e é bastante comum em Java
        if ("iniciante".equals(publicoAlvo) || "experiente".equals(publicoAlvo)) {
            this.publicoAlvo = publicoAlvo;
        } else {
            System.out.println("Erro");
        }
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento < 1900) {
            System.out.println("Erro");
        } else {
            this.anoLancamento = anoLancamento;
        }
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void setAula(Aula aula) {
        this.listaAulas.add(aula);
    }

    public void setListaAulas(ArrayList<Aula> listaAula) {
        this.listaAulas = listaAula;
    }

    public ArrayList<Aula> getListAulas() {
        return listaAulas;
    }

    public void exibeAulas() {
        for (Aula a : listaAulas) {
            System.out.println("Aula " + a.getNumeroAula() + " Assunto: " + a.getAssunto() + " Horas: " + a.getTotalHoras());
        }
    }

    public void exibeCurso() {
        System.out.println("Curso: < " + nomeCurso + " > - < " + anoLancamento + " >");
        System.out.println("N° de aulas: < " + numeroAulas + " >");
        System.out.println("Público-alvo: < " + publicoAlvo + " >");
        System.out.println("Instrutor: < " + instrutor.getNomeInstrutor() + " > - < " + instrutor.getEmail() + " >");
        System.out.println("Aulas:");
        exibeAulas();
    }
}