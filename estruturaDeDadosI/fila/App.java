package estruturaDeDadosI.fila;

public class App {
    public static void main(String[] args) {

        Fila fila = new Fila(4); // criando uma fila

        System.out.println();

        // adicionando nodos no final da fila
        if (!fila.enfileirar(5)) {
            System.out.println("A fila atingiu o limite.");
        }
        if (!fila.enfileirar(10)) {
            System.out.println("A fila atingiu o limite.");
        }
            if (!fila.enfileirar(15)) {
            System.out.println("A fila atingiu o limite.");
        }
            if (!fila.enfileirar(20)) {
            System.out.println("A fila atingiu o limite.");
        }
            if (!fila.enfileirar(25)) {
            System.out.println("A fila atingiu o limite.");
        }

        System.out.println();

        // imprimindo a fila
        fila.imprimirFila();

        System.out.println();

        // removendo os nodos da fila
        int removido = fila.desenfileirar();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a fila já está vazia.");
        }

        // removendo os nodos da fila
        removido = fila.desenfileirar();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a fila já está vazia.");
        }

        // removendo os nodos da fila
        removido = fila.desenfileirar();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a fila já está vazia.");
        }

        // removendo os nodos da fila
        removido = fila.desenfileirar();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a fila já está vazia.");
        }

        // removendo os nodos da fila
        removido = fila.desenfileirar();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a fila já está vazia.");
        }

        System.out.println();

        fila.imprimirFila();
    }
}