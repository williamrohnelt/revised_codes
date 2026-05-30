package estruturaDeDadosI.pilha_stack.Exemplo_Pilha;

import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        // Criando a pilha de Strings
        Stack<String> livros = new Stack<>();

        // 1. Adicionando elementos (Push)
        livros.push("O Hobbit");
        livros.push("Dom Casmurro");
        livros.push("Java Como Programar");

        System.out.println("Pilha completa: " + livros);

        // 2. Espiando o topo (Peek)
        System.out.println("Elemento no topo: " + livros.peek());

        // 3. Removendo o elemento do topo (Pop)
        String removido = livros.pop();
        System.out.println("Livro removido: " + removido);

        // 4. Verificando o novo topo
        System.out.println("Novo topo após o pop: " + livros.peek());
        
        // 5. Verificando tamanho
        System.out.println("Tamanho da pilha: " + livros.size());
    }
}
