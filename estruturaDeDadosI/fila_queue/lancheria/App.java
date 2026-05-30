package estruturaDeDadosI.fila_queue.lancheria;

public class App {

    public static void main(String[] args) {
        // criando uma fila
        Fila fila = new Fila(4);

        // adicionando Alunos no final da fila
        if (!fila.enfileirar(5, "John")) {
            System.out.println("A fila atingiu o limite.");
        }
        if (!fila.enfileirar(10, "Paul")) {
            System.out.println("A fila atingiu o limite.");
        }
        if (!fila.enfileirar(15, "George")) {
            System.out.println("A fila atingiu o limite.");
        }
        if (!fila.enfileirar(20,"Ringo")) {
            System.out.println("A fila atingiu o limite.");
        }
        if (!fila.enfileirar(25, "Pete")) {
            System.out.println("A fila atingiu o limite.");
        }

        // imprimindo a fila
        fila.imprimirFila();
        System.out.println();

        // removendo os Alunos da fila
        Aluno alunoRemovido = fila.desenfileirar();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getMatricula() + ": " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não removido, a fila já está vazia.");
        }

        // removendo os Alunos da fila
        alunoRemovido = fila.desenfileirar();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getMatricula() + ": " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não removido, a fila já está vazia.");
        }

        alunoRemovido = fila.desenfileirar();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getMatricula() + ": " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não removido, a fila já está vazia.");
        }

        alunoRemovido = fila.desenfileirar();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getMatricula() + ": " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não removido, a fila já está vazia.");
        }

        alunoRemovido = fila.desenfileirar();
        if (alunoRemovido != null) {
            System.out.println("Aluno removido: " + alunoRemovido.getMatricula() + ": " + alunoRemovido.getNome());
        } else {
            System.out.println("Aluno não removido, a fila já está vazia.");
        }
        fila.imprimirFila();
    }
}