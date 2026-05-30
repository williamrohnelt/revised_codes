package estruturaDeDadosI.pilha_stack.testPilha;

import java.util.Arrays;

public class Main { // Classe Main
    public static void main(String[] args) { // Método principal (Padrão).

        // 1. Criamos uma pilha com capacidade para 3 elementos
        Pilha /*(classe Pilha.java)*/ minhaPilha /*(nome da nova classe Pilha (cópia))*/ = new Pilha(3);

        System.out.println("--- INICIANDO INSERÇÕES (PUSH) ---");
        minhaPilha.push(10); // topo vira 0
        minhaPilha.push(20); // topo vira 1
        minhaPilha.push(30); // topo vira 2

        // Tentando inserir em uma pilha cheia
        minhaPilha.push(40); 

        System.out.println("\nElemento no topo agora (Peek): " + minhaPilha.peek());
        System.out.println("\nElemento no topo agora (usando o getTopo): " + minhaPilha.getTopo());

        System.out.println("Os valores da pilha são: " + Arrays.toString(minhaPilha.getPilha()));

        System.out.println("\n--- INICIANDO REMOÇÕES (POP) ---");
        
        // Vamos remover todos os elementos
        while (!minhaPilha.isEmpty()) {
            int removido = minhaPilha.pop();
            System.out.println("Removido: " + removido + " | Novo Topo: " + minhaPilha.getTopo());
        }

        // Tentando remover de uma pilha vazia
        minhaPilha.pop();
    }
}