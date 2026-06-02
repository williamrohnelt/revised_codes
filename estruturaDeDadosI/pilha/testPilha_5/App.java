package estruturaDeDadosI.pilha.testPilha_5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pilha pilha = new Pilha(4);

        System.out.println();

        // Adicionando nodos no topo da pilha
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int valor = teclado.nextInt();

            if (!pilha.push(valor)) {
                System.out.println("A pilha atingiu o limite.");
            }
        }

        System.out.println();

        // Imprimindo a pilha
        System.out.println("Números da pilha: ");
        pilha.imprimirPilha();

        teclado.close();

        System.out.println();

        // Removendo o nodo do topo da pilha
        int removido = pilha.pop();
        if (removido != -1)
            System.out.println("Nodo removido: " + removido);
        else
            System.out.println("Nodo não removido, a pilha já está vazia.");

        System.out.println();

        System.out.println("Números da pilha após o método pop(): ");
        pilha.imprimirPilha();

        System.out.println();

        // Elemento no topo da pilha
        int topo = pilha.buscarTopo();
        if (topo != -1)
            System.out.println("O número " + topo + " está no topo da pilha.");

        System.out.println();
    }
}
