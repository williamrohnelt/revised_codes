package estruturaDeDadosI.pilha.testPilha_2;

import java.util.Stack;

public class Main { // Classe Main
    public static void main(String[] args) { // Método principal (Padrão).

        String palavra = "ESTRUTURA";
        // Pilha letras = new Pilha(palavra.length());

        Stack<Character> letras = new Stack<>();

        System.out.println("Palavra original: " + palavra);

        for (int i = 0; i < palavra.length(); i++) {
            letras.push(palavra.charAt(i));
        }

        System.out.print("Palavra invertida: ");

        while (!letras.isEmpty()) {
            System.out.print(letras.pop());
        }
        System.out.println("\n------------------------------");

        // Pilha historico = new Pilha(5);

        Stack<Integer> historico = new Stack<>();

        System.out.println("Navegando...");
        historico.push(101);
        historico.push(102);
        historico.push(103);

        System.out.println("Página atual (Topo): " + historico.peek());

        System.out.println("Clicou no botão VOLTAR...");
        historico.pop(); // Remove 103

        System.out.println("Nova página atual: " + historico.peek());
    }
}