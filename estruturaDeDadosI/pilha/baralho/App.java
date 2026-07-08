package estruturaDeDadosI.pilha.baralho;

public class App {
    public static void main(String[] args) {

        // criando uma pilha de tamanho 4
        Pilha pilha = new Pilha(4);

        // adicionando nodos no topo da pilha
        if (!pilha.push(5, "C")) {
            System.out.println("A pilha atingiu o limite.");
        }
        if (!pilha.push(8, "E")) {
            System.out.println("A pilha atingiu o limite.");
        }
        if (!pilha.push(9, "O")) {
            System.out.println("A pilha atingiu o limite.");
        }
        if (!pilha.push(2,"F")) {
            System.out.println("A pilha atingiu o limite.");
        }
        if (!pilha.push(3, "C")) {
            System.out.println("A pilha atingiu o limite.");
        }

        // imprimindo a pilha
        pilha.imprimirPilha();
        System.out.println();

        // removendo o nodo do topo da pilha
        Carta removido = pilha.pop();
        if (removido != null) {
            System.out.println("Nodo removido: " + removido.getNumero() + ":" + removido.getNaipe());
        } else {
            System.out.println("Nodo não removido, a pilha já está vazia.");
        }
        pilha.imprimirPilha();
    }
}