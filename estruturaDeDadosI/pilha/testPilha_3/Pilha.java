package estruturaDeDadosI.pilha.testPilha_3;

import java.util.Arrays;

public class Pilha {
    private String[] elementos = new String[5];
    private int topo = -1;

    public void push(String item) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = item;
        } else {
            System.out.println("Erro: A pilha está cheia!");
        }
    }

    public String pop() {
        if (topo == -1) {
            System.out.println("Erro: A pilha está vazia!");
            return null;
        }

        String valorRemovido = elementos[topo];
        elementos[topo] = null;
        topo--;
        return valorRemovido;
    }

    public String peek() {
        if (topo == -1) {
            System.out.println("Erro: A pilha está vazia!");
            return null;
        }
        return elementos[topo];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elementos, 0, topo + 1));
    }
}