package estruturaDeDadosI.pilha;

public class App {
    public static void main(String[] args) {
        // Criando uma pilha
        Pilha pilha = new Pilha(4);

        // Adicionando nodos no topo da pilha
        if (!pilha.push(5)) {
            System.out.println("A pilha atingiu o limite.");
        }

        if (!pilha.push(8)) {
            System.out.println("A pilha atingiu o limite.");
        }

        if (!pilha.push(9)) {
            System.out.println("A pilha atingiu o limite.");
        }

        if (!pilha.push(2)) {
            System.out.println("A pilha atingiu o limite.");
        }

        if (!pilha.push(3)) {
            System.out.println("A pilha atingiu o limite.");
        }

        // Imprimindo a pilha
        pilha.imprimirPilha();
        System.out.println();

        // Removendo o nodo do topo da pilha
        int removido = pilha.pop();
        if (removido != -1) {
            System.out.println("Nodo removido: " + removido);
        } else {
            System.out.println("Nodo não removido, a pilha já está vazia.");
        }
        pilha.imprimirPilha();

        // Elemento no topo da pilha
        int topo = pilha.buscarTopo();
        if (topo != -1) {
            System.out.println("\nNodo no topo: " + topo);
        }
    }
}