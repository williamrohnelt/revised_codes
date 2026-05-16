public class Aula {

    private int numeroAula;
    private String assunto;
    private int totalHoras;

    public Aula() {
    }

    public Aula(int numeroAula, String assunto, int totalHoras) {
        this.numeroAula = numeroAula;
        this.assunto = assunto;
        this.totalHoras = totalHoras;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public void exibeEstado() {
    }
}